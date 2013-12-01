package org.stackbox.weixinback.service;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.stackbox.weixinback.entity.Admin;

@Component(value="adminService")
public class AdminService {
	
	@Transactional
	public void update(Admin admin) {
		
	}
	
	@Transactional
	public Admin queryByNameAndPassword(String adminName, String password) {
		Admin admin = new Admin();
		admin.setAdminName("叠搭宝箱");
		return admin;
	}
}
