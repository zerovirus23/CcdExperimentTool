//=======================================================================
// ARCHIVO ProductDao.java
// FECHA CREACIÓN: Jun 29, 2015
//=======================================================================
package co.zero.ccd.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.zero.ccd.model.Product;

/**
 * Service to access the {@link Product} information from RDB
 * @author Hernán Tenjo
 * @version 1.0
 */
@Repository
public interface ProductDao extends CrudRepository<Product, Long> {
	/**
	 * Finds the product with name containing the given name
	 * @param name String to filter products by name
	 * @return List of products with a name containing the parameter name
	 */
	List<Product> findByNameContainingIgnoreCase(String name);
}