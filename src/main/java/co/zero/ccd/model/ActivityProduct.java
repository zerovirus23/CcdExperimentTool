package co.zero.ccd.model;

public class ActivityProduct {
	private String name;
	private int  hoursToProduce;
	public ActivityProduct(String name, int hoursToProduce) {
		super();
		this.name = name;
		this.hoursToProduce = hoursToProduce;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHoursToProduce() {
		return hoursToProduce;
	}
	public void setHoursToProduce(int hoursToProduce) {
		this.hoursToProduce = hoursToProduce;
	}
}
