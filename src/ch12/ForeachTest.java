import java.util.ArrayList;
import java.util.List;

public class ForeachTest {

  public static void main(String[] args) {
    List<String> allCollors = List.of("Red", "Blue", "Green");

    allCollors.forEach(color -> System.out.println(color));
  }
}
