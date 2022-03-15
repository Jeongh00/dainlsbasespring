package com.dainls.base.global;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dainls.base.dto.SearchDTO;
import com.google.gson.Gson;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

public class BaseService extends EgovAbstractServiceImpl{
	
	@SuppressWarnings("unchecked")
	public HashMap<String, Object> getParamMap(String paramText, boolean isPager){
		Gson gson = new Gson();	
		HashMap<String, Object> paramMap = gson.fromJson(paramText, HashMap.class);
	
		int pageNo = (int) paramMap.get(DaoKeyword.PAGING_PAGENO);
		int pageSize = (int) paramMap.get(DaoKeyword.PAGING_PAGESIZE);
		
		if(isPager) addPageIndex(paramMap, pageNo, pageSize); 
		return paramMap;
	}
	
	public HashMap<String, Object> getParamMapAsSearchDTO(String paramText){
		
		Gson gson = new Gson();	
		HashMap<String, Object> paramMap = new HashMap<>();
		SearchDTO param = gson.fromJson(paramText, SearchDTO.class);
		Object value = new Object();
		
		
		for(Field field : param.getClass().getDeclaredFields()) {
			 try {
				 
				 String _key = field.getName();
				 value = field.get(param);
				 paramMap.put(_key, value);
			
			 } catch (IllegalArgumentException e) {
				e.printStackTrace();
			 } catch (IllegalAccessException e) {
				e.printStackTrace();
			 }
		 }
		
		return paramMap;
	}
	
	
	public HashMap<String, Object> getList(List<Map<String, Object>> list, int totalCount){
		
		HashMap<String, Object> paramMap = new HashMap<>();
		paramMap.put(DaoKeyword.COMMON_LIST, list);
		paramMap.put(DaoKeyword.COMMON_TOTALCOUNT, totalCount);
		
		return paramMap;
	}
	
	
	 protected void addPageIndex(HashMap<String,Object> paramHash, int pageNum, int rowSize)
	 {
			 pageNum=pageNum==0?1:pageNum;
			 rowSize=rowSize==0?100:rowSize;
			 int firstIndex = (pageNum - 1) * rowSize ;
	     //   int lastIndex = firstIndex + rowSize - 1;
			 
			 int lastIndex = rowSize;

	        //firstIndex=firstIndex<=0?0:firstIndex;
	        paramHash.put("FirstIndex", firstIndex);
	        paramHash.put("LastIndex", lastIndex);
	  }

}
