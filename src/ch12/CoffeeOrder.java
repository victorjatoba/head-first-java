import java.util.*;
import java.util.stream.*;

public class CoffeeOrder {

  public static void main(String[] args) {
    List<String> coffees = List.of(
      "Cappuccino",
      "Americano",
      "Espresso",
      "Mocha"
    );
    List<String> coffeesEndingInO = coffees
      .stream()
      .distinct()
      .sorted()
      .filter(s -> s.endsWith("o"))
      .collect(Collectors.toList());

    System.out.println(coffeesEndingInO);
  }
}
