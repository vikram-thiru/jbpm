package com.myspace.sample;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class product implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "PRODUCT_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "PRODUCT_ID_GENERATOR", sequenceName = "PRODUCT_ID_SEQ")
	private java.lang.Long id;

	private java.lang.String type;

	private java.lang.Integer discount;

	public product() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getType() {
		return this.type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}

	public java.lang.Integer getDiscount() {
		return this.discount;
	}

	public void setDiscount(java.lang.Integer discount) {
		this.discount = discount;
	}

	public product(java.lang.Long id, java.lang.String type,
			java.lang.Integer discount) {
		this.id = id;
		this.type = type;
		this.discount = discount;
	}

}