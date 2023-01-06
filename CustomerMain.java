 class Main { 
	public static void main(String[] args) { 
		Customer customer; 
		RegularCustomer regularCustomer = new RegularCustomer("Merl", 3000); 
		SeniorCustomer seniorCustomer = new SeniorCustomer("Marshan", 3000); 

		customer = regularCustomer; 
		System.out.println(customer.getName()+" " +customer.calculateBill()); 

		customer = seniorCustomer; 
		System.out.println(customer.getName()+" "+customer.calculateBill()); 
	} 
}
