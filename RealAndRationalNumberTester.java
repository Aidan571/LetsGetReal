public class RealAndRationalNumberTester{
  public static void main(String[]args){
  RealNumber rn1 = new RealNumber(0.0);
  RealNumber rn2 = new RealNumber(0.0);
  System.out.println(rn1.equals(rn2));
  RealNumber rn3 = new RealNumber(10.0);
  RealNumber rn4 = new RealNumber(5.0);
  System.out.println(rn3.equals(rn4));
  RealNumber rn5 = new RealNumber(10000000000000001.0);
  RealNumber rn6 = new RealNumber(10000000000000000.0);
  System.out.println(rn5.equals(rn6));
}
}
