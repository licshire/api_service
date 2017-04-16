package com.wechat.service.impl;

import java.util.List;

import com.wechat.hibernate.pojo.Tbwcbookread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wechat.dao.TbwcweChatBookReadDAO;
import com.wechat.service.TbwcweChatBookReadService;

@Service("TbwcweChatBookReadService")
@Transactional
public class TbwcweChatBookReadServiceImpl implements TbwcweChatBookReadService {

	@Autowired
	TbwcweChatBookReadDAO tbwcweChatBookReadDAO;

	public List getData(int pageNo,Integer classify) {
		// TODO Auto-generated method stub
		List<Tbwcbookread> list=tbwcweChatBookReadDAO.getDataList(pageNo,classify);
		return list;
	}

	public int updateData(String tsm5) {
		Tbwcbookread tbwcweChatBookRead = tbwcweChatBookReadDAO.getData(tsm5);
		tbwcweChatBookRead.setLikeNum(tbwcweChatBookRead.getLikeNum()+1);
		tbwcweChatBookReadDAO.updateData(tbwcweChatBookRead);
		return 1;
	}
}
