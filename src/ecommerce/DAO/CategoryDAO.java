/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.DAO;

import java.sql.*;
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
    
    
     public void updateCategoryDAO(long category_id, String category_name) throws SQLException{
        String sqlq = "UPDATE tbl_category "
                + "SET [category_name] = ?"
                + " WHERE [category_id] = ?";
        
        Connection conn = dbConnector.getConnection();
        PreparedStatement ps = conn.prepareStatement(sqlq);
        ps.setString(1, category_name);
        ps.setLong(2, category_id);
        ps.executeUpdate();
        System.out.println("Cập nhật danh mục thành công !");
        
    }
    
    public void insertCategoryDAO(String category_name) throws SQLException{
        String sqlq = "INSERT INTO tbl_category(category_name) "
                + "VALUES(?)";
        
        Connection conn = dbConnector.getConnection();
        PreparedStatement ps = conn.prepareStatement(sqlq);
        ps.setString(1, category_name);
        ps.execute();
        
        System.out.println("Thêm danh mục mới thành công !");
    }
    
    public void deleteCategoryDAO(long category_id) throws SQLException{
        String sqlq = "DELETE FROM tbl_category WHERE category_id = ?";
        Connection conn = dbConnector.getConnection();
        PreparedStatement ps = conn.prepareStatement(sqlq);
        ps.setLong(1, category_id);
        ps.execute();
        System.out.println("Xóa danh mục thành công !");
    }
}
