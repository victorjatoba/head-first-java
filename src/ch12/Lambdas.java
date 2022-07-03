/**
 * Class: Lambda Expressions in Java - Full Simple Tutorial
 * {@link} https://www.youtube.com/watch?v=tj5sLSFjVj4
 * @author John
 */
public class Lambdas {

  private static Printable catSound;

  public static void main(String[] args) {
    Mouse mouse = new Mouse();
    // mouse.print();
    printThing(mouse, " | I'm a Mouse");
    catSound = s -> System.out.println("Meow" + "" + s);
    printThing(catSound, " | I'm a Cat");
  }

  static void printThing(Printable thing, String suffix) {
    thing.print(suffix);
  }
}
