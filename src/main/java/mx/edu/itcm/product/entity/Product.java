package mx.edu.itcm.product.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table
public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Column
	String upc;
	
	@Column
	String description;
	
	@Column
	BigDecimal quantity;
	
	@Column
	BigDecimal price;
	
	@Column
	String image;
	
	@OneToOne
    @JoinColumn(name = "category", nullable = false)
	Category category;
	
	public Product() {
		this.upc = "Sin código";
		this.description = "";
		this.price = BigDecimal.ZERO;
		this.quantity = BigDecimal.ZERO;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", upc=" + upc + ", description=" + description + ", quantity=" + quantity
				+ ", price=" + price + ", image=" + image + ", category=" + category + "]";
	}
	
	
}
