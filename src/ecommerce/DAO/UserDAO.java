/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.DAO;

import ecommerce.models.User;
import java.sql.SQLException;
import java.sql.Statement;
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
    
    public boolean updateUser(User user){
       String qsql = "UPDATE tbl_user"+
               "SET address_id ="+user.getAddress_id()+
               ",user_fullname ='"+user.getUser_fullName()+"'"+
               ",user_email = '"+user.getUser_email()+"'"+
               ",user_password ='"+user.getUser_password()+"'"+
               ",user_phone = NULL"+
               ",user_gender = NULL"+
               ",user_dateOfBirth = NULL"+
               "WHERE user_id="+user.getUser_id();
       try(Statement stmt = dbConnector.getConnection().createStatement()){
           stmt.executeUpdate(qsql);
           return true;
       } catch(SQLException ex){
           java.util.logging.Logger.getLogger(UserDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       }
       return false;
    }
    
    public boolean insertUser(User user){
        return true;
    }
    
    public boolean deleteUser(User user){
        return true;
    }
}
