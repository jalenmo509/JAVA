import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
        Item mocha = new Item("Mocha", 5.0);
        Item latte = new Item("Latte", 4.5);
        Item dripCoffee = new Item("Drip Coffee", 3.0);
        Item cappuccino = new Item("Cappuccino", 4.0);

        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

        System.out.println("Order1: " + order1);
        System.out.println("Order1 Total: " + order1.getTotal());

        order2.addItem(mocha);
        System.out.println("Order2 Total: " + order2.getTotal());

        order3.addItem(cappuccino);
        System.out.println("Order3 Total: " + order3.getTotal());

        order4.addItem(latte);
        System.out.println("Order4 Total: " + order4.getTotal());
    }
  }