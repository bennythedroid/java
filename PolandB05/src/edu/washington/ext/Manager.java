package edu.washington.ext;

public class Manager implements Employee {
	
	private static double bonusRate;
	private String name;
	private double basePay;
	private double currentStoreSales;
	private double currentSales;
	
	public Manager(String name) {
		this.name = name;
	}
	
	public static void setBonusRate(double bonusRate) {
		Manager.bonusRate = bonusRate;
	}
	
	public void setCurrentSales(double sales) {
		this.currentSales = sales;
	}
	
	public double getCurrentSales() {
		return this.currentSales;
	}
	
	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}
	
	public void setCurrentStoreSales(double currentSales) {
		this.currentStoreSales = currentSales;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double calculatePay() {
		return basePay + currentStoreSales * bonusRate;
	}

}
