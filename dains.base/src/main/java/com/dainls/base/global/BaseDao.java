package com.dainls.base.global;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

public class BaseDao extends EgovAbstractDAO {
	
	protected void printQueryId(String queryId) {
		if (logger.isDebugEnabled()) {
			logger.debug("\t QueryId  \t:  " + queryId);
			logger.info("\t QueryId  \t:  " + queryId);
		}else if(logger.isWarnEnabled()){
			logger.warn("\t QueryId  \t:  " + queryId);
		}else if(logger.isErrorEnabled()){
			logger.error("\t QueryId_error  \t:  " + queryId);
		}else{
			logger.info("\t QueryId  \t:  " + queryId);
		}
	}
	
	protected String getLocation(String menuKeyword, String DaoKeyword) {
		String _result = menuKeyword + SysKeyword.DOT + DaoKeyword;
		printQueryId(_result);
		return _result;
	}
	
	private static final Logger logger = LoggerFactory.getLogger(BaseDao.class);
	
	private SqlSession sqlSession;
	
	@Autowired
	public BaseDao(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public Object insert(String queryId, Object params) {
		return sqlSession.insert(queryId, params);
	}
	

	public int update(String queryId, Object params) {
		return sqlSession.update(queryId, params);
	}

	public int delete(String queryId, Object params) {
		return sqlSession.delete(queryId, params);
	}

	public Object selectOne(String queryId) {
		return sqlSession.selectOne(queryId);
	}

	public Object selectOne(String queryId, Object params) {
		return sqlSession.selectOne(queryId, params);
	}

	@SuppressWarnings("rawtypes")
	public List selectList(String queryId) {
		return sqlSession.selectList(queryId);
	}

	@SuppressWarnings("rawtypes")
	public List selectList(String queryId, Object params) {
		return sqlSession.selectList(queryId, params);
	}
	
	
	
}
