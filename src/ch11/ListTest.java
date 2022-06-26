import java.util.*;

public class ListTest {

  static List<String> songs = new ArrayList<>();

  public static void main(String[] args) {
    setSongs();
    System.out.println("Before");
    System.out.println(songs);
    Collections.sort(songs);
    System.out.println("\nAfter");
    System.out.println(songs);
  }

  public static List<String> getSongs() {
    return songs;
  }

  public static void setSongs() {
    songs.add("somersault");
    songs.add("cassidy");
    songs.add("$10");
    songs.add("50");
    songs.add("Ways");
  }
}
