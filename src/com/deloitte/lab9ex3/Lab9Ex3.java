package com.deloitte.lab9ex3;

import java.util.function.BiPredicate;

public class Lab9Ex3 {

    public static void main(String[] args) {
        String username = "admin";
        String password = "password123";

        boolean isAuthenticated = authenticate(username, password);
        System.out.println("Authentication successful: " + isAuthenticated);
    }

    public static boolean authenticate(String username, String password) {
        BiPredicate<String, String> isValidUser = 
            (user, pass) -> "admin".equals(user) && "password123".equals(pass);
        
        return isValidUser.test(username, password);
    }
}
