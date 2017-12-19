package com.demo.controller;

import java.util.ArrayList;

import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.demo.model.User;

@Path("login")
public class LoginRestful {
	
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)		// to return as JSON
//	@Path("/showUsers")
//	public ArrayList<User> listUsers(){
//		ArrayList<User> users = new ArrayList<>();
//		
//		User user1 = new User();
//		user1.setUserName("admin");
//		user1.setPassword("admin");
//		
//		User user2 = new User();
//		user2.setUserName("user");
//		user2.setPassword("user");
//		
//		users.add(user1);
//		users.add(user2);
//		
//		return users;
//	}
	
	@POST
	@Path("/authenticate")
	public boolean authenticate(JsonObject jData) {
		String userName = jData.getString("userName");
		String password = jData.getString("password");
		
		
		if (userName.equals("admin")  && password.equals("admin")) {
			System.out.println(true);
			return true;
		} else {
			System.out.println(false);
			return false;
		}
	}
}
