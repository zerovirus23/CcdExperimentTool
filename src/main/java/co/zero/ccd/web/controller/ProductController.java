//=======================================================================
// ARCHIVO ProductController.java
// FECHA CREACIÓN: Jun 29, 2015
//=======================================================================
package co.zero.ccd.web.controller;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	/**
	 * Constructor with the ProductDao as a parameter 
	 * @param productDao Service to access data
	 */
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
	@RequestMapping(value="/searchProduct")
	public String searchByName(@RequestParam(value="name", required=false, defaultValue="")
		String name, Model model){
		logger.info("Searching products...");
		
		if(StringUtils.isNotBlank(name)){
			List<Product> products = productDao.findByNameContainingIgnoreCase(name);
			logger.info("Products found..." + products.size());
			model.addAttribute("products", products);
		}
		
		return "searchProduct";
	}
}

