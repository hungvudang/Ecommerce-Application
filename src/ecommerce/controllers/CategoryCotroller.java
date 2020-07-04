/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.controllers;

import ecommerce.DAO.CategoryDAO;
import ecommerce.models.Category;
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
    
    public static String getCategoryName(long category_id){
        CategoryDAO cDAO = new CategoryDAO();
        Connection conn = cDAO.dbConnector.getConnection();
        
        String sqlq = "SELECT category_name FROM tbl_category WHERE category_id = ?";
        String category_name = null;
        try {
            PreparedStatement ps = conn.prepareStatement(sqlq);
            ps.setLong(1,category_id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                category_name = rs.getString("category_name"); 
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryCotroller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return category_name;
    }
    
    public static ArrayList<Category> getAllCategory(){
        ArrayList<Category> categories = new ArrayList<>();
        
        CategoryDAO cDAO = new CategoryDAO();
        Connection conn = cDAO.dbConnector.getConnection();
        
        String sqlq = "SELECT category_id, category_name FROM tbl_category";
        try {
            PreparedStatement ps = conn.prepareStatement(sqlq);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                categories.add(new Category(rs.getLong("category_id"), rs.getString("category_name")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryCotroller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return categories;
    }
    
    public static long getCategoryID(String category_name){
        CategoryDAO cDAO = new CategoryDAO();
        Connection conn = cDAO.dbConnector.getConnection();
        
        String sqlq = "SELECT category_id FROM tbl_category WHERE category_name = ?";
        long category_id = -1;
        try {
            PreparedStatement ps = conn.prepareStatement(sqlq);
            ps.setString(1,category_name);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                category_id =  Long.parseLong(rs.getString("category_id"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryCotroller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return category_id;
    }
    
    public static void updateCategoryCtrl(long category_id, String category_name) throws SQLException{
        Category.updateCategory(category_id, category_name);
    }
    
    public static void insertCategoryCtrl(String category_name) throws SQLException{
        Category.insertCategory(category_name);
    }
    
    public static void deleteCategoryCtrl(long category_id) throws SQLException{
        Category.deleteCategory(category_id);
    }
}
