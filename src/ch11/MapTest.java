import java.util.HashMap;
import java.util.Map;

public class MapTest {

  public static void main(String[] args) {
    Map<String, Integer> rank = getMapNormal();

    Map<String, Integer> rankConvenienceFactory = getMapUsingConvenienceFactoryByJava9();

    Map<String, Integer> rankConvenienceMoreThan10Registers = getMapUsingConvenienceFactoryByJava9MoreThan10Registers();

    System.out.println(rank);
    System.out.println(rankConvenienceFactory);
    System.out.println(rankConvenienceMoreThan10Registers);
  }

private static Map<String, Integer> getMapUsingConvenienceFactoryByJava9MoreThan10Registers() {
    return Map.ofEntries(
      Map.entry("Sena", 10),
      Map.entry("Barrichello", 2)
    );
}

  private static Map<String, Integer> getMapUsingConvenienceFactoryByJava9() {
    Map<String, Integer> rankConvenienceFactoryJava9 = Map.of(
      "Sena",
      10,
      "Barrichello",
      2
    );
    return rankConvenienceFactoryJava9;
  }

  private static Map<String, Integer> getMapNormal() {
    Map<String, Integer> rank = new HashMap<>();
    rank.put("Sena", 10);
    rank.put("Barrichello", 2);
    return rank;
  }
}
