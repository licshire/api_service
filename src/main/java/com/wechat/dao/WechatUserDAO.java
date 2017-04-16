package com.wechat.dao;

import com.wechat.hibernate.pojo.AppUser;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class WechatUserDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	public AppUser getUserinfo(String wx_id){
		String hql = "from AppUser where wxId='"+wx_id+"'";
		Object o=sessionFactory.getCurrentSession().createQuery(hql).uniqueResult();
		AppUser user=(AppUser)o;
		return user;
	}
}
