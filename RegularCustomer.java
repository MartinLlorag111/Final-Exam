public class RegularCustomer extends Customer 
{ 

	double calculateBill(){ 
		return amount; 
	} 

	RegularCustomer(String name, double amount){ 
		super(name, amount); 
	} 

}
