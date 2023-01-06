public class SeniorCustomer extends Customer 
{ 
	final static double discount = 0.20; 

	double calculateBill(){ 
		amount = amount - (amount * discount); 
		return amount; 
	} 

	SeniorCustomer(String name, int amount){ 
		super(name, amount); 
	} 

}
