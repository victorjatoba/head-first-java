import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class StatementsChecklist {

  public static void main(String[] args) {
    Runnable r = () -> System.out.println("Hi!");
    Consumer c = s -> System.out.println(s);
    // Supplier<String> s = () -> System.out.println("Some String"); // Should return a String but doesn't
    // Consumer<String> c = (s1, s2) -> System.out.println(s1 + s2); // Should take only one parameter but has two
    Function<String, Integer> f = s -> s.length();
  }
}
