import java.util.*;

public class MockSongs {

  static List<Song> songs = new ArrayList<>();

  public static void main(String[] args) {
    setSongs();
    System.out.println("Before");
    System.out.println(songs);
    Collections.sort(songs);
    System.out.println("\nSort by title");
    System.out.println(songs);
    ArtistCompare artistCompare = new ArtistCompare();
    songs.sort(artistCompare);
    System.out.println("\nSort by artist");
    System.out.println(songs);
  }

  public static List<Song> getSongs() {
    return songs;
  }

  public static void setSongs() {
    songs.add(new Song("Canjica Nova", "Jatobá"));
    songs.add(new Song("cassidy", "Artist 1"));
    songs.add(new Song("Cassidy", "Artist 2"));
    songs.add(new Song("$10", "Artist 1"));
    songs.add(new Song("10", "Artist 3"));
    songs.add(new Song("Ways", "Artist 4"));
  }
}

class ArtistCompare implements Comparator<Song> {

  public int compare(Song s1, Song s2) {
    return s1.getArtist().compareTo(s2.getArtist());
  }
}
