/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.controllers;

import ecommerce.DAO.UserDAO;
import ecommerce.models.User;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
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
    
    public static User getUser(String email, String password){
        UserDAO uDao = new UserDAO();
        User user = null;
        Connection conn = uDao.dbConnector.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("select * from tbl_user where user_email = ? and user_password = ?");
            ps.setString(1, email);
            ps.setString(2, password);
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
    
    public static ArrayList<User> getAllUsers(){
        UserDAO uDao = new UserDAO();
        Connection conn = uDao.dbConnector.getConnection();
        
        ArrayList<User> alUsers = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement("select * from tbl_user where user_id != 1");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                long user_id = rs.getLong("user_id");
                long address_id = rs.getLong("address_id");
                String user_fullname = rs.getString("user_fullname");
                String user_email = rs.getString("user_email");
                String user_phone = rs.getString("user_phone");
                Boolean user_gender = rs.getBoolean("user_gender");
                Date date = rs.getDate("user_dateOfBirth");
                LocalDate dateOfBirth = date.toLocalDate();

                User user = new User(user_id);
                user.setAddress_id(address_id);
                user.setUser_fullName(user_fullname);
                user.setUser_email(user_email);
                user.setUser_phone(user_phone);
                user.setUser_gender(user_gender);
                user.setUser_dateOfBirth(dateOfBirth);
                
                alUsers.add(user); 
            }
            return alUsers;
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public static String getAddress(long address_id){
        UserDAO uDao = new UserDAO();
        Connection conn = uDao.dbConnector.getConnection();
        
        try {
            PreparedStatement ps = conn.prepareStatement("select address_name from tbl_address where address_id = ?");
            ps.setLong(1, address_id);
            ResultSet rs = ps.executeQuery();
            if (rs.next() != false){
                String address = rs.getString(1);
                return address;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "";
    }
    
    public static ArrayList<String> getAllAddress(){
        ArrayList<String> address = new ArrayList<>();
        
        UserDAO uDao = new UserDAO();
        Connection conn = uDao.dbConnector.getConnection();
        String sqlq = "select address_name from tbl_address where address_id != 0";
        try {
            PreparedStatement ps = conn.prepareStatement(sqlq);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                address.add(rs.getString("address_name"));
            }
            return address;
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return address;
    }
    
    public static void updateUser(User user){
        new UserDAO().updateUserDAO(user);
    }
}
