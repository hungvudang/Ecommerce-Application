/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.controllers;

import ecommerce.DAO.ProductDAO;
import ecommerce.models.Product;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hungv
 */
public class ProductController {
    
    
    public static ArrayList<Product> getAllProduct(){
        ArrayList<Product> products = new ArrayList<>();
        ProductDAO pDAO = new ProductDAO();
        Connection conn = pDAO.dbConnector.getConnection();
        
        String sqlq = "SELECT product_id, category_id, product_name, product_price, product_description "
                + "FROM tbl_product";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sqlq);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                long product_id, category_id;
                String product_name, product_description;
                float product_price;
                
                product_id = rs.getLong("product_id");
                category_id = rs.getLong("category_id");
                product_name = rs.getString("product_name");
                product_price = rs.getFloat("product_price");
                product_description = rs.getString("product_description");
                
                products.add(new Product(product_id, category_id, product_name, product_description, product_price));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return products;
    }
    
    public static void updateProductCtrl(long product_id, long category_id, String product_name, float product_price, String product_description) throws SQLException{
        Product.updateProduct(product_id, category_id, product_name, product_price, product_description);
    }
    
    public static void deleteProductCtrl(long product_id) throws SQLException{
        Product.deleteProduct(product_id);
    }
    
    public static void insertProductCtrl(long category_id, String product_name, float product_price, String product_description) throws SQLException{
        Product.insertProduct(category_id, product_name, product_price, product_description);
    }
}
