package com.wechat.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wechat.hibernate.pojo.Syslib;

@Repository
public class SyslibDAO {
	@Autowired
	SessionFactory sessionFactory;
	public List getSyslibData(int pcode){
		String sql = "from Syslib where pcode='"+pcode+"'";
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery(sql);
		List<Syslib> list=query.list();
		return list;
	}
}
