/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.models;

import java.util.Date;

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
    private Date user_dateOfBirth;

    public User() {
    }

    public User(Long user_id) {
        this.user_id = user_id;
    }
    
    public Long getUser_id() {
        return user_id;
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

    public Date getUser_dateOfBirth() {
        return user_dateOfBirth;
    }

    public void setUser_dateOfBirth(Date user_dateOfBirth) {
        this.user_dateOfBirth = user_dateOfBirth;
    }
    
    
}
