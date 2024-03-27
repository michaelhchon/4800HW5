
public class OrderDriver {

	public static void main(String[] args) {
		// Create food items
        FoodItem burger = new BasicFoodItem(5.0, "Burger");
        FoodItem fries = new BasicFoodItem(1.5, "Fries");
        FoodItem hotdog = new BasicFoodItem(4.0, "Hot Dog");

        // Add toppings
        FoodItem burgerToppingOne = new Onion(burger);
        FoodItem burgerToppingTwo = new Bacon(burgerToppingOne);

        // Create order
        Order order = new Order();
        order.addItem(burgerToppingTwo);
        order.addItem(fries);
        order.addItem(hotdog);

        // Print order
        System.out.println("Order: ");
        order.displayOrder();
        
        // Calculate total cost
        double totalCost = order.calculateTotalCost();
        System.out.println("Total cost before discount: $" + totalCost);

        // Apply loyalty discount
        double discountPercentage = 0.1;
        totalCost = LoyaltyStatus.applyDiscount(totalCost, discountPercentage);
        System.out.println("Total cost after discount: $" + totalCost);
	}

}
