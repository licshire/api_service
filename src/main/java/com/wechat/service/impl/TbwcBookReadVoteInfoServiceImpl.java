package com.wechat.service.impl;

import com.wechat.dao.TbwcBookReadVoteInfoDAO;
import com.wechat.hibernate.pojo.Tbwcbookreadvoteinfo;
import com.wechat.service.TbwcBookReadVoteInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Pettyfer on 2017/3/25.
 */

@Service("TbwcweChatVoteControlService")
@Transactional
public class TbwcBookReadVoteInfoServiceImpl implements TbwcBookReadVoteInfoService {

    @Autowired
    TbwcBookReadVoteInfoDAO tbwcweChatVoteControlDAO;

    public int savaVoteInfo(String openid, String tsm5, String classify) {
        String uuid = java.util.UUID.randomUUID().toString().replace(
                "-", "");
        Tbwcbookreadvoteinfo tbwcbookreadvoteinfo = new Tbwcbookreadvoteinfo();
        tbwcbookreadvoteinfo.setTplx(952601);
        tbwcbookreadvoteinfo.setTprwx(openid);
        tbwcbookreadvoteinfo.setTprq(new Date(System.currentTimeMillis()));
        tbwcbookreadvoteinfo.setFktsm5(tsm5);
        tbwcbookreadvoteinfo.setTsm5(uuid);
        tbwcbookreadvoteinfo.setTsm1(classify);
        tbwcbookreadvoteinfo.setRecorddt(new Timestamp(System.currentTimeMillis()));
        return tbwcweChatVoteControlDAO.saveData(tbwcbookreadvoteinfo);
    }

    public String getVote(String openid, String tsm5, String classify) {
        String result = "Success";
        List<Tbwcbookreadvoteinfo> tbwcbookreadvoteinfoList = tbwcweChatVoteControlDAO.getDataListByOpenid(openid);
        /*if(tbwcweChatVoteControlDAO.getDataListBySum(openid, classify, tsm5).size()>=10){
            result = "每人每组最多给十本不同的书投票。";
        }else{*/
            if (tbwcbookreadvoteinfoList.size() >= 30) {
                result = "当日投票次数达到上限！\t每人每日可以有三十次投票操作。";
            } else {
                if (tbwcweChatVoteControlDAO.getDataListByOneBook(openid, classify, tsm5).size() >= 1) {
                    result = "每人每日只可以对同一本书进行一次投票操作。";
                } else {
                    if (tbwcweChatVoteControlDAO.getDataListByClassify(openid, classify, tsm5).size() >= 10) {
                        result = "每人每日在同一组书籍中只能投十票。";
                    }
                }
            }
        /*}*/


        return result;
    }
}
