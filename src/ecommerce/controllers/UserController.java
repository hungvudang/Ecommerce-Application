/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.controllers;

import ecommerce.DAO.UserDAO;
import ecommerce.models.User;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author hungv
 */
public class UserController {
   
    
    public static boolean isAdmin(User user){
        return user.getUser_id() == 1;
    }
    
    public static User getUser(String email){
        UserDAO uDao = new UserDAO();
        User user = null;
        Connection conn = uDao.dbConnector.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("select * from tbl_user where user_email = ?");
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next() != false){
                user = new User(rs.getLong("user_id"));
                user.setUser_fullName(rs.getString("user_fullname"));
                user.setUser_email(email);
                user.setUser_password(rs.getString("user_password"));
                user.setUser_gender(true);
                user.setUser_phone("");
                return user;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }
}
