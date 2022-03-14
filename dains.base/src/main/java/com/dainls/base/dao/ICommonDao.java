package com.dainls.base.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dainls.base.dto.SearchDTO;

public interface ICommonDao {

	public List<?> list(HashMap<String, Object> paramMap, String menuKeyword, String DaoKeyword);

	public List<?> list(SearchDTO paramMap, String menuKeyword, String DaoKeyword);
	
	public int totalCount(HashMap<String, Object> paramMap, String menuKeyword, String DaoKeyword);
	
	public int totalCount(SearchDTO paramMap, String menuKeyword, String DaoKeyword);

	public HashMap<String, Object> detail(HashMap<String, Object> paramMap, String menuKeyword, String DaoKeyword);

	public HashMap<String, Object> detail(SearchDTO paramMap, String menuKeyword, String DaoKeyword);

	public int create(HashMap<String, Object> paramMap, String menuKeyword, String DaoKeyword);

	public int create(SearchDTO paramMap, String menuKeyword, String DaoKeyword);

	public boolean isCreate(HashMap<String, Object> paramMap, String menuKeyword, String DaoKeyword);

	public boolean isCreate(SearchDTO paramMap, String menuKeyword, String DaoKeyword);

	public void voidCreate(HashMap<String, Object> paramMap, String menuKeyword, String DaoKeyword);

	public void voidCreate(SearchDTO paramMap, String menuKeyword, String DaoKeyword);

	public int update(HashMap<String, Object> paramMap, String menuKeyword, String DaoKeyword);

	public int update(SearchDTO paramMap, String menuKeyword, String DaoKeyword);

	public boolean isUpdate(HashMap<String, Object> paramMap, String menuKeyword, String DaoKeyword);

	public boolean isUpdate(SearchDTO paramMap, String menuKeyword, String DaoKeyword);

	public void voidUpdate(HashMap<String, Object> paramMap, String menuKeyword, String DaoKeyword);

	public void voidUpdate(SearchDTO paramMap, String menuKeyword, String DaoKeyword);

}
