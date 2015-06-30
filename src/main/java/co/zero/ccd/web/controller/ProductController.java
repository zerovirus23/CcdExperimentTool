//=======================================================================
// ARCHIVO ProductController.java
// FECHA CREACIÓN: Jun 29, 2015
//=======================================================================
package co.zero.ccd.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import co.zero.ccd.data.ProductDao;
import co.zero.ccd.model.Product;

/**
 * Controller that handle the request related with {@link Product} items
 * @author Hernán Tenjo
 * @version 1.0
 */
@Controller
public class ProductController {
	private final Logger logger = LoggerFactory.getLogger(ProductController.class);
	private final ProductDao productDao;
	
	@Autowired
	public ProductController(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}



	/**
	 * Method that search for products with the given name
	 * @param name
	 * @return
	 */
	@RequestMapping()
	public List<Product> searchByName(String name){
		return productDao.findByNameContainingIgnoreCase(name);
	}
}

