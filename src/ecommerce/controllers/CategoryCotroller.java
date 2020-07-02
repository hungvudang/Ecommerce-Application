/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.controllers;

import ecommerce.DAO.CategoryDAO;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hungv
 */
public class CategoryCotroller {
    
    
    public static ArrayList<String> getAllCategoryName(){
        ArrayList<String> lstCategoryName = new ArrayList<>();
        
        CategoryDAO cDAO = new CategoryDAO();
        Connection conn = cDAO.dbConnector.getConnection();
        
        String sqlq = "SELECT category_name FROM tbl_category";
        try {
            PreparedStatement ps = conn.prepareStatement(sqlq);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                lstCategoryName.add(rs.getString("category_name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryCotroller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lstCategoryName;
    }
}
