//=======================================================================
// ARCHIVO SupplierDao.java
// FECHA CREACIÓN: Jun 29, 2015
//=======================================================================
package co.zero.ccd.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.zero.ccd.model.Supplier;

/**
 * Service to access the {@link Supplier} information from RDB
 * @author Hernán Tenjo
 * @version 1.0
 */
@Repository
public interface SupplierDao extends CrudRepository<Supplier, Long> {
	/**
	 * Finds the supplier with name containing the given name
	 * @param name String to filter suppliers by name
	 * @return List of suppliers with a name containing the parameter name
	 */
	List<Supplier> findByNameContainingIgnoreCase(String name);
}

