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
public class Product {
    private Long product_id,
                 category_id;
    private String product_name,
                   product_image,
                   product_description;
    private Float product_price;

    
    public Product() {
    }
    
    
    
    public Product(Long product_id) {
        this.product_id = product_id;
    }

    public Product(Long product_id, Long category_id, String product_name, String product_description, Float product_price) {
        this.product_id = product_id;
        this.category_id = category_id;
        this.product_name = product_name;
        this.product_description = product_description;
        this.product_price = product_price;
    }

    
    
    public Long getProduct_id() {
        return product_id;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_image() {
        return product_image;
    }

    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public Float getProduct_price() {
        return product_price;
    }

    public void setProduct_price(Float product_price) {
        this.product_price = product_price;
    }
    
    
    
}
