package com.wechat.service;

/**
 * Created by Pettyfer on 2017/3/25.
 */
public interface TbwcBookReadVoteInfoService {
    public int savaVoteInfo(String openid,String tsm5,String classify);

    public String getVote(String openid,String tsm5,String classify);
}
