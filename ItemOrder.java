public class ItemOrder{
	
	// Instance variables
	private Item subject;
	private int quantity;
	
	
	// Constructor takes in an item, and a quantity
	public ItemOrder(Item thing, int num) {
		setSubject(thing);
		setQuantity(num);
	}

  // Gets the total price for the item order
	public double getPrice() {
		double price = subject.getPrice() * quantity;
		return (price);
	}
	
	
	// Allows each order to be displayed neatly as a formatted string. Includes newline markers.
	public String toString() {
		String itemName = subject.getName();
		double price = subject.getPrice() * quantity;
		
		return("Item Name: " + itemName + "\nQuantity: " + quantity + "\nPrice: " + price);
	}
	
		
	// getters and setters allow any variables to be changed.
	public Item getSubject() 	{
    return subject;
  }

	public void setSubject(Item subject) {
    this.subject = subject;
  }
	public int getQuantity() {
    return quantity;
  }
  
	public void setQuantity(int quantity)	{
    this.quantity = quantity;
  }
	public String getName()	{
    return(subject.getName());
  }
	public void setName(String name){
    subject.setName(name);
  }


}