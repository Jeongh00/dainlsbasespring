package com.dainls.base.service;

import java.util.HashMap;
import java.util.List;

import com.dainls.base.dto.SearchDTO;

public interface IUserAdminService {

	public HashMap<String, Object> list(String paramText);

	public HashMap<String, Object> detail(String paramText);

	public int create(String paramText);

	public int update(String paramText);

}
