package com.wechat.dao;

import java.util.List;

import com.wechat.hibernate.pojo.Tbwcbookread;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TbwcweChatBookReadDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	public List<Tbwcbookread> getDataList(int pageNo, Integer classify){
		int pageSize=9*(pageNo-1);	
		String sql = "select top 9 * from Tbwcbookread where rid not in (select top "+pageSize+" rid from Tbwcbookread where classify = '"+classify+"' and isvalid='1501' order by like_num desc) and classify = '"+classify+"' and isvalid='1501' order by like_num desc";
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createSQLQuery(sql).addEntity(Tbwcbookread.class);
		List<Tbwcbookread> list=query.list();
		return list;
	}

	public Tbwcbookread getData(String token){
		Tbwcbookread tbwcbookread = null;
		String hql = "from Tbwcbookread where tsm5 = :tsm5";
		Session session=sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setParameter("tsm5",token);
		List<Tbwcbookread> tbwcbookreadList = query.list();
		if(tbwcbookreadList.size()>=1){
			tbwcbookread = tbwcbookreadList.get(0);
		}
		return tbwcbookread;
	}

	public int updateData(Tbwcbookread tbwcbookread){
		Session session=sessionFactory.getCurrentSession();
		session.update(tbwcbookread);
		return 1;
	}
}
