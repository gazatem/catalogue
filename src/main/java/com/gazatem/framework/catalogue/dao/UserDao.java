/**
 * 
 */
package com.gazatem.framework.catalogue.dao;

import java.util.List;

import com.gazatem.framework.catalogue.entities.User;

/**
 * @author katsi02
 *
 */
public interface UserDao {

	public List<User> findAll();
	
	public User create(User user);
	
	public User findUserById(int id);

	public User login(String email, String password);
	
}
