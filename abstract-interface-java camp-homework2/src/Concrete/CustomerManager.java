package Concrete;

import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entity.Customer;


public class CustomerManager implements ICustomerService {
	 private ICustomerCheckService customerCheckService;
	 private boolean checkPlayer = false; 
	 
	public CustomerManager(ICustomerCheckService customerCheckService){
		this.customerCheckService=customerCheckService;	
	}
	
	
	@Override
	public void add(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println(customer.getFirstName()+" "+customer.getLastName()+" saved to database");
			checkPlayer=true;
		}
		else {
			System.out.println("not a valid person! Please enter the correct informations");
			checkPlayer=false;
		}
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName()+" "+customer.getLastName()+" deleted");
		
	}

	@Override
	public void update(Customer customer, Customer customer2) {
		System.out.println(customer.getFirstName()+" "+customer.getLastName()+" updated as : "+customer2.getFirstName()+" "+customer2.getLastName());		
	}
	
	 public boolean isCheckPlayer() {
		return checkPlayer;
	}

}
