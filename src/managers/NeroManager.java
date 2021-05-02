package managers;

import interfaces.BaseManager;
import models.Customer;
import verifications.MernisVerification;

public class NeroManager implements BaseManager{

	
	final MernisVerification verification;
	
	public NeroManager(MernisVerification verification) {
		this.verification = verification;
	}
	
	@Override
	public void addCustomer(Customer customer) {
		if(verification.verify(customer) == true) {
			System.out.println(customer.getFirstName() + " Nero Kayıt Başarılı");
		}else {
			System.out.println(customer.getFirstName() + " Nero Kayıt Başarısız");
		}
	}
	
	@Override
	public void buyCoffee(Customer customer) {
		System.out.println(customer.getFirstName() + " kahveniz başarıyla alındı ve yıldızınız eklendi");
		
	}


}
