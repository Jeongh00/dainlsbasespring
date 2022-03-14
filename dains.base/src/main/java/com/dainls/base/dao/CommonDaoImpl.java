package com.dainls.base.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import com.dainls.base.dto.SearchDTO;
import com.dainls.base.global.BaseDao;
import com.dainls.base.global.SysKeyword;

import org.apache.ibatis.session.SqlSession;


/**
 * @author test
 *
 * @FILENAME : CommonDaoImpl.java
 * @PROJECT : dains.base
 * @DATE : 2022. 3. 11.
 * @USER : test
 * @CHANGELOG : 오후 3:50:24
 * @SUBJECT : 
 */


@Repository("commonDao") @Primary
public class CommonDaoImpl extends BaseDao implements ICommonDao{
	
	protected String result = "";
	public static final int COMMON_UPDATE_NUMBER_DAO = SysKeyword.COMMON_UPDATE_NUMBER;
	
	public CommonDaoImpl(SqlSession sqlSession) {
		super(sqlSession);
	}

	/**
	 * @param paramMap
	 * @param menuKeyword
	 * @param DaoKeyword
	 * @return List<?>
	 * @FILENAME : CommonDaoImpl.java
	 * @PROJECT : dains.base
	 * @DATE : 2022. 3. 11.
	 * @USER : test
	 * @CHANGELOG : 오후 3:54:32
	 * @METHOD : 
	 * 
	 */
	@Override        
	public List<?> list(HashMap<String, Object> paramMap, String menuKeyword, String DaoKeyword) {		
		result = getLocation(menuKeyword, DaoKeyword);
		return selectList(result, paramMap);
	}

	/**
	 * @param paramMap
	 * @param menuKeyword
	 * @param DaoKeyword
	 * @return List<?>
	 * @FILENAME : CommonDaoImpl.java
	 * @PROJECT : dains.base
	 * @DATE : 2022. 3. 11.
	 * @USER : test
	 * @CHANGELOG : 오후 3:54:52
	 * @METHOD : 
	 * 
	 */
	@Override
	public List<?> list(SearchDTO paramMap, String menuKeyword, String DaoKeyword) {
		result = getLocation(menuKeyword, DaoKeyword);
		return selectList(result, paramMap);
	}
	
	@Override
	public int totalCount(HashMap<String, Object> paramMap, String menuKeyword, String DaoKeyword) {
		result = getLocation(menuKeyword, DaoKeyword);
		return (int) selectOne(result, paramMap);
	}

	
	@Override
	public int totalCount(SearchDTO paramMap, String menuKeyword, String DaoKeyword) {
		result = getLocation(menuKeyword, DaoKeyword);
		return (int) selectOne(result, paramMap);
	}

	/**
	 * @param paramMap
	 * @param menuKeyword
	 * @param DaoKeyword
	 * @return HashMap<String, Object>
	 * @FILENAME : CommonDaoImpl.java
	 * @PROJECT : dains.base
	 * @DATE : 2022. 3. 11.
	 * @USER : test
	 * @CHANGELOG : 오후 3:55:03
	 * @METHOD : 
	 * 
	 */
	@SuppressWarnings("unchecked")
	@Override
	public HashMap<String, Object> detail(HashMap<String, Object> paramMap, String menuKeyword, String DaoKeyword) {
		result = getLocation(menuKeyword, DaoKeyword);
		return (HashMap<String, Object>) selectOne(result, paramMap);
	}

	/**
	 * @param paramMap
	 * @param menuKeyword
	 * @param DaoKeyword
	 * @return  HashMap<String, Object>
	 * @FILENAME : CommonDaoImpl.java
	 * @PROJECT : dains.base
	 * @DATE : 2022. 3. 11.
	 * @USER : test
	 * @CHANGELOG : 오후 3:55:00
	 * @METHOD : 
	 * 
	 */
	@SuppressWarnings("unchecked")
	@Override
	public HashMap<String, Object> detail(SearchDTO paramMap, String menuKeyword, String DaoKeyword) {
		result = getLocation(menuKeyword, DaoKeyword);
		return (HashMap<String, Object>) selectOne(result, paramMap);
	}

	/**
	 * @param paramMap
	 * @param menuKeyword
	 * @param DaoKeyword
	 * @return 0~99
	 * @FILENAME : CommonDaoImpl.java
	 * @PROJECT : dains.base
	 * @DATE : 2022. 3. 11.
	 * @USER : test
	 * @CHANGELOG : 오후 3:55:09
	 * @METHOD : 
	 * 
	 */
	@Override
	public int create(HashMap<String, Object> paramMap, String menuKeyword, String DaoKeyword) {
		result = getLocation(menuKeyword, DaoKeyword);
		return update(result, paramMap);
	}

	/**
	 * @param paramMap
	 * @param menuKeyword
	 * @param DaoKeyword
	 * @return 0~99
	 * @FILENAME : CommonDaoImpl.java
	 * @PROJECT : dains.base
	 * @DATE : 2022. 3. 11.
	 * @USER : test
	 * @CHANGELOG : 오후 3:55:12
	 * @METHOD : 
	 * 
	 */
	@Override
	public int create(SearchDTO paramMap, String menuKeyword, String DaoKeyword) {
		result = getLocation(menuKeyword, DaoKeyword);
		return update(result, paramMap);
	}

	/**
	 * @param paramMap
	 * @param menuKeyword
	 * @param DaoKeyword
	 * @return true, false
	 * @FILENAME : CommonDaoImpl.java
	 * @PROJECT : dains.base
	 * @DATE : 2022. 3. 11.
	 * @USER : test
	 * @CHANGELOG : 오후 3:55:16
	 * @METHOD : 
	 * 
	 */
	@Override
	public boolean isCreate(HashMap<String, Object> paramMap, String menuKeyword, String DaoKeyword) {
		result = getLocation(menuKeyword, DaoKeyword);
		int _result = update(result, paramMap); 
		boolean result = (_result ==  COMMON_UPDATE_NUMBER_DAO) ? true : false;
		return result;
	}

	/**
	 * @param paramMap
	 * @param menuKeyword
	 * @param DaoKeyword
	 * @return true, false
	 * @FILENAME : CommonDaoImpl.java
	 * @PROJECT : dains.base
	 * @DATE : 2022. 3. 11.
	 * @USER : test
	 * @CHANGELOG : 오후 3:57:11
	 * @METHOD : 
	 * 
	 */
	@Override
	public boolean isCreate(SearchDTO paramMap, String menuKeyword, String DaoKeyword) {
		result = getLocation(menuKeyword, DaoKeyword);
		int _result = update(result, paramMap); 
		boolean result = (_result ==  COMMON_UPDATE_NUMBER_DAO) ? true : false;
		return result;
	}

	/**
	 * @param paramMap
	 * @param menuKeyword
	 * @param DaoKeyword
	 * @FILENAME : CommonDaoImpl.java
	 * @PROJECT : dains.base
	 * @DATE : 2022. 3. 11.
	 * @USER : test
	 * @CHANGELOG : 오후 3:57:34
	 * @METHOD : 
	 * 
	 */
	@Override
	public void voidCreate(HashMap<String, Object> paramMap, String menuKeyword, String DaoKeyword) {
		result = getLocation(menuKeyword, DaoKeyword);
		update(result, paramMap); 
	}

	/**
	 * @param paramMap
	 * @param menuKeyword
	 * @param DaoKeyword
	 * @FILENAME : CommonDaoImpl.java
	 * @PROJECT : dains.base
	 * @DATE : 2022. 3. 11.
	 * @USER : test
	 * @CHANGELOG : 오후 3:57:49
	 * @METHOD : 
	 * 
	 */
	@Override
	public void voidCreate(SearchDTO paramMap, String menuKeyword, String DaoKeyword) {
		result = getLocation(menuKeyword, DaoKeyword);
		update(result, paramMap); 
	}

	/**
	 * @param paramMap
	 * @param menuKeyword
	 * @param DaoKeyword
	 * @return 0~999
	 * @FILENAME : CommonDaoImpl.java
	 * @PROJECT : dains.base
	 * @DATE : 2022. 3. 11.
	 * @USER : test
	 * @CHANGELOG : 오후 3:58:08
	 * @METHOD : 
	 * 
	 */
	@Override
	public int update(HashMap<String, Object> paramMap, String menuKeyword, String DaoKeyword) {
		result = getLocation(menuKeyword, DaoKeyword);
		return update(result, paramMap);
	}

	/**
	 * @param paramMap
	 * @param menuKeyword
	 * @param DaoKeyword
	 * @return 0~999
	 * @FILENAME : CommonDaoImpl.java
	 * @PROJECT : dains.base
	 * @DATE : 2022. 3. 11.
	 * @USER : test
	 * @CHANGELOG : 오후 3:58:12
	 * @METHOD : 
	 * 
	 */
	@Override
	public int update(SearchDTO paramMap, String menuKeyword, String DaoKeyword) {
		result = getLocation(menuKeyword, DaoKeyword);
		return update(result, paramMap);
	}

	/**
	 * @param paramMap
	 * @param menuKeyword
	 * @param DaoKeyword
	 * @return  true, false
	 * @FILENAME : CommonDaoImpl.java
	 * @PROJECT : dains.base
	 * @DATE : 2022. 3. 11.
	 * @USER : test
	 * @CHANGELOG : 오후 3:58:16
	 * @METHOD : 
	 * 
	 */
	@Override
	public boolean isUpdate(HashMap<String, Object> paramMap, String menuKeyword, String DaoKeyword) {
		result = getLocation(menuKeyword, DaoKeyword);
		int _result = update(result, paramMap); 
		boolean result = (_result ==  COMMON_UPDATE_NUMBER_DAO) ? true : false;
		return result;
	}

	/**
	 * @param paramMap
	 * @param menuKeyword
	 * @param DaoKeyword
	 * @return  true, false
	 * @FILENAME : CommonDaoImpl.java
	 * @PROJECT : dains.base
	 * @DATE : 2022. 3. 11.
	 * @USER : test
	 * @CHANGELOG : 오후 3:58:19
	 * @METHOD : 
	 * 
	 */
	@Override
	public boolean isUpdate(SearchDTO paramMap, String menuKeyword, String DaoKeyword) {
		result = getLocation(menuKeyword, DaoKeyword);
		int _result = update(result, paramMap); 
		boolean result = (_result == COMMON_UPDATE_NUMBER_DAO) ? true : false;
		return result;
	}

	/**
	 * @param paramMap
	 * @param menuKeyword
	 * @param DaoKeyword
	 * @FILENAME : CommonDaoImpl.java
	 * @PROJECT : dains.base
	 * @DATE : 2022. 3. 11.
	 * @USER : test
	 * @CHANGELOG : 오후 3:59:13
	 * @METHOD : 
	 * 
	 */
	@Override
	public void voidUpdate(HashMap<String, Object> paramMap, String menuKeyword, String DaoKeyword) {
		result = getLocation(menuKeyword, DaoKeyword);
		update(result, paramMap);
		
	}

	/**
	 * @param paramMap
	 * @param menuKeyword
	 * @param DaoKeyword
	 * @FILENAME : CommonDaoImpl.java
	 * @PROJECT : dains.base
	 * @DATE : 2022. 3. 11.
	 * @USER : test
	 * @CHANGELOG : 오후 3:59:17
	 * @METHOD : 
	 * 
	 */
	@Override
	public void voidUpdate(SearchDTO paramMap, String menuKeyword, String DaoKeyword) {
		result = getLocation(menuKeyword, DaoKeyword);
		update(result, paramMap);
		
	}

	
	

}
