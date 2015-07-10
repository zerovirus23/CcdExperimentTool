package co.zero.ccd.alg.datecalculation.c;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import co.zero.ccd.alg.datecalculation.i.IDateCalculation;
import co.zero.ccd.model.ActivityProduct;

public class DataCalculationImpl2 extends DataCalculationBase implements IDateCalculation {
	private final Logger logger = LoggerFactory.getLogger(DataCalculationImpl2.class);
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
			Date datetmp = date;
			for(ActivityProduct a : activities){
				numHours = a.getHoursToProduce();
				Calendar c = Calendar.getInstance();
				c.setTime(datetmp); 
				c.add(Calendar.HOUR, numHours);
				datetmp = c.getTime();
			}
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dateFinish = sdf.format(datetmp);
			logger.info("2F="+dateFinish);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
	}
	public String getDateFinish(){
		return dateFinish;
	}
	
}
