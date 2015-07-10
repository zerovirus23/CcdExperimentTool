package co.zero.ccd.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import co.zero.ccd.alg.datecalculation.c.DataCalculationBase;
import co.zero.ccd.alg.datecalculation.c.DataCalculationImpl1;
import co.zero.ccd.alg.datecalculation.c.DataCalculationImpl2;
import co.zero.ccd.alg.datecalculation.c.DataCalculationImpl3;
import co.zero.ccd.alg.datecalculation.i.IDateCalculation;

public  class  FactoryDateCalculation {
	private final static  Logger logger = LoggerFactory.getLogger(FactoryDateCalculation.class);

	public static IDateCalculation getInstance(int i){
		IDateCalculation d = null;
		if(i == 1){
			logger.info("Instance of DataCalculationImpl1");
			d = new DataCalculationImpl1();
		}else if (i == 2){
			logger.info("Instance of DataCalculationImpl2");
			d = new DataCalculationImpl2();
		}else if (i == 3){
			logger.info("Instance of DataCalculationImpl3");
			d = new DataCalculationImpl3();
		}else{
			logger.info("Instance of DataCalculationImpl4");
			d = new DataCalculationImpl1();
		}
		return d;
	}
}
