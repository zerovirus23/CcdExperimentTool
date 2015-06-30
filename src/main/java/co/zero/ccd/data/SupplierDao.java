//=======================================================================
// ARCHIVO SupplierDao.java
// FECHA CREACIÓN: Jun 29, 2015
//=======================================================================
package co.zero.ccd.data;

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

}

