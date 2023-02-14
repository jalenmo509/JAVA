import java.util.ArrayList;

public class CafeUtilTest {
  public static void main(String[] args) {
    CafeUtil cafe = new CafeUtil();

    System.out.println("Streak goal: " + cafe.getStreakGoal());

    cafe.printPriceChart();

    double[] order = {3.5, 1.5, 4.0};
    System.out.println("Order total: $" + cafe.getOrderTotal(order));

    cafe.displayMenu(cafe.getMenu());

    ArrayList<String> customers = cafe.addCustomer();
    System.out.println("Number of customers: " + customers.size());
  }
}
