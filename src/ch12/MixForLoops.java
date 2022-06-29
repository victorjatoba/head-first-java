import java.util.List;
import java.util.stream.Collectors;

public class MixForLoops {

  public static void main(String[] args) {
    List<Integer> nums = List.of(7, 6, 1, 2, 3, 4, 5);
    List<Integer> firstSorted = nums
      .stream()
      .sorted()
      .limit(3)
      .collect(Collectors.toList());

    System.out.println(firstSorted);
  }
}
