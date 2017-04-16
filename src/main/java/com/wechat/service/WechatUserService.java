package com.wechat.service;

import com.wechat.hibernate.pojo.AppUser;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

public interface WechatUserService {
	public AppUser getUserinfo(String wx_id);
}
