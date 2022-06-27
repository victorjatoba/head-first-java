import java.util.*;

public class MockSongs {

  static List<Song> songs = new ArrayList<>();

  public static void main(String[] args) {
    setSongs();
    System.out.println("Before");
    System.out.println(songs);

    System.out.println("\nSort by title [Collections.sort]");
    Collections.sort(songs);
    System.out.println(songs);

    songs.sort(
      (first, second) -> first.getArtist().compareTo(second.getArtist())
    );

    System.out.println("\nSort by artist [List.sort]");
    System.out.println(songs);

    System.out.println("\nUse Set to remove duplicates");
    Set<Song> set = new HashSet<>(songs);
    System.out.println(set);
  }

  public static List<Song> getSongs() {
    return songs;
  }

  public static void setSongs() {
    songs.add(new Song("Canjica Nova", "Jatobá"));
    songs.add(new Song("Canjica Nova", "Jatobá"));
    songs.add(new Song("cassidy", "Artist 1"));
    songs.add(new Song("Cassidy", "Artist 2"));
    songs.add(new Song("$10", "Artist 1"));
    songs.add(new Song("10", "Artist 3"));
    songs.add(new Song("Ways", "Artist 4"));
    songs.add(new Song("Duplicated only title", "Artist 1"));
    songs.add(new Song("Duplicated only title", "Artist 4"));
    songs.add(new Song("Duplicated", "Artist 1"));
    songs.add(new Song("Duplicated", "Artist 1"));
  }
}

class ArtistCompare implements Comparator<Song> {

  public int compare(Song s1, Song s2) {
    return s1.getArtist().compareTo(s2.getArtist());
  }
}
