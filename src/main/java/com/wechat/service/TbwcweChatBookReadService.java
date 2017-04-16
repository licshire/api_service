package com.wechat.service;

import java.util.List;

public interface TbwcweChatBookReadService {
	public List getData(int pageNo,Integer classify);

	public int updateData(String tsm5);
}
