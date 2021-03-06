/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.models;

import ecommerce.DAO.UserDAO;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 *
 * @author hungv
 */
public class User {
    
    private Long user_id,
                address_id;

    private String user_fullName,
            user_email,
            user_password,
            user_phone;
    private boolean user_gender;
    private LocalDate user_dateOfBirth;

    public User() {
    }

    public User(Long user_id) {
        this.user_id = user_id;
    }
    
    public Long getUser_id() {
        return user_id;
    }

    public void setAddress_id(Long address_id) {
        this.address_id = address_id;
    }

    
    public Long getAddress_id() {
        return address_id;
    }
    
    public String getUser_fullName() {
        return user_fullName;
    }

    public void setUser_fullName(String user_fullName) {
        this.user_fullName = user_fullName;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public boolean getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(boolean user_gender) {
        this.user_gender = user_gender;
    }

    public LocalDate getUser_dateOfBirth() {
        return user_dateOfBirth;
    }

    public void setUser_dateOfBirth(LocalDate user_dateOfBirth) {
        this.user_dateOfBirth = user_dateOfBirth;
    }
    
    public static void updateUser(User user) throws SQLException{
        new UserDAO().updateUserDAO(user);
    }
    
    public static void deleteUser(long user_id) throws SQLException{
        new UserDAO().deleteUserDAO(user_id);
    }
    
    public static void insertUser(long address_id, String user_fullname, String user_password, String user_email, String user_phone, boolean user_gender, LocalDate user_dateOfBirth) throws SQLException{
        new UserDAO().insertUserDAO(address_id, user_fullname, user_password, user_email, user_phone, user_gender, user_dateOfBirth);
    }
}
