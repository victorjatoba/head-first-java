public class TestFormat {

  public static void main(String[] args) {
    long myBillion = 1_000_000_000;
    String s = String.format("%,d", myBillion);
    System.out.println(s);

    int myBillionInt = 129939474;
    String s2 = String.format("%,d", myBillionInt);
    System.out.println(s2);
    
    double myDouble = 129939474.9399;
    String sDouble = String.format("%,.2f", myDouble);
    System.out.println(sDouble);

    boolean myBillionBool = true;
    String s3 = String.format("%,d", myBillionBool); // it doesn't work
    System.out.println(s3);
  }
}
