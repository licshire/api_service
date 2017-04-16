package com.wechat.service.impl;


import com.wechat.hibernate.pojo.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wechat.dao.WechatUserDAO;
import com.wechat.service.WechatUserService;

@Service("WechatUserService")
@Transactional
public class WechatUserServiceImpl implements WechatUserService {
	@Autowired
	WechatUserDAO wechatUserDAO;
	public AppUser getUserinfo(String wx_id){
		AppUser appUser=wechatUserDAO.getUserinfo(wx_id);
		return appUser;
	}
}
