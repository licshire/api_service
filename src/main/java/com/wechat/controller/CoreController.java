package com.wechat.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wechat.hibernate.pojo.AppUser;
import com.wechat.service.*;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wechat.common.CustomizedPropertyPlaceholderConfigurer;
import com.wechat.common.HttpUtil;

@Controller
@RequestMapping("/core")
public class CoreController extends BaseController {
	@Autowired
	SyslibService syslibService;
	@Autowired
	WechatUserService wechatUserService;
	@Autowired
	TbwcweChatBookReadService tbwcweChatBookReadService;
	@Autowired
    TbwcBookReadVoteInfoService tbwcBookReadVoteInfoService;

	/**
	 * @author Petty
	 * @see '与微信通信获取openid与用户基础信息'
	 * @param session
	 * @param request
	 * @param response
	 */
	@RequestMapping(value="/getWechatData",method=RequestMethod.GET)
	@ResponseBody
	public void getWechatData(HttpSession session, HttpServletRequest request, HttpServletResponse response){
				String get_access_token_url = "https://api.weixin.qq.com/sns/oauth2/access_token?"
						+ "appid=APPID"
						+ "&secret=SECRET&"
						+ "code=CODE&grant_type=authorization_code";
				String get_userinfo_base = "https://api.weixin.qq.com/sns/userinfo?access_token=ACCESS_TOKEN&openid=OPENID&lang=zh_CN";
				try {

					request.setCharacterEncoding("UTF-8");
					response.setCharacterEncoding("UTF-8");
					String code = request.getParameter("code");
					String type = request.getParameter("type");

					get_access_token_url = get_access_token_url.replace("APPID",CustomizedPropertyPlaceholderConfigurer.getContextProperty("AppID").toString());
					get_access_token_url = get_access_token_url.replace("SECRET",CustomizedPropertyPlaceholderConfigurer.getContextProperty("AppSecret").toString());
					get_access_token_url = get_access_token_url.replace("CODE", code);

					String json = HttpUtil.getUrl(get_access_token_url);

					JSONObject jsonObject = JSONObject.fromObject(json);
					String access_token = jsonObject.getString("access_token");
					String openid = jsonObject.getString("openid");

					get_userinfo_base = get_userinfo_base.replace("ACCESS_TOKEN", access_token);
					get_userinfo_base = get_userinfo_base.replace("OPENID", openid);

					String userInfoJson = HttpUtil.getUrl(get_userinfo_base);

					JSONObject userInfoJO = JSONObject.fromObject(userInfoJson);

					String user_openid = userInfoJO.getString("openid");
					String user_nickname = userInfoJO.getString("nickname");
					String user_sex = userInfoJO.getString("sex");
					String user_province = userInfoJO.getString("province");
					String user_city = userInfoJO.getString("city");
					String user_country = userInfoJO.getString("country");
					String user_headimgurl = userInfoJO.getString("headimgurl");


					System.out.println("openid:"+user_openid);
					System.out.println("nichname:"+user_nickname);
					System.out.println("sex:"+user_sex);
					System.out.println("province:"+user_province);
					System.out.println("city:"+user_city);
					System.out.println("country:"+user_country);
					System.out.println("headimgurl:"+user_headimgurl);
					System.out.println("type:"+type);

					System.out.println("path:"+request.getContextPath());
					response.sendRedirect(CustomizedPropertyPlaceholderConfigurer.getContextProperty("RedirectURL").toString()+"/index.html?un="+user_nickname+"&uid="+user_openid+"&uimg="+user_headimgurl+"&type="+type);

				} catch (Exception e) {
					// TODO: handle exception
					logger.error(e.getMessage(), e);
					e.printStackTrace();
				}
	}


	/*
	 * 获取用户信息
	 */
	@RequestMapping(value="/getUserinfo",method=RequestMethod.POST)
	@ResponseBody
	public void getUserinfo(HttpSession session, HttpServletRequest request, HttpServletResponse response) throws InterruptedException{
		String wx_id=request.getParameter("wx_id");
		AppUser appUser=wechatUserService.getUserinfo(wx_id);
		if(appUser!=null){
			JSONObject jobj=JSONObject.fromObject(appUser);
			this.printJSONData(jobj.toString(), request, response);
		}else{
			this.printTextData("Don't Find User", response);
		}
	}

	/*
	 * 获取字典表（行数据）
	 * Picker数据来源
	 */
	@RequestMapping(value="/getSyslibDataByRow",method=RequestMethod.POST)
	@ResponseBody
	public void getSyslibDataByRow(HttpSession session, HttpServletRequest request, HttpServletResponse response) throws InterruptedException{
		String pcode=request.getParameter("pcode");
		List list=syslibService.getSyslibDataByRow(Integer.valueOf(pcode));
		JSONArray jarr=JSONArray.fromObject(list);
		this.printJSONData(jarr.toString(), request, response);
	}

	/*
	 * 获取书籍信息
	 */
	@RequestMapping(value="/getBookList",method=RequestMethod.POST)
	@ResponseBody
	public void getBookList(HttpSession session, HttpServletRequest request, HttpServletResponse response) throws InterruptedException{
		Integer classify=0;
		String tabname=request.getParameter("tabName");
		String pageNo=request.getParameter("pageNo");
		if("tab_politics".equals(tabname)){
			classify = 9101;
		}else if("tab_history".equals(tabname)){
			classify = 9102;
		}else if("tab_art".equals(tabname)){
			classify = 9103;
		}
		List list=tbwcweChatBookReadService.getData(Integer.valueOf(pageNo),classify);
		JSONArray arr=JSONArray.fromObject(list);
		this.printJSONData(arr.toString(), request, response);
	}

	/*
	 * 获取书籍信息
	 */
	@RequestMapping(value="/updateBookInfo",method=RequestMethod.POST)
	@ResponseBody
	public void updateBookInfo(HttpSession session, HttpServletRequest request, HttpServletResponse response) throws InterruptedException{
		String tsm5=request.getParameter("tsm5");
		String openid=request.getParameter("openid");
		String classify=request.getParameter("classify");
		String result = tbwcBookReadVoteInfoService.getVote(openid,tsm5,classify);
		if(result.equals("Success")){
			if(tbwcweChatBookReadService.updateData(tsm5)==1){
				tbwcBookReadVoteInfoService.savaVoteInfo(openid,tsm5,classify);
			}
		}
		this.printJSONData(result, request, response);
	}
}
