package com.wechat.controller;

import java.io.IOException;
import java.io.PrintWriter;


import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wechat.common.ResponseUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class BaseController {
protected Logger logger = LoggerFactory.getLogger(getClass());
	
	/**
	 * 打印xml数据
	 * @param xml
	 * @param response
	 */
	public void printXmlData(String xml,HttpServletResponse response){
		
		ResponseUtils.setXmlAjaxResponseHeader(response); 
		
		PrintWriter pw;
		try {
			pw = response.getWriter();
			pw.print(xml);   
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}    
	}
	/**
	 * 打印text数据
	 * @param xml
	 * @param response
	 */
	public void printTextData(String text,HttpServletResponse response){
		
		ResponseUtils.setTextAjaxResponseHeader(response); 
		PrintWriter pw;
		try {
			response.setHeader("Access-Control-Allow-Origin", "*");
			pw = response.getWriter();
			pw.print(text);   
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}    
	}
	
	/**
	 * 打印json数据
	 * @param xml
	 * @param response
	 */
	public void printJsonData(String json,HttpServletResponse response){
		
		ResponseUtils.setJsonAjaxResponseHeader(response); 
		
		PrintWriter pw;
		try {
			pw = response.getWriter();
			pw.print(json);
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}    
	}

	public void printJSONData(String json, HttpServletRequest request, HttpServletResponse response){

		ResponseUtils.setJsonAjaxResponseHeader(response);
		
		PrintWriter pw;
		try {
			response.setHeader("Access-Control-Allow-Origin", "*");
			pw = response.getWriter();
			JSONObject obj=new JSONObject();
			obj.put("result", json);
			pw.print(obj);
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}    
	}
}
