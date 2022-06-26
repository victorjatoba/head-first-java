class StaticSuper {
  static {
    System.out.println("super static block");
  }

  StaticSuper() {
    System.out.println("super constructor");
  }
}

public class StaticTests extends StaticSuper {

  static int rand;

  static {
    rand = (int) (Math.random() * 6);
    System.out.println("Static block " + rand);
  }

  StaticTests() {
    System.out.println("constructor");
  }

  public static void main(String[] args) {
    StaticSuper ss = new StaticSuper();
    StaticSuper ss2 = new StaticSuper();
    StaticSuper st = new StaticTests();
  }
}
