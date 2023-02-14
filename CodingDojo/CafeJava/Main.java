package assignments.CafeJava;

public class Main {
  public static void main(String[] args) {
    double dripCoffeePrice = 2.5;
    double lattePrice = 4.0;
    double cappuccinoPrice = 3.75;

    String customerSam = "Sam";
    String customerJimmy = "Jimmy";
    String customerNoah = "Noah";

    boolean samIsReady = true;
    boolean jimmyIsReady = true;
    boolean noahIsReady = false;

    // Cindhuri ordered a coffee
    if (samIsReady) {
      System.out.println("Cindhuri's coffee is ready!");
    } else {
      System.out.println("Cindhuri's coffee is not ready yet.");
    }

    // Noah ordered a cappuccino
    if (noahIsReady) {
      System.out.println("Noah's cappuccino is ready!");
      double total = cappuccinoPrice;
      System.out.println("Total: $" + total);
    } else {
      System.out.println("Noah's cappuccino is not ready yet.");
    }

    // Sam just ordered 2 lattes
    double total = 2 * lattePrice;
    System.out.println("Sam's 2 lattes total: $" + total);

    if (samIsReady) {
      System.out.println("Sam's lattes are ready!");
    } else {
      System.out.println("Sam's lattes are not ready yet.");
    }

    // Jimmy just realized he was charged for a coffee but had ordered a latte
    double coffeePrice = dripCoffeePrice;
    lattePrice = 4.0;
    total = lattePrice - coffeePrice;
    System.out.println("Jimmy's total with the correct drink: $" + total);

    // Changing the price values and statuses
    dripCoffeePrice = 2.0;
    lattePrice = 3.5;
    cappuccinoPrice = 3.5;
    samIsReady = false;
    jimmyIsReady = false;
    noahIsReady = true;
  }
}
