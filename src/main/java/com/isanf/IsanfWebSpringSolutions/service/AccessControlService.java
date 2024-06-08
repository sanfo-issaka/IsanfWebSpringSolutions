package com.isanf.IsanfWebCRUDSolutions.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//R 2
@Profile("!excluded") /////////////////////////////////////////////////////////////////
//@Component
class AccessControlService {
	private RoleService roleService;
	
	@Autowired
	public AccessControlService(RoleService roleService) {
		this.roleService = roleService;
	}
}
