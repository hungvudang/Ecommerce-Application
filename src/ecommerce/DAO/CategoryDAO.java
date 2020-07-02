/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.DAO;

import ecommerce.models.Category;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hungv
 */
public class CategoryDAO {
    public DatabaseConnection dbConnector;
    
    public CategoryDAO(){
        try {
            dbConnector = DatabaseConnection.getInstance();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void updateCategory(Category c){
    
    }
    
    public void insertCategory(Category c){
        
    }
    
    public void deleteCategory(Category c){
        
    }
}
