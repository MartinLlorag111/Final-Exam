public abstract class Customer 
{ 
	protected String name; 
	protected double amount; 

	Customer(String name, double amount){ 
		this.name = name; 
		this.amount = amount; 
	} 

	public void setName(String name){ 
		this.name = name; 
	} 

	public String getName(){ 
		return name; 
	} 

	public void setAmount(double amount){ 
		this.amount = amount; 
	} 

	public double getAmount(){ 
		return amount; 
	} 

	abstract double calculateBill(); 
}
