package verifications;

import interfaces.BaseVerification;
import models.Customer;

public class MernisVerification implements BaseVerification{

	@Override
	public boolean verify(Customer customer) {
		if(customer.getNationalityId().length() == 11 ) {
			return true;
		}
		return false;
	}

	
}
