package com.dainls.base.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dainls.base.dao.ICommonDao;
import com.dainls.base.dto.SearchDTO;
import com.dainls.base.global.BaseService;
import com.dainls.base.global.MenuKeyword;

import egovframework.example.sample.service.impl.EgovSampleServiceImpl;

@Service("userService")
public class UserAdminService extends BaseService implements IUserAdminService{

	private static final Logger LOGGER = LoggerFactory.getLogger(UserAdminService.class);
	
	@Autowired
	private ICommonDao commonDao;
	
	private static final String COMMON_TYPE ="ADMIN";
	
	private static final String ADMIN_ADMIN_MAIN_KEYWORD = MenuKeyword.ADMIN_ADMIN_MAIN;

	
	@Override
	public List<?> list(HashMap<String, Object> paramMap) {
		String _map = (String) paramMap.get("param");
		
		System.out.println(_map);
		/*
		paramMap.put("type", "admin");
		
		@SuppressWarnings("unchecked")
		List<HashMap<String, Object>> _list = (List<HashMap<String, Object>>) commonDao.list(paramMap, ADMIN_ADMIN_MAIN_KEYWORD, DaoKeyword.COMMON_LIST);
		List<HashMap<String, Object>> list = new ArrayList<>();
		String _type = (String) paramMap.get(COMMON_TYPE);
		if(COMMON_TYPE.equals(_type)) {
			for(int i =0; i<_list.size(); i++) {
				list.add(_list.get(i));
			}	
		}else {
			_list = list;
		}
	
		
		return list;*/
		return null;
	}

	@Override
	public HashMap<String, Object> detail(HashMap<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int create(SearchDTO paramMap) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(SearchDTO paramMap) {
		// TODO Auto-generated method stub
		return 0;
	}

}
