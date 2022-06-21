public class MathUse {

  private MathUse() {}

  public static void main(String[] args) {
    Math m;
    MathUse mu = new MathUse();
    System.out.println(mu.getOne());
  }

  public Number getOne() {
    return 1;
  }
}
