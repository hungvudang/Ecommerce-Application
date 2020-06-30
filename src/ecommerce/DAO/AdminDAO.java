/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.DAO;

import ecommerce.models.Admin;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hungv
 */
public class AdminDAO {
    public DatabaseConnection dbConnector;
    
    public AdminDAO(){
        try {
            dbConnector = DatabaseConnection.getInstance();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean updateAdmin(Admin admin){
        return false;
    }
    
    public boolean insertAdmin(Admin admin){
        return false;
    }
    
    public boolean deleteAdmin(Admin admin){
        return false;
    }
}
