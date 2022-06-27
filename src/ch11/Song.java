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
    return "'" + title + " by " + artist + "'";
  }

  @Override
  public int compareTo(Song o) {
    return title.compareTo(o.getTitle());
  }

  public boolean equals(Object o) {
    if (o instanceof Song) {
      Song s = (Song) o;
      return title.equals(s.getTitle()) && artist.equals(s.getArtist());
    }
    return false;
  }

  public int hashCode() {
    return title.hashCode() + artist.hashCode();
  }
}
