package com.soecode.lyf.service;

import java.util.List;

import com.soecode.lyf.entity.User;
import com.soecode.lyf.entity.Userlist;

public interface UserService {

	public List<User> userList() throws Exception;
	public User login(User user) throws Exception;
	
}
