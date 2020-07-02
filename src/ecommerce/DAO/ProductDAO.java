/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.DAO;

import ecommerce.models.Product;
import java.sql.*;
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
    
    
    
    public void updateProductDAO(long product_id, long category_id, String product_name, float product_price, String product_description) throws SQLException{
        String sqlq = "UPDATE tbl_product "
                + "SET [category_id] = ?"
                + ", [product_name] = ?"
                + ", [product_price] = ?"
                + ", [product_description] = ?"
                + " WHERE [product_id] = ?";
        
        Connection conn = dbConnector.getConnection();
        PreparedStatement ps = conn.prepareStatement(sqlq);
        ps.setLong(1, category_id);
        ps.setString(2, product_name);
        ps.setFloat(3, product_price);
        ps.setString(4, product_description);
        ps.setLong(5, product_id);
        ps.executeUpdate();
        System.out.println("Cập nhật sản phẩm thành công !");
        
    }
    
    public void insertProductDAO(long category_id, String product_name, float product_price, String product_description) throws SQLException{
        String sqlq = "INSERT INTO tbl_product(category_id, product_name, product_price, product_description) "
                + "VALUES(?,?,?,?)";
        
        Connection conn = dbConnector.getConnection();
        PreparedStatement ps = conn.prepareStatement(sqlq);
        ps.setLong(1, category_id);
        ps.setString(2, product_name);
        ps.setFloat(3, product_price);
        ps.setString(4, product_description);
        
        ps.execute();
        
        System.out.println("Thêm sản phẩm mới thành công !");
    }
    
    public void deleteProductDAO(long product_id) throws SQLException{
        String sqlq = "DELETE FROM tbl_product WHERE product_id = ?";
        Connection conn = dbConnector.getConnection();
        PreparedStatement ps = conn.prepareStatement(sqlq);
        ps.setLong(1, product_id);
        ps.execute();
        System.out.println("Xóa sản phẩm thành công !");
    }
}
