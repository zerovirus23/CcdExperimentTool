//=======================================================================
// ARCHIVO ProductDao.java
// FECHA CREACIÓN: Jun 29, 2015
//=======================================================================
package co.zero.ccd.data;

import java.util.Collection;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.solr.repository.Highlight;
import org.springframework.stereotype.Repository;

import co.zero.ccd.model.Product;

/**
 * Service to access the {@link Product} information from RDB
 * @author Hernán Tenjo
 * @version 1.0
 */
@Repository
public interface ProductDao extends CrudRepository<Product, Long> { //SolrCrudRepository<Product, Long> {
	/**
	 * Finds the product with name containing the given name
	 * @param name String to filter products by name
	 * @return List of products with a name containing the parameter name
	 */
	@Cacheable(value="productFindCache", key="#p0")
	List<Product> findByNameContainingIgnoreCase(String name);
	
	@Highlight
	List<Product> findByNameIn(Collection<String> name);
}