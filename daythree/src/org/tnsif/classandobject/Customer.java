package org.tnsif.classandobject;

public class Customer {
	private int customerId;
	private String customerName;
	private String city;

	public int getCustomerId() {
		return customerId;
	}

	public Customer() {
		super();
		
	}

	public void setCustomerId(int customerId) {
		
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", city=" + city + "]";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Customer(int customerId, String customerName, String city) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.city = city;
	}

	
}
