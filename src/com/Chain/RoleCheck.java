package com.Chain;

public class RoleCheck extends Authentication{
	    public boolean check(String email, String password) {
	        if (email.equals("admin@example.com")) {
	            System.out.println("Hello, admin!");
	            return true;
	        }
	        System.out.println("Hello, user!");
	        return checkNext(email, password);
	    }
	

}
