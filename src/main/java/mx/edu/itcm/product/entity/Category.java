package mx.edu.itcm.product.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Category implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Column
	private String name;
	
	@Column
	private BigDecimal iva;
	
	@Column
	private BigDecimal ieps;

	@Column
	private BigDecimal discount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getIva() {
		return iva;
	}

	public void setIva(BigDecimal iva) {
		this.iva = iva;
	}

	public BigDecimal getIeps() {
		return ieps;
	}

	public void setIeps(BigDecimal ieps) {
		this.ieps = ieps;
	}
	
	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public Category(int id, String name, BigDecimal iva, BigDecimal ieps, BigDecimal discount) {
		super();
		this.id = id;
		this.name = name;
		this.iva = iva;
		this.ieps = ieps;
		this.discount = discount;
	}

	public Category() {
		super();
		this.id = 0;
		this.name = "";
		this.iva = BigDecimal.ZERO;
		this.ieps = BigDecimal.ZERO;
		this.discount = BigDecimal.ZERO;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", iva=" + iva + ", ieps=" + ieps + ", discount=" + discount
				+ "]";
	}
	
	
	
	
}
