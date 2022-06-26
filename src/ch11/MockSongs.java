import java.util.*;

public class MockSongs {

  static List<Song> songs = new ArrayList<>();

  public static void main(String[] args) {
    setSongs();
    System.out.println("Before");
    System.out.println(songs);
    // Collections.sort(songs);
    System.out.println("\nAfter");
    System.out.println(songs);
  }

  public static List<Song> getSongs() {
    return songs;
  }

  public static void setSongs() {
    songs.add(new Song("Canjica Nova", "Jatobá"));
    songs.add(new Song("cassidy", "Artist 1"));
    songs.add(new Song("cassidy", "Artist 2"));
    songs.add(new Song("$10", "Artist 1"));
    songs.add(new Song("50", "Artist 3"));
    songs.add(new Song("Ways", "Artist 4"));
  }
}
