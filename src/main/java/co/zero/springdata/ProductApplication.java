//=======================================================================
// ARCHIVO ProductApplication.java
// FECHA CREACIÓN: Jun 29, 2015
//=======================================================================
package co.zero.springdata;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.zero.model.Category;
import co.zero.model.Product;
import co.zero.model.Supplier;

/**
 * This class is a tool for population purpose to give the right
 * environment for architectural experiments
 * @author Hernán Tenjo
 * @version 1.0
 */
public class ProductApplication {
	private static final int MAX_ROWS = 10000000;
	
	/**
	 * Builds a product {@link Category} with random information 
	 * @return {@link Category} pojo with required information
	 */
	public static Category buildCategory(){
		Category category = new Category();
		category.setName(RandomStringUtils.random(255, true, true));
		category.setDescription(RandomStringUtils.random(255, true, true));
		category.setImageUrl(RandomStringUtils.random(255, true, true));
		return category;
	}
	
	/**
	 * Builds a product {@link Supplier} with random information 
	 * @return {@link Supplier} pojo with required information
	 */
	public static Supplier buildSupplier(){
		Supplier supplier = new Supplier();
		supplier.setAddress(RandomStringUtils.random(255, true, true));
		supplier.setCity(RandomStringUtils.random(255, true, true));
		supplier.setContactName(RandomStringUtils.random(255, true, true));
		supplier.setContactTitle(RandomStringUtils.random(255, true, true));
		supplier.setCountry(RandomStringUtils.random(255, true, true));
		supplier.setHomePage(RandomStringUtils.random(255, true, true));
		supplier.setName(RandomStringUtils.random(255, true, true));
		supplier.setPhone(RandomStringUtils.random(255, true, true));
		supplier.setPostalCode(RandomStringUtils.random(255, true, true));
		supplier.setRegion(RandomStringUtils.random(255, true, true));
		return supplier;
	}
	
	/**
	 * Builds a {@link Product} with random information
	 * @param supplier The {@link Supplier} of the product in the market
	 * @param category The {@link Category} of the product in the market
	 * @return {@link Product} pojo with required information
	 */
	public static Product buildProduct(Supplier supplier, Category category){
		Product product = new Product();
		product.setBigImgUrl(RandomStringUtils.random(255, true, true));
		product.setCategory(category);
		product.setCreationDate(new Date());
		product.setCreatorName(RandomStringUtils.random(255, true, true));
		product.setCurrencyFormat(RandomStringUtils.random(255, true, true));
		product.setDefaultLang(RandomStringUtils.random(255, true, true));
		product.setDescription(RandomStringUtils.random(255, true, true));
		product.setMediumImgUrl(RandomStringUtils.random(255, true, true));
		product.setModifiedDate(new Date());
		product.setName(RandomStringUtils.random(255, true, true));
		product.setShippingCode(RandomStringUtils.random(255, true, true));
		product.setSmallImgUrl(RandomStringUtils.random(255, true, true));
		product.setSpecialNotes(RandomStringUtils.random(255, true, true));
		product.setSupplier(supplier);
		product.setTaxCode(RandomStringUtils.random(255, true, true));
		product.setUnitPrice(1000);
		product.setUnitsInStock(1000000);
		product.setOtherField1(RandomStringUtils.random(255, true, true));
		product.setOtherField2(RandomStringUtils.random(255, true, true));
		product.setOtherField3(RandomStringUtils.random(255, true, true));
		product.setOtherField4(RandomStringUtils.random(255, true, true));
		product.setOtherField5(RandomStringUtils.random(255, true, true));
		product.setOtherField6(RandomStringUtils.random(255, true, true));
		product.setOtherField7(RandomStringUtils.random(255, true, true));
		product.setOtherField8(RandomStringUtils.random(255, true, true));
		product.setOtherField9(RandomStringUtils.random(255, true, true));
		product.setOtherField10(RandomStringUtils.random(255, true, true));
		product.setOtherField11(RandomStringUtils.random(255, true, true));
		product.setOtherField12(RandomStringUtils.random(255, true, true));
		product.setOtherField13(RandomStringUtils.random(255, true, true));
		product.setOtherField14(RandomStringUtils.random(255, true, true));
		product.setOtherField15(RandomStringUtils.random(255, true, true));
		product.setOtherField16(RandomStringUtils.random(255, true, true));
		product.setOtherField17(RandomStringUtils.random(255, true, true));
		product.setOtherField18(RandomStringUtils.random(255, true, true));
		product.setOtherField10(RandomStringUtils.random(255, true, true));
		product.setOtherField20(RandomStringUtils.random(255, true, true));
		return product;
	}
	
	/**
	 * Builds a list of {@link Category}
	 * @param numEntities Amount of {@link Category} required
	 * @param categoryDao Service to access DataBase
	 * @return List of categories created
	 */
	public static List<Category> buildCategories(int numEntities, CategoryDao categoryDao){
		List<Category> entities = new ArrayList<Category>();
		Category category;
		
		for(int i=0; i < numEntities; i++){
			category = ProductApplication.buildCategory();
			category = categoryDao.save(category);
			System.out.println(category.toString());
			entities.add(category);
		}
		
		return entities;
	}
	
	/**
	 * Builds a list of {@link Supplier}
	 * @param numEntities Amount of {@link Supplier} required
	 * @param supplierDao Service to access DataBase
	 * @return List of suppliers created
	 */
	public static List<Supplier> buildSuppliers(int numEntities, SupplierDao supplierDao){
		List<Supplier> entities = new ArrayList<Supplier>();
		Supplier supplier;
		
		for(int i=0; i < numEntities; i++){
			supplier = ProductApplication.buildSupplier();
			supplier = supplierDao.save(supplier);
			System.out.println(supplier.toString());
			entities.add(supplier);
		}
		
		return entities;
	}
	
	/**
	 * 
	 * @param numEntities
	 * @param productDao
	 * @param supplier
	 * @param category
	 * @return
	 */
	/**
	 * Builds a list of {@link Product}
	 * @param numEntities Amount of {@link Product} required
	 * @param productDao Service to access DataBase
	 * @param categories available {@link Category} already persisted
	 * @param suppliers available {@link Supplier} already persisted
	 * @return List of suppliers created
	 */
	public static void buildProducts(int numEntities, 
			ProductDao productDao, List<Category> categories, List<Supplier> suppliers){
		Product product;
		
		for(int i=0; i < numEntities; i++){
			Category category = categories.get(RandomUtils.nextInt(0, categories.size()));
			Supplier supplier = suppliers.get(RandomUtils.nextInt(0, suppliers.size()));
			product = ProductApplication.buildProduct(supplier, category);
			product = productDao.save(product);
			System.out.println(product.toString());
		}
	}
	
	/**
	 * Default entry point to the {@link ProductApplication} tools
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductDao productDao = context.getBean(ProductDao.class);
		SupplierDao supplierDao = context.getBean(SupplierDao.class);
		CategoryDao categoryDao = context.getBean(CategoryDao.class);
		
		List<Category> categories = buildCategories(10, categoryDao);
		List<Supplier> suppliers = buildSuppliers(100, supplierDao);
		buildProducts(MAX_ROWS, productDao, categories, suppliers);
		context.close();
	}
}

