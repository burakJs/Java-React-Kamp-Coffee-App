package managers;

import interfaces.BaseManager;
import models.Customer;

public class StarbucksManager implements BaseManager{

	
	@Override
	public void addCustomer(Customer customer) {
		System.out.println(customer.getFirstName() + " Starbucks Kayıt Başarılı");
	}

	@Override
	public void buyCoffee(Customer customer) {
		System.out.println(customer.getFirstName() + " kahveniz başarıyla alındı");
		
	}
	
}
