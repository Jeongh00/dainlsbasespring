package com.dainls.base.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.application.ProtectedViewException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dainls.base.dao.ICommonDao;
import com.dainls.base.dto.SearchDTO;
import com.dainls.base.global.BaseService;
import com.dainls.base.global.DaoKeyword;
import com.dainls.base.global.MenuKeyword;

import egovframework.example.sample.service.impl.EgovSampleServiceImpl;

@Service("userAdminService")
public class UserAdminServiceImpl extends BaseService implements IUserAdminService{

	private static final Logger LOGGER = LoggerFactory.getLogger(UserAdminServiceImpl.class);
	
	@Autowired
	private ICommonDao commonDao;
	
	private static final String COMMON_TYPE ="ADMIN";
	
	private static final String ADMIN_ADMIN_MAIN_KEYWORD = MenuKeyword.ADMIN_ADMIN_MAIN;
	
	public HashMap<String, Object> paramMap;
	
	public HashMap<String, Object> result;

	@SuppressWarnings("unchecked")
	@Override
	public HashMap<String, Object> list(String paramText) {
		System.out.println("bbbbbbbbbbbbbbbbbb");
		paramMap = getParamMap(paramText, false);
		List<Map<String, Object>> list = (List<Map<String, Object>>) commonDao.list(paramMap, ADMIN_ADMIN_MAIN_KEYWORD, DaoKeyword.COMMON_LIST);
		int totalCount = commonDao.totalCount(paramMap, ADMIN_ADMIN_MAIN_KEYWORD, DaoKeyword.COMMON_TOTALCOUNT);
		
		return getList(list, totalCount);
	}

	@Override
	public HashMap<String, Object> detail(String paramText) {
		
		return null;
	}

	@Override
	public int create(String paramText) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(String paramText) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
