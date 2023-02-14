import java.util.Scanner;
import java.util.ArrayList;

public class CafeUtil {

  private static final int STREAK_GOAL = 10;
  private static final double[] PRICES = { 3.5, 1.5, 4.0, 4.5 };
  static final String[] MENU = { "drip coffee", "cappuccino", "latte", "mocha" };

  public int getStreakGoal() {
    return STREAK_GOAL;
  }

  public void printPriceChart() {
    System.out.println("Price Chart:");
    for (int i = 0; i < MENU.length; i++) {
      System.out.println(MENU[i] + ": $" + PRICES[i]);
    }
    System.out.println();
  }

  public double getOrderTotal(double[] lineItems) {
    double total = 0;
    for (double item : lineItems) {
      total += item;
    }
    return total;
  }

  public void displayMenu(String[] menu) {
    System.out.println("Menu:");
    for (String item : menu) {
      System.out.println(item);
    }
    System.out.println();
  }

  public ArrayList<String> addCustomer() {
    ArrayList<String> customers = new ArrayList<>();
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter a customer name (or 'q' to quit): ");
      String name = input.nextLine();
      while (!name.equals("q")) {
        customers.add(name);
        System.out.print("Enter another customer name (or 'q' to quit): ");
        name = input.nextLine();
      }
    }
    System.out.println("Customers: " + customers);
    return customers;
  }

  public String[] getMenu() {
    return MENU;
  }

}
