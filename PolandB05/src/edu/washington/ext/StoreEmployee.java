package edu.washington.ext;

public class StoreEmployee implements Employee{
	
	private double currentHours;
	private double hourlyRate;
	private String name;
	private double currentSales;
	
	public StoreEmployee(String name) {
		this.name = name;
	}
	
	public void setCurrentSales(double sales) {
		currentSales = sales;
	}
	
	public double getCurrentSales() {
		return currentSales;
	}
	
	public void setHourlyRate(double rate) {
		hourlyRate = rate;
	}
	
	public void setCurrentHours(double hours) {
		currentHours = hours;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double calculatePay() {
		return hourlyRate * currentHours;
	}
	
	

}
