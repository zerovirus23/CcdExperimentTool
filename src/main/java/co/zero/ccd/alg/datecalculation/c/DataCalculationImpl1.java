package co.zero.ccd.alg.datecalculation.c;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import co.zero.ccd.alg.datecalculation.i.IDateCalculation;
import co.zero.ccd.model.ActivityProduct;

public class DataCalculationImpl1 extends DataCalculationBase implements IDateCalculation {
	private final Logger logger = LoggerFactory.getLogger(DataCalculationImpl1.class);
	private String dateFinish;
	private List<ActivityProduct> activities;
	private Date date;
	
	@Override
	public void iniInfo(List<ActivityProduct> activities,Date date) {
		this.activities = activities;
		this.date = date;
		this.dateFinish="";
	}

	@Override
	protected void calcular() {
		
		try {
			int numHours =0;
			for(ActivityProduct a : activities){
				numHours += a.getHoursToProduce();
			}
			logger.info("numHours="+numHours);
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			int numDays = (int)Math.round(numHours/24);
			logger.info("AddDays="+numDays);
			c.add(Calendar.DATE, numDays); 
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dateFinish = sdf.format(c.getTime());
			logger.info("F1="+dateFinish);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
	}
	public String getDateFinish(){
		return dateFinish;
	}
}
