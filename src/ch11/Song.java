public class Song {

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

  @Override
  public String toString() {
    return title;
  }
}
