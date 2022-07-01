import java.security.Principal;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class StatementsChecklist {

  public static void main(String[] args) {
    Runnable r = () -> System.out.println("Hi!");
    Consumer<Rabit> c = s -> System.out.println(s.size);
    // Supplier<String> s = () -> System.out.println("Some String"); // Should return a String but doesn't
    // Consumer<String> c = (s1, s2) -> System.out.println(s1 + s2); // Should take only one parameter but has two
    // Runnable r2 = (String str) -> System.out.println(str); // Should not have parameter
    Function<String, Integer> f = s -> s.length();
    Supplier<String> s = () -> "Some string";
    r.run();
    c.accept(new Rabit(2));
    System.out.println(s.get());

    CompleteName<User> completenameName = u ->
      System.out.println(u.firstName + " " + u.lastName);

    completenameName.print(new User("Victor", "Jatobá"));
  }
}

class Rabit {

  int size;

  Rabit(int size) {
    this.size = size;
  }
}

class User {

  String firstName;
  String lastName;

  User(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
}

@FunctionalInterface
abstract interface CompleteName<T> {
  abstract void print(T data);
}
