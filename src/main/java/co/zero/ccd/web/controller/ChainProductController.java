//=======================================================================
// ARCHIVO ChainProductController.java
// FECHA CREACIÓN: jul 10, 2015
//=======================================================================
package co.zero.ccd.web.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.zero.ccd.alg.datecalculation.i.IDateCalculation;
import co.zero.ccd.factory.FactoryDateCalculation;
import co.zero.ccd.model.ActivityProduct;

/**
 * Controller that handle the request related with {@link ChainProduct} items
 * 
 * @author Diego Torrado
 * @version 1.0
 */
@Controller
public class ChainProductController {
	private final Logger logger = LoggerFactory.getLogger(ChainProductController.class);

	public ChainProductController() {
		super();
	}

	/**
	 * Method that give a date for a specific date with the given name
	 * 
	 * @param name
	 * @return
	 */
	@RequestMapping(value = "/chainProduct")
	public String defineDateReciveProduct(
			@RequestParam(value = "product", required = false, defaultValue = "") String product, Model model) {

		logger.info("Query the Activities...");
		List<ActivityProduct> la = new ArrayList<ActivityProduct>();
		la.add(new ActivityProduct("Buy the thinks", 1));
		la.add(new ActivityProduct("Trasportation", 10));
		la.add(new ActivityProduct("Cut", 1));
		la.add(new ActivityProduct("Page", 1));
		la.add(new ActivityProduct("Dry", 1));
		la.add(new ActivityProduct("Paint", 10));
		la.add(new ActivityProduct("Dry", 1));
		la.add(new ActivityProduct("Trasportation", 1));
		la.add(new ActivityProduct("Buy the thinks", 1));
		la.add(new ActivityProduct("Trasportation", 1));
		la.add(new ActivityProduct("Cut", 1));
		la.add(new ActivityProduct("Page", 1));
		la.add(new ActivityProduct("Dry", 1));
		la.add(new ActivityProduct("Paint", 19));
		la.add(new ActivityProduct("Dry", 1));
		la.add(new ActivityProduct("Trasportation", 1));

		Date date = new Date();

		logger.info("Define Date Recive Products...");
		logger.info("Now..."+date);
		List<IDateCalculation> l = new ArrayList<IDateCalculation>();
		for(int i =1 ; i <= 3;i++){
			logger.info("Instance..."+i);
			IDateCalculation calcule1 = FactoryDateCalculation.getInstance(i);			
			calcule1.iniInfo(la, date);
			calcule1.start();
			l.add(calcule1);
		}

		try {
			for (IDateCalculation dc : l) {
				dc.join();
			}
		} catch (Exception e) {
			logger.info("Interrupted");
		}

		model.addAttribute("dateReceive", selectDateAndDoNotification(l));

		return "chainProduct";
	}

	private String selectDateAndDoNotification(List<IDateCalculation> i) {
		List<String> da = new ArrayList<String>();
		if (i.size() > 0) {
			da.add(i.get(0).getDateFinish());
			for (IDateCalculation dc : i) {
				if (!da.contains(dc.getDateFinish())) {
					logger.error("Error componente - "+dc.getClass().getName());
					
				}
				
			}
			return da.get(0);
		}
		return "";
	}
}
