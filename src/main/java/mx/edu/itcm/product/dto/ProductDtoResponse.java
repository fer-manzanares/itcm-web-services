package mx.edu.itcm.product.dto;

import java.io.Serializable;

public class ProductDtoResponse extends ProductDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	
	public ProductDtoResponse(String upc, String description, String quantity, String price, String image,
			CategoryDtoResponse category, int id) {
		super(upc, description, quantity, price, image, category);
		this.id = id;
	}
	
	

	public ProductDtoResponse() {
		super();
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
