package mx.edu.itcm.product.dto;

import java.io.Serializable;


public class ProductDto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String upc;	
	protected String description;
	protected String quantity;
	protected String price;
	protected String image;	
	protected CategoryDtoResponse category;
	
	public ProductDto(String upc, String description, String quantity, String price, String image,
			CategoryDtoResponse category) {
		super();
		this.upc = upc;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		this.image = image;
		this.category = category;
	}

	public ProductDto() {
		super();
		this.upc = "";
		this.description = "";
		this.quantity = "0";
		this.price = "0";
		this.image = "";
		this.category = null;
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

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public CategoryDtoResponse getCategory() {
		return category;
	}

	public void setCategory(CategoryDtoResponse category) {
		this.category = category;
	}

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ProductDto [upc=" + upc + ", description=" + description + ", quantity=" + quantity + ", price=" + price
				+ ", image=" + image + ", category=" + category + "]";
	}
	
	
}
