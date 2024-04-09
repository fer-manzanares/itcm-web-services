package mx.edu.itcm.product.dto;

import java.io.Serializable;

public class CategoryDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String name;
	protected String iva;
	protected String ieps;
	protected String discount;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIva() {
		return iva;
	}
	public void setIva(String iva) {
		this.iva = iva;
	}
	public String getIeps() {
		return ieps;
	}
	public void setIeps(String ieps) {
		this.ieps = ieps;
	}
	
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public CategoryDto(String id, String name, String iva, String ieps, String discount) {
		super();
		this.name = name;
		this.iva = iva;
		this.ieps = ieps;
		this.discount = discount;
	}
	
	public CategoryDto() {
		super();
	}
	@Override
	public String toString() {
		return "CategoryDto [name=" + name + ", iva=" + iva + ", ieps=" + ieps + ", discount=" + discount + "]";
	}
	

}
