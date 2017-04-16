package com.wechat.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

public interface SyslibService {
	public List getSyslibDataByRow(int pcode);
	public List getSyslibDataByCol(int pcode);
}
