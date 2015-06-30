//=======================================================================
// ARCHIVO SupplierController.java
// FECHA CREACIÓN: Jun 29, 2015
//=======================================================================
package co.zero.ccd.web.controller;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.zero.ccd.data.SupplierDao;
import co.zero.ccd.model.Supplier;

/**
 * Controller that handle the request related with {@link Supplier} items
 * @author Hernán Tenjo
 * @version 1.0
 */
@Controller
public class SupplierController {
	private final Logger logger = LoggerFactory.getLogger(SupplierController.class);
	private final SupplierDao supplierDao;
	
	/**
	 * Constructor with the ProductDao as a 
	 * @param productDao
	 */
	@Autowired
	public SupplierController(SupplierDao supplierDao) {
		super();
		this.supplierDao = supplierDao;
	}



	/**
	 * Method that search for suppliers with the given name
	 * @param name
	 * @return
	 */
	@RequestMapping(value="/searchSupplier")
	public String searchByName(@RequestParam(value="name", required=false, defaultValue="")
		String name, Model model){
		
		if(StringUtils.isNotBlank(name)){
			logger.info("Searching suppliers...");
			model.addAttribute("suppliers", supplierDao.findByNameContainingIgnoreCase(name));
		}
		
		return "searchSupplier";
	}
}

