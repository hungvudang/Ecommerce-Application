/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.controllers;

/**
 *
 * @author hungv
 */
public class LoginController {
    
    
    public static void validInfoLoginAccount(String email, String password) throws Exception {
        if (email.equalsIgnoreCase("") || password.equalsIgnoreCase("")) {
            throw new Exception("Không được để trống email hoặc password !");
        }
    }
}
