//=======================================================================
// ARCHIVO Product.java
// FECHA CREACIÓN: Jun 29, 2015
//=======================================================================
package co.zero.ccd.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * The object that is sold by a supplier
 * @author Hernán Tenjo
 * @version 1.0
 */
@Entity
public class Product extends AbstractPersistable<Long>{
	private static final long serialVersionUID = 1L;
	@ManyToOne(optional=false)
	private Category category;
	@ManyToOne(optional=false)
	private Supplier supplier;
	private String name;
	private String description;
	private double unitPrice;
	private int unitsInStock;
	private boolean discontinued;
	private String taxCode;
	private String shippingCode;
	private String defaultLang;
	private String currencyFormat;
	private String specialNotes;
	private String creatorName;
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedDate;
	
	private String smallImgUrl;
	private String mediumImgUrl;
	private String bigImgUrl;
	
	private String otherField1;
	private String otherField2;
	private String otherField3;
	private String otherField4;
	private String otherField5;
	private String otherField6;
	private String otherField7;
	private String otherField8;
	private String otherField9;
	private String otherField10;
	private String otherField11;
	private String otherField12;
	private String otherField13;
	private String otherField14;
	private String otherField15;
	private String otherField16;
	private String otherField17;
	private String otherField18;
	private String otherField19;
	private String otherField20;
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the supplier
	 */
	public Supplier getSupplier() {
		return supplier;
	}
	/**
	 * @param supplier the supplier to set
	 */
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
	}
	/**
	 * @return the unitPrice
	 */
	public double getUnitPrice() {
		return unitPrice;
	}
	/**
	 * @param unitPrice the unitPrice to set
	 */
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	/**
	 * @return the unitsInStock
	 */
	public double getUnitsInStock() {
		return unitsInStock;
	}
	/**
	 * @param unitsInStock the unitsInStock to set
	 */
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	/**
	 * @return the discontinued
	 */
	public boolean isDiscontinued() {
		return discontinued;
	}
	/**
	 * @param discontinued the discontinued to set
	 */
	public void setDiscontinued(boolean discontinued) {
		this.discontinued = discontinued;
	}
	/**
	 * @return the taxCode
	 */
	public String getTaxCode() {
		return taxCode;
	}
	/**
	 * @param taxCode the taxCode to set
	 */
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}
	/**
	 * @return the shippingCode
	 */
	public String getShippingCode() {
		return shippingCode;
	}
	/**
	 * @param shippingCode the shippingCode to set
	 */
	public void setShippingCode(String shippingCode) {
		this.shippingCode = shippingCode;
	}
	/**
	 * @return the defaultLang
	 */
	public String getDefaultLang() {
		return defaultLang;
	}
	/**
	 * @param defaultLang the defaultLang to set
	 */
	public void setDefaultLang(String defaultLang) {
		this.defaultLang = defaultLang;
	}
	/**
	 * @return the currencyFormat
	 */
	public String getCurrencyFormat() {
		return currencyFormat;
	}
	/**
	 * @param currencyFormat the currencyFormat to set
	 */
	public void setCurrencyFormat(String currencyFormat) {
		this.currencyFormat = currencyFormat;
	}
	/**
	 * @return the specialNotes
	 */
	public String getSpecialNotes() {
		return specialNotes;
	}
	/**
	 * @param specialNotes the specialNotes to set
	 */
	public void setSpecialNotes(String specialNotes) {
		this.specialNotes = specialNotes;
	}
	/**
	 * @return the creatorName
	 */
	public String getCreatorName() {
		return creatorName;
	}
	/**
	 * @param creatorName the creatorName to set
	 */
	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}
	/**
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}
	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	/**
	 * @return the modifiedDate
	 */
	public Date getModifiedDate() {
		return modifiedDate;
	}
	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	/**
	 * @return the smallImgUrl
	 */
	public String getSmallImgUrl() {
		return smallImgUrl;
	}
	/**
	 * @param smallImgUrl the smallImgUrl to set
	 */
	public void setSmallImgUrl(String smallImgUrl) {
		this.smallImgUrl = smallImgUrl;
	}
	/**
	 * @return the mediumImgUrl
	 */
	public String getMediumImgUrl() {
		return mediumImgUrl;
	}
	/**
	 * @param mediumImgUrl the mediumImgUrl to set
	 */
	public void setMediumImgUrl(String mediumImgUrl) {
		this.mediumImgUrl = mediumImgUrl;
	}
	/**
	 * @return the bigImgUrl
	 */
	public String getBigImgUrl() {
		return bigImgUrl;
	}
	/**
	 * @param bigImgUrl the bigImgUrl to set
	 */
	public void setBigImgUrl(String bigImgUrl) {
		this.bigImgUrl = bigImgUrl;
	}
	/**
	 * @return the otherField1
	 */
	public String getOtherField1() {
		return otherField1;
	}
	/**
	 * @param otherField1 the otherField1 to set
	 */
	public void setOtherField1(String otherField1) {
		this.otherField1 = otherField1;
	}
	/**
	 * @return the otherField2
	 */
	public String getOtherField2() {
		return otherField2;
	}
	/**
	 * @param otherField2 the otherField2 to set
	 */
	public void setOtherField2(String otherField2) {
		this.otherField2 = otherField2;
	}
	/**
	 * @return the otherField3
	 */
	public String getOtherField3() {
		return otherField3;
	}
	/**
	 * @param otherField3 the otherField3 to set
	 */
	public void setOtherField3(String otherField3) {
		this.otherField3 = otherField3;
	}
	/**
	 * @return the otherField4
	 */
	public String getOtherField4() {
		return otherField4;
	}
	/**
	 * @param otherField4 the otherField4 to set
	 */
	public void setOtherField4(String otherField4) {
		this.otherField4 = otherField4;
	}
	/**
	 * @return the otherField5
	 */
	public String getOtherField5() {
		return otherField5;
	}
	/**
	 * @param otherField5 the otherField5 to set
	 */
	public void setOtherField5(String otherField5) {
		this.otherField5 = otherField5;
	}
	/**
	 * @return the otherField6
	 */
	public String getOtherField6() {
		return otherField6;
	}
	/**
	 * @param otherField6 the otherField6 to set
	 */
	public void setOtherField6(String otherField6) {
		this.otherField6 = otherField6;
	}
	/**
	 * @return the otherField7
	 */
	public String getOtherField7() {
		return otherField7;
	}
	/**
	 * @param otherField7 the otherField7 to set
	 */
	public void setOtherField7(String otherField7) {
		this.otherField7 = otherField7;
	}
	/**
	 * @return the otherField8
	 */
	public String getOtherField8() {
		return otherField8;
	}
	/**
	 * @param otherField8 the otherField8 to set
	 */
	public void setOtherField8(String otherField8) {
		this.otherField8 = otherField8;
	}
	/**
	 * @return the otherField9
	 */
	public String getOtherField9() {
		return otherField9;
	}
	/**
	 * @param otherField9 the otherField9 to set
	 */
	public void setOtherField9(String otherField9) {
		this.otherField9 = otherField9;
	}
	/**
	 * @return the otherField10
	 */
	public String getOtherField10() {
		return otherField10;
	}
	/**
	 * @param otherField10 the otherField10 to set
	 */
	public void setOtherField10(String otherField10) {
		this.otherField10 = otherField10;
	}
	/**
	 * @return the otherField11
	 */
	public String getOtherField11() {
		return otherField11;
	}
	/**
	 * @param otherField11 the otherField11 to set
	 */
	public void setOtherField11(String otherField11) {
		this.otherField11 = otherField11;
	}
	/**
	 * @return the otherField12
	 */
	public String getOtherField12() {
		return otherField12;
	}
	/**
	 * @param otherField12 the otherField12 to set
	 */
	public void setOtherField12(String otherField12) {
		this.otherField12 = otherField12;
	}
	/**
	 * @return the otherField13
	 */
	public String getOtherField13() {
		return otherField13;
	}
	/**
	 * @param otherField13 the otherField13 to set
	 */
	public void setOtherField13(String otherField13) {
		this.otherField13 = otherField13;
	}
	/**
	 * @return the otherField14
	 */
	public String getOtherField14() {
		return otherField14;
	}
	/**
	 * @param otherField14 the otherField14 to set
	 */
	public void setOtherField14(String otherField14) {
		this.otherField14 = otherField14;
	}
	/**
	 * @return the otherField15
	 */
	public String getOtherField15() {
		return otherField15;
	}
	/**
	 * @param otherField15 the otherField15 to set
	 */
	public void setOtherField15(String otherField15) {
		this.otherField15 = otherField15;
	}
	/**
	 * @return the otherField16
	 */
	public String getOtherField16() {
		return otherField16;
	}
	/**
	 * @param otherField16 the otherField16 to set
	 */
	public void setOtherField16(String otherField16) {
		this.otherField16 = otherField16;
	}
	/**
	 * @return the otherField17
	 */
	public String getOtherField17() {
		return otherField17;
	}
	/**
	 * @param otherField17 the otherField17 to set
	 */
	public void setOtherField17(String otherField17) {
		this.otherField17 = otherField17;
	}
	/**
	 * @return the otherField18
	 */
	public String getOtherField18() {
		return otherField18;
	}
	/**
	 * @param otherField18 the otherField18 to set
	 */
	public void setOtherField18(String otherField18) {
		this.otherField18 = otherField18;
	}
	/**
	 * @return the otherField19
	 */
	public String getOtherField19() {
		return otherField19;
	}
	/**
	 * @param otherField19 the otherField19 to set
	 */
	public void setOtherField19(String otherField19) {
		this.otherField19 = otherField19;
	}
	/**
	 * @return the otherField20
	 */
	public String getOtherField20() {
		return otherField20;
	}
	/**
	 * @param otherField20 the otherField20 to set
	 */
	public void setOtherField20(String otherField20) {
		this.otherField20 = otherField20;
	}
}