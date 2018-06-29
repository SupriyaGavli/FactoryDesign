package com.Chain;

import java.util.HashMap;
import java.util.Map;

public class Server {
	private Map<String, String> users = new HashMap<>();
    public Authentication authentication;

    
    public void setMiddleware(Authentication authentication) {
        this.authentication = authentication;
    }

   
    public boolean logIn(String email, String password) {
        if (authentication.check(email, password)) {
            System.out.println("Authorization have been successful!");


            return true;
        }
        return false;
    }

    public void register(String email, String password) {
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
}
