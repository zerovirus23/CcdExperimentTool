//=======================================================================
// ARCHIVO Supplier.java
// FECHA CREACIÓN: Jun 29, 2015
//=======================================================================
package co.zero.ccd.model;

import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * The company that sell a product
 * @author Hernán Tenjo
 * @version 1.0
 */
@Entity
public class Supplier extends AbstractPersistable<Long>{
	private static final long serialVersionUID = 1L;
	private String name;
	private String contactName;
	private String contactTitle;
	private String address;
	private String country;
	private String city;
	private String region;
	private String postalCode;
	private String phone;
	private String homePage;
	
	//GETs & SETs
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
	 * @return the contactName
	 */
	public String getContactName() {
		return contactName;
	}
	/**
	 * @param contactName the contactName to set
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	/**
	 * @return the contactTitle
	 */
	public String getContactTitle() {
		return contactTitle;
	}
	/**
	 * @param contactTitle the contactTitle to set
	 */
	public void setContactTitle(String contactTitle) {
		this.contactTitle = contactTitle;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}
	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}
	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}
	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the homePage
	 */
	public String getHomePage() {
		return homePage;
	}
	/**
	 * @param homePage the homePage to set
	 */
	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}
}