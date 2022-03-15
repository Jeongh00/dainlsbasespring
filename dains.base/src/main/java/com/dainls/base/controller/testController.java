package com.dainls.base.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dainls.base.global.BaseService;
import com.dainls.base.service.IUserAdminService;

@Controller
public class testController {
	
	@Autowired
	private IUserAdminService userAdminService;
	
	@RequestMapping(value = "/test")
	public String adminTestHome() {
		
		return "/dainls/admin/adminUser";
	};
}
