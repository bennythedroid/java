package edu.washington.ext;

public class SalesAssociate  extends StoreEmployee{
	
	private double commissionRate;
	
	public SalesAssociate(String name) {
		super(name);
	}
	
	public void setCommissionRate(double rate) {
		this.commissionRate = rate;
	}
	
	public double calculatePay() {
		return super.getCurrentSales() * commissionRate;
	}

}
