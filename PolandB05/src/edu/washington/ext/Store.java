package edu.washington.ext;

import java.util.ArrayList;
import java.util.List;

public class Store {
	
	private int storeNumber;
	Manager manager;
	List <StoreEmployee> staff;
	
	public Store(int storeNumber) {
		staff = new ArrayList<StoreEmployee>();
		this.storeNumber = storeNumber;
	}
	
	public int getStoreNumber() {
		return storeNumber;
	}
	
	public List <PayrollRecord> processPayroll() {
		List<PayrollRecord> payroll = new ArrayList<PayrollRecord>();
		double storeSales = 0.0;
		for (StoreEmployee storeEmployee : staff) {
			PayrollRecord payRec = new PayrollRecord(storeEmployee.getName(),
					storeEmployee.calculatePay());
			payroll.add(payRec);
			storeSales += storeEmployee.getCurrentSales();
		}
		storeSales += manager.getCurrentSales();
		manager.setCurrentStoreSales(storeSales);
		payroll.add(new PayrollRecord(manager.getName(), manager.calculatePay()));
		return payroll;
		
	}
	
	public double getCurrentSales() {
		
	}
	
	public void addEmployee(StoreEmployee employee) {
		staff.add(employee);
	}
	
	public void setManager(Manager manager) {
		this.manager = new Manager("John Paul Jones");
	}

}
