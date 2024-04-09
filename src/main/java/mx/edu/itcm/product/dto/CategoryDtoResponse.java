package mx.edu.itcm.product.dto;

import java.io.Serializable;

public class CategoryDtoResponse  extends CategoryDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;

	public CategoryDtoResponse(int id) {
		super();
		this.id = id;
	}

	public CategoryDtoResponse() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "CategoryDtoResponse [id=" + id + "]";
	}
	
	
}
