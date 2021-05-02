import managers.NeroManager;
import managers.StarbucksManager;
import models.Customer;
import verifications.MernisVerification;

public class Main {

	public static void main(String[] args) {
		Customer burak = new Customer();
		burak.setId(0);
		burak.setFirstName("Burak");
		burak.setLastName("İmdat");
		burak.setDateOfBirth("04.06.2002");
		burak.setNationalityId("123456781981");
		
		Customer engin = new Customer();
		engin.setId(0);
		engin.setFirstName("Engin");
		engin.setLastName("Demiroğ");
		engin.setDateOfBirth("06.01.1986");
		engin.setNationalityId("11122233444");
		
		
		NeroManager neroManager = new NeroManager(new MernisVerification());
		neroManager.addCustomer(burak);
		neroManager.buyCoffee(burak);
		System.out.println();
		neroManager.addCustomer(engin);
		neroManager.buyCoffee(engin);
		
		System.out.println();
		System.out.println();
		
		StarbucksManager starbucksManager = new StarbucksManager();
		starbucksManager.addCustomer(burak);
		starbucksManager.buyCoffee(burak);
		System.out.println();
		starbucksManager.addCustomer(engin);
		starbucksManager.buyCoffee(engin);
		
	}
}
