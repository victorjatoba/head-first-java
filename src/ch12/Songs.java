import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Songs {

  public static void main(String[] args) {
    List<Song> songs = Songs.getSongs();
    List<Song> rockSongs = songs
      .stream()
      .filter(song -> song.getGenre().equals("Rock"))
      .collect(Collectors.toList());
    rockSongs.forEach(
      song -> System.out.println(song.getTitle() + " " + song.getArtist())
    );
  }

  static List<Song> getSongs() {
    return List.of(
      new Song("Smooth", "Santana", "Latin", 1999, 244),
      new Song("Immigrant", "Led Zeppelin", "Rock", 1970, 484),
      new Song("Pasos de cero", "Pablo Alborán", "Latin", 2014, 117),
      new Song("1", "Artist 1", "Latin", 2014, 117),
      new Song("2", "Artist 2", "Latin", 2014, 117),
      new Song("2", "Artist 3", "Latin", 2014, 117),
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
}
