import java.util.ArrayList;
import java.util.List;

// Interface for FoodItem
interface FoodItem {
    double getPrice();
    String getDescription();
}

// Concrete implementation of FoodItem
class BasicFoodItem implements FoodItem {
    private double price;
    private String description;

    public BasicFoodItem(double price, String description) {
        this.price = price;
        this.description = description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }
}

// Decorator for toppings
abstract class ToppingDecorator implements FoodItem {
    protected FoodItem baseFoodItem;

    public ToppingDecorator(FoodItem baseFoodItem) {
        this.baseFoodItem = baseFoodItem;
    }

    @Override
    public double getPrice() {
        return baseFoodItem.getPrice();
    }

    @Override
    public String getDescription() {
        return baseFoodItem.getDescription();
    }
}

// Concrete implementation of ToppingDecorator for ketchup
class Onion extends ToppingDecorator {
    private static final double COST = 1.0;

    public Onion(FoodItem baseFoodItem) {
        super(baseFoodItem);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + COST;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Onion";
    }
}

// Concrete implementation of ToppingDecorator for bacon topping
class Bacon extends ToppingDecorator {
    private static final double COST = 1.5;

    public Bacon(FoodItem baseFoodItem) {
        super(baseFoodItem);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + COST;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Bacon";
    }
}

class Order {
    private List<FoodItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(FoodItem item) {
        items.add(item);
    }

    public double calculateTotalCost() {
        double totalCost = 0.0;
        for (FoodItem item : items) {
            totalCost += item.getPrice();
        }
        return totalCost;
    }
    
    public int getSize() {
    	return items.size();
    }
    
    public void displayOrder() {
    	for (FoodItem item : items) {
    		System.out.println(item.getDescription());
        }
    }
}

class LoyaltyStatus {
    public static double applyDiscount(double totalCost, double discountPercentage) {
        return totalCost - (totalCost * discountPercentage);
    }
}
