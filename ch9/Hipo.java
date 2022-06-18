public class Hipo extends AnimalConstructor {

  public Hipo() {
    this(1);
    System.out.println("Hipo");
  }

  public Hipo(int i) {
    super(i);
    System.out.println("Hipo() " + i);
  }
}
