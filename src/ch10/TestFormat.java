public class TestFormat {

  public static void main(String[] args) {
    long myBillion = 1_000_000_000;
    String s = String.format("%,d", myBillion);
    System.out.println(s);
    int myBillionInt = 129;

    String s2 = String.format("%,d", myBillionInt);
    System.out.println(s2);

    boolean myBillionBool = true;
    String s3 = String.format("%,d", myBillionBool); // it doesn't work
    System.out.println(s3);
  }
}
