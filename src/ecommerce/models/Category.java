/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.models;

import ecommerce.DAO.CategoryDAO;
import java.sql.SQLException;

/**
 *
 * @author hungv
 */
public class Category {
    private Long category_id;
    private String category_name;

    public Category() {
    }

    public Category(Long category_id, String category_name) {
        this.category_id = category_id;
        this.category_name = category_name;
    }

    public Category(Long category_id) {
        this.category_id = category_id;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }
    
    public static void updateCategory(long category_id, String category_name) throws SQLException{
      new CategoryDAO().updateCategoryDAO(category_id, category_name);
    }
    
    public static void insertCategory(String category_name) throws SQLException{
        new CategoryDAO().insertCategoryDAO(category_name);
        
    }
    
    public static void deleteCategory(long category_id) throws SQLException{
        new CategoryDAO().deleteCategoryDAO(category_id);
        
    }
    
}
