public class Song implements Comparable<Song> {

  private String title;
  private String artist;

  Song(String title, String artist) {
    this.title = title;
    this.artist = artist;
  }

  public String getArtist() {
    return artist;
  }

  public String getTitle() {
    return title;
  }

  public String toString() {
    return title;
  }

  @Override
  public int compareTo(Song o) {
    return title.compareTo(o.getTitle());
  }
}
