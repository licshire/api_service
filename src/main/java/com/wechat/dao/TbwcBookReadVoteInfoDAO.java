package com.wechat.dao;

import com.wechat.hibernate.pojo.Tbwcbookreadvoteinfo;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by Pettyfer on 2017/3/25.
 */
@Repository
public class TbwcBookReadVoteInfoDAO {
    @Autowired
    SessionFactory sessionFactory;



    public List<Tbwcbookreadvoteinfo> getDataListByOpenid(String openid){

        String hql="from Tbwcbookreadvoteinfo where tprwx = :openid and tprq between :start_time and :end_time";
        Query<Tbwcbookreadvoteinfo> query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("openid",openid);
        query.setParameter("start_time",getStartTime());
        query.setParameter("end_time",getEndTime());
        List<Tbwcbookreadvoteinfo> list_temp = query.list();
        return list_temp;
    }

    public List<Tbwcbookreadvoteinfo> getDataListByOneBook(String openid,String classify,String tsm5){
        String hql="select A from Tbwcbookreadvoteinfo A,Tbwcbookread B where A.fktsm5 = B.tsm5 and A.tsm1 = :classify and A.tprwx = :openid and A.fktsm5 =:tsm5 and A.tprq between :start_time and :end_time";
        Query<Tbwcbookreadvoteinfo> query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("classify",classify);
        query.setParameter("openid",openid);
        query.setParameter("tsm5",tsm5);
        query.setParameter("start_time",getStartTime());
        query.setParameter("end_time",getEndTime());
        List<Tbwcbookreadvoteinfo> list_temp = query.list();
        return list_temp;
    }

    public List<Tbwcbookreadvoteinfo> getDataListByClassify(String openid,String classify,String tsm5){
        String hql="select A from Tbwcbookreadvoteinfo A,Tbwcbookread B where A.fktsm5 = B.tsm5 and A.tsm1 = :classify and A.tprwx = :openid and A.tprq between :start_time and :end_time";
        Query<Tbwcbookreadvoteinfo> query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("classify",classify);
        query.setParameter("openid",openid);
        query.setParameter("start_time",getStartTime());
        query.setParameter("end_time",getEndTime());
        List<Tbwcbookreadvoteinfo> list_temp = query.list();
        return list_temp;
    }

    public List<Tbwcbookreadvoteinfo> getDataListBySum(String openid,String classify,String tsm5){
        String hql="from Tbwcbookreadvoteinfo where tprwx = :openid and tsm1=:classify";
        Query<Tbwcbookreadvoteinfo> query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("openid",openid);
        query.setParameter("classify",classify);
        List<Tbwcbookreadvoteinfo> list_temp = query.list();
        return list_temp;
    }

    public int saveData(Tbwcbookreadvoteinfo tbwcbookreadvoteinfo){
        int result_id=1;
        try {
            sessionFactory.getCurrentSession().save(tbwcbookreadvoteinfo);
        }catch (Exception e){
            result_id=0;
        }
        return result_id;
    }

    private static Date getStartTime(){
        Calendar c1 = new GregorianCalendar();
        c1.set(Calendar.HOUR_OF_DAY, 0);
        c1.set(Calendar.MINUTE, 0);
        c1.set(Calendar.SECOND, 0);
        Date start_time = c1.getTime();
        return start_time;
    }

    private static Date getEndTime(){
        Calendar c2 = new GregorianCalendar();
        c2.set(Calendar.HOUR_OF_DAY, 23);
        c2.set(Calendar.MINUTE, 59);
        c2.set(Calendar.SECOND, 59);
        Date end_time = c2.getTime();
        return end_time;
    }
}
