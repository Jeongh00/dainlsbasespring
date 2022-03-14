package com.dainls.base.service;

import java.util.HashMap;
import java.util.List;

import com.dainls.base.dto.SearchDTO;

public interface IUserAdminService {

	public List<?> list(HashMap<String, Object> paramMap);

	public HashMap<String, Object> detail(HashMap<String, Object> paramMap);

	public int create(SearchDTO paramMap);

	public int update(SearchDTO paramMap);

}
