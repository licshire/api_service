package com.wechat.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wechat.dao.SyslibDAO;
import com.wechat.hibernate.pojo.Syslib;
import com.wechat.service.SyslibService;

@Service("SyslibService")
@Transactional
public class SyslibServiceImpl implements SyslibService {
	@Autowired
	SyslibDAO syslibDAO;
	public List getSyslibDataByRow(int pcode){
		List list=new ArrayList();
		List _temp_rcode=new ArrayList();
		List _temp_rname=new ArrayList();
		List<Syslib> _list=syslibDAO.getSyslibData(pcode);
		for(int i=0;i<_list.size();i++){
			if(_list.get(i).getRcode()!=1499){
				_temp_rcode.add(_list.get(i).getRcode());
				_temp_rname.add(_list.get(i).getRname());
			}
		}
		list.add(_temp_rcode);
		list.add(_temp_rname);
		return list;
	}
	
	public List getSyslibDataByCol(int pcode){
		List<Syslib> list=syslibDAO.getSyslibData(pcode);
		return list;
	}
}
