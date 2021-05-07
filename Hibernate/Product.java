package com.org.hib.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
 
@Entity
@Table(name = "PRODUCT")
public class Product {
    private long productId;
    private String name;
    private String description;
    private float price;
    private ProductDetail productDetail;
 
    public Product() {
    }
 
    @Id
    @GeneratedValue
    @Column(name = "PRODUCT_ID")
    public long getProductId() {
        return productId;
    }
 
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public void setProductDetail(ProductDetail productDetail) {
		this.productDetail = productDetail;
	}

	@OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    public ProductDetail getProductDetail() {
        return productDetail;
    }
 
    // other getters and setters
}