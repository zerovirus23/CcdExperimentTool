//=======================================================================
// ARCHIVO ProductController.java
// FECHA CREACIÓN: Jun 29, 2015
//=======================================================================
package co.zero.ccd.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.zero.ccd.data.CategoryDao;
import co.zero.ccd.data.ProductDao;
import co.zero.ccd.data.SupplierDao;
import co.zero.ccd.model.Category;
import co.zero.ccd.model.Supplier;
import co.zero.ccd.test.ProductApplication;

/**
 * Controller that initiate the required data for testing purpose
 * @author Hernán Tenjo
 * @version 1.0
 */
@Controller
public class LoaderController {
	private final ProductDao productDao;
	private final CategoryDao categoryDao;
	private final SupplierDao supplierDao;
	private static final int DEFAULT_INTERNAL_INSTANCES = 10;
	
	/**
	 * Constructor with the ProductDao as a parameter 
	 * @param productDao Service to access data
	 */
	@Autowired
	public LoaderController(ProductDao productDao, 
			CategoryDao categoryDao, SupplierDao supplierDao) {
		this.productDao = productDao;
		this.categoryDao = categoryDao;
		this.supplierDao = supplierDao;
	}

	/**
	 * Load information related with suppliers
	 */
	@RequestMapping(value="/loadSuppliers")
	public String loadSuppliers(@RequestParam(value="amount", required=false, defaultValue="0") 
		int amount, Model model){
		List<Supplier> suppliers = ProductApplication.buildSuppliers(amount, supplierDao);
		model.addAttribute("message", suppliers.size());
		model.addAttribute("fromPage", "suppliers");
		return "loadInfo";
	}
	
	/**
	 * Load information related with products
	 */
	@RequestMapping(value="/loadProducts")
	public String loadProducts(@RequestParam(value="amount", required=false, defaultValue="0") 
		int amount, Model model){
		
		if(amount > 0){
			List<Supplier> suppliers = ProductApplication.buildSuppliers(DEFAULT_INTERNAL_INSTANCES, supplierDao);
			List<Category> categories = ProductApplication.buildCategories(DEFAULT_INTERNAL_INSTANCES, categoryDao);
			ProductApplication.buildProducts(amount, productDao, categories, suppliers);
			model.addAttribute("message", suppliers.size());
		}
		
		model.addAttribute("fromPage", "products");
		return "loadInfo";
	}
	
	/**
	 * Load information related with categories
	 */
	@RequestMapping(value="/loadCategories")
	public String loadCategories(@RequestParam(value="amount", required=false, defaultValue="0") 
		int amount, Model model){
		List<Category> categories = ProductApplication.buildCategories(amount, categoryDao);
		model.addAttribute("message", categories.size());
		model.addAttribute("fromPage", "categories");
		return "loadInfo";
	}
}

