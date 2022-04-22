class Main {
  public static void main(String[] args) {
    ShoppingCart petCo = new ShoppingCart();
		
		// We want to purchase 4 hamsters, which cost $20.45 per.
		petCo.addItem("Hamster", 20.45, 4);
		
		// We also want to purchase a flock of ferrets. Ferrets are more expensive.
		// This will basically cost my life savings. #WORTH IT.
		petCo.addItem("Ferret", 56.72, 34);
		
		// We need to purchase some food and bedding as well.
		// We need a lot, because we just purchased a ton of ferrets.
		// ferrets are pretty neat.
		petCo.addItem("Bag of small animal bedding", 8.45, 20);
		
		// These lil guys also need to eat
		petCo.addItem("Snake food", 4.00, 5);
		
		// Oops, we got the wrong food, lets get rid of that
		petCo.removeItem("Snake food");
		
		// We need ferret food.
		petCo.addItem("Ferret food", 5.24, 12);
		
		//Lets prove the search function by reiterating my purchase of an absurd quantity of ferrets
		petCo.searchItem("Ferret");
		
		// And my hamster purchase
		petCo.searchItem("Hamster");
		
		// Did I buy a dog?
		petCo.searchItem("Dog");
		
		// Lets check the entire list
		petCo.printCart();
  }
}