import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<ItemOrder> contents;
	
	
	// Constructor initializes arrayList
	public ShoppingCart() {
		contents = new ArrayList<ItemOrder>();
	}
	
	
	// Method to add new items.
	public void addItem(String name, double price, int quantity) {
		Item temp = new Item(name, price);
		ItemOrder order = new ItemOrder(temp, quantity);
		contents.add(order);
	}
	
	
	// Two methods to remove items. One by name, and one by index.
	public void removeItem(String name) {
		for (int i = 0; i < contents.size(); i++) {
			ItemOrder thing = contents.get(i);
			if (thing.getName().equals(name)) {
				contents.remove(thing);
			}
		}
	}
	public void removeItem(int index) {
		contents.remove(index);
	}

	
	// Searches items and prints out the info for any matching items found.
	public void searchItem(String name) {
		int count = 0;
		for (int i = 0; i < contents.size(); i++) {
			ItemOrder thing = contents.get(i);
			if (thing.getName().equals(name)) {
				System.out.print("Index " + contents.indexOf(thing) + "\n" + thing + "\n \n");
				count++;
			}
		}
		if(count == 0) {
			System.out.println("Item " + name + " not found.");
		}
	}

	
	// Returns the total cost of the list
	public double totalCost(){
		double price = 0;
		for (int i = 0; i < contents.size(); i++) {
			ItemOrder thing = contents.get(i);
			price += thing.getPrice();
		}
		return price;
	}
	
	
	// Prints out every item in the cart.
	public void printCart() {
		System.out.println("-----");
		for (int i = 0; i < contents.size(); i++) {
			ItemOrder thing = contents.get(i);
			System.out.print("Index " + contents.indexOf(thing) + "\n" + thing + "\n \n");
		}
		System.out.println("Total Cost: $" + totalCost());
		System.out.println("-----");
	}


}