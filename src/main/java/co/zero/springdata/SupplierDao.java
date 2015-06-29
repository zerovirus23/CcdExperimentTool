//=======================================================================
// ARCHIVO ProductDao.java
// FECHA CREACIÓN: Jun 29, 2015
//=======================================================================
package co.zero.springdata;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.zero.model.Supplier;

/**
 * Descripción de la clase
 * @author Hernán Tenjo
 * @version 1.0
 */
@Repository
public interface SupplierDao extends CrudRepository<Supplier, Long> {

}

