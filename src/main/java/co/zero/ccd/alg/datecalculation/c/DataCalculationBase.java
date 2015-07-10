package co.zero.ccd.alg.datecalculation.c;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import co.zero.ccd.web.controller.ChainProductController;

public abstract class DataCalculationBase extends Thread {
	private final Logger logger = LoggerFactory.getLogger(DataCalculationBase.class);
	private Thread t;

	protected abstract void calcular();

	public void run() {
		logger.info("Calculando..");
		calcular();
	}

	public void start() {
		if (t == null) {
			t = new Thread(this);
			t.start();
		}
	}
	
	
}
