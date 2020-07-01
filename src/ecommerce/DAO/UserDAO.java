/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.DAO;

import ecommerce.models.User;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author hungv
 */
public class UserDAO {
    public DatabaseConnection dbConnector;
    
    public UserDAO(){
        try {
            dbConnector = DatabaseConnection.getInstance();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean updateUserDAO(User user){
        String sql = "UPDATE tbl_user "
                + "SET [address_id] = ? " +
                ",[user_fullname] = ? " +
                ",[user_email] = ? " +
                ",[user_phone] = ? " +
                ",[user_gender] = ? " +
                ",[user_dateOfBirth] = ? " +
                "WHERE user_id = ?";
        Connection conn = dbConnector.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1, user.getAddress_id());
            ps.setString(2, user.getUser_fullName());
            ps.setString(3, user.getUser_email());
            ps.setString(4, user.getUser_phone());
            ps.setInt(5, 0);
            if (user.getUser_gender())
                ps.setInt(5, 1);
            ps.setDate(6, Date.valueOf(user.getUser_dateOfBirth()));
            ps.setLong(7, user.getUser_id());
            
            ps.executeUpdate();
            System.out.println("Cập nhật thành công !");
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       return true;
    }
    
    public boolean insertUserDAO(User user){
        return true;
    }
    
    public boolean deleteUserDAO(User user){
        return true;
    }
}
