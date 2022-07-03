import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Songs {

  public static void main(String[] args) {
    List<Song> songs = Songs.getSongs();
    System.out.println("Rock songs:");
    getRockSongs(songs).forEach(song -> print(song));
    System.out.println("All distinct genres:");
    getDistinctGenres(songs).forEach(genre -> System.out.println(" " + genre));
    System.out.println("Ordered by year:");
    getOrderedSongsByYear(songs)
      .forEach(
        s -> System.out.println(" " + s.toString() + " (" + s.getYear() + ")")
      );
  }

  private static List<Song> getOrderedSongsByYear(List<Song> songs) {
    return songs
      .stream()
      // .sorted((a, b) -> a.getYear() - b.getYear())
      .sorted(Comparator.comparingInt(Song::getYear))
      .collect(Collectors.toList());
  }

  private static List<String> getDistinctGenres(List<Song> songs) {
    return songs
      .stream()
      .map(song -> song.getGenre())
      .distinct()
      .collect(Collectors.toList());
  }

  private static void print(Song song) {
    System.out.println(" " + song.getTitle() + " " + song.getArtist());
  }

  /**
   * Lou's exercise #02
   * @param songs
   * @return
   */
  private static List<Song> getRockSongs(List<Song> songs) {
    List<Song> rockSongs = songs
      .stream()
      .filter(song -> song.getGenre().equals("Rock"))
      .collect(Collectors.toList());
    return rockSongs;
  }

  static List<Song> getSongs() {
    return List.of(
      new Song("Smooth", "Santana", "Latin", 1999, 244),
      new Song("Immigrant", "Led Zeppelin", "Rock", 1970, 484),
      new Song("Pasos de cero", "Pablo Alborán", "Latin", 2014, 117),
      new Song("1", "Artist 1", "Latin", 2011, 117),
      new Song("2", "Artist 2", "Latin", 2000, 117),
      new Song("2", "Artist 3", "Latin", 2009, 117),
      new Song("We'll rock", "Queen", "Rock", 1992, 321)
    );
  }
}

class Song {

  private final String title;
  private final String artist;
  private final String genre;
  private final int year;

  private final int timesPlayed;

  public Song(
    String title,
    String artist,
    String genre,
    int year,
    int timesPlayed
  ) {
    this.title = title;
    this.artist = artist;
    this.genre = genre;
    this.year = year;
    this.timesPlayed = timesPlayed;
  }

  public String getTitle() {
    return title;
  }

  public String getArtist() {
    return artist;
  }

  public String getGenre() {
    return genre;
  }

  public int getYear() {
    return year;
  }

  public int getTimesPlayed() {
    return timesPlayed;
  }

  @Override
  public String toString() {
    return getTitle() + " by " + getArtist();
  }
}
