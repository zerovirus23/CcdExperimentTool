package co.zero.ccd.alg.datecalculation.i;

import java.util.Date;
import java.util.List;

import co.zero.ccd.model.ActivityProduct;

public interface IDateCalculation {
  void iniInfo(List<ActivityProduct> activities, Date date);
  void start();
  public void join() throws InterruptedException;
  String getDateFinish();
}
