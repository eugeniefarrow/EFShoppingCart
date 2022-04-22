public class Item {
	//Declare instance variables
	private String name;
	private double price;
	
	//Simple constructor
	public Item(String nam, double money) {
		setName(nam);
		setPrice(money);
	}

	
	// Basic getters and setters allow variables to be easily changed
	public String getName() 
	{return name;}
	public void setName(String name) 
	{this.name = name;}
	public double getPrice() 
	{return price;}
	public void setPrice(double price) 
	{this.price = price;}
	
	
}