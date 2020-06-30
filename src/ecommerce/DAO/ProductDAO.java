/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.DAO;

import ecommerce.models.Product;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hungv
 */
public class ProductDAO {
    public DatabaseConnection dbConnector;
    
    public ProductDAO(){
        try {
            dbConnector = DatabaseConnection.getInstance();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public boolean updateProduct(Product p){
        return false;
    }
    
    public boolean insertProduct(Product p){
        return false;
    }
    
    public boolean deleteProduct(Product p){
        return false;
    }
}
