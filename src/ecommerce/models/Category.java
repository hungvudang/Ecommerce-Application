/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.models;

/**
 *
 * @author hungv
 */
public class Category {
    private Long category_id;
    private String category_name;

    public Category() {
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
    
    
}
