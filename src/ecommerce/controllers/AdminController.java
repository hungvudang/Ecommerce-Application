/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.controllers;

import ecommerce.models.User;
import java.time.LocalDate;

/**
 *
 * @author hungv
 */
public class AdminController {
    
    public AdminController(){
        
    }
    
    public static User getAccountInfo(long user_id,long address_id, String user_fullname, String user_email, String user_phone, boolean user_gender, LocalDate date){
        User user = new User(user_id);
        user.setAddress_id(address_id);
        user.setUser_fullName(user_fullname);
        user.setUser_email(user_email);
        user.setUser_phone(user_phone);
        user.setUser_gender(user_gender);
        user.setUser_dateOfBirth(date);
        
        return user;
    }
}
