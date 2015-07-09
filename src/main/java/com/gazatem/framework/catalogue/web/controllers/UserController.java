/**
 * 
 */
package com.gazatem.framework.catalogue.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;

import com.gazatem.framework.catalogue.entities.User;
import com.gazatem.framework.catalogue.services.UserService;
import com.gazatem.framework.catalogue.web.config.SecurityUser;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.ModelAndView;

import java.awt.*;

@Controller
public class UserController 
{
	private static UserService userService;
	
	@Autowired
	public void setUserService(UserService userService) {
		UserController.userService = userService;
	}
	
	public static User getCurrentUser()
	{
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	    if (principal instanceof UserDetails) 
	    {
	    	String email = ((UserDetails) principal).getUsername();
	    	User loginUser = userService.findUserByEmail(email);
	    	return new SecurityUser(loginUser);
	    }

	    return null;
	}

	@RequestMapping(value="/hello", method= RequestMethod.GET)
	public String hello(ModelMap model)
	{
		model.addAttribute("name", "JTwig");
		return "articles";
	}
}

