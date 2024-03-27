import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {
    Order order = new Order();

    @Test
    public void testAddItem() {
        Order order = new Order();
        // Add one item to the order
        order.addItem(new BasicFoodItem(5.0, "Burger"));
        // Verify the order size after adding one item
        assertEquals(1, order.getSize());
    }

    @Test
    public void testCalculateTotalCost() {
        Order order = new Order();
        // Add multiple items to the order
        order.addItem(new BasicFoodItem(5.0, "Burger"));
        order.addItem(new BasicFoodItem(2.5, "Fries"));
        // Verify the total cost calculation
        assertEquals(7.5, order.calculateTotalCost(), 0.001);
    }
}
