//=======================================================================
// ARCHIVO Category.java
// FECHA CREACIÓN: Jun 29, 2015
//=======================================================================
package co.zero.model;

import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * Descripción de la clase
 * @author Hernán Tenjo
 * @version 1.0
 */
@Entity
public class Category extends AbstractPersistable<Long>{
	private static final long serialVersionUID = 1L;
	private String name;
	private String description;
	private String imageUrl;
	
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
	 * @return the imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}
	/**
	 * @param imageUrl the imageUrl to set
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
}