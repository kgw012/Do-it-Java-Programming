package witharraylist;

import java.util.ArrayList;

public class CustomerTest2 {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customer1 = new Customer(10010, "±Ë±Ê¿∫");
		Customer customer2 = new Customer(10011, "±Ë±Ê¿∫2");
		GoldCustomer customer3 = new GoldCustomer(10012, "±Ë±Ê±›");
		GoldCustomer customer4 = new GoldCustomer(10013, "±Ë±Ê±›2");
		VIPCustomer customer5 = new VIPCustomer(10014, "±Ë±Ê¬Ø");
		
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);
		
		
		for(Customer c : customerList) {
			c.showCustomerInfo();
		}
		
	}

}
