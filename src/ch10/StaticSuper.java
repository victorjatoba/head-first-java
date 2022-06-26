public class StaticSuper {
  static {
    System.out.println("super static block");
  }

  StaticSuper() {
    System.out.println("super constructor");
  }

  public static void main(String[] args) {
      StaticSuper ss = new StaticSuper();
      StaticSuper ss2 = new StaticSuper();
  }
}
