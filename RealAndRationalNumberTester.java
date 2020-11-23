public class RealAndRationalNumberTester{
  public static void main(String[]args){
  RealNumber ren1 = new RealNumber(0.0);
  RealNumber ren2 = new RealNumber(0.0);
  System.out.println(ren1.equals(ren2));
  RealNumber ren3 = new RealNumber(10.0);
  RealNumber ren4 = new RealNumber(5.0);
  System.out.println(ren3.equals(ren4));
  RealNumber ren5 = new RealNumber(10000000000000001.0);
  RealNumber ren6 = new RealNumber(10000000000000000.0);
  System.out.println(ren5.equals(ren6));
  ren3.add(ren4);
  System.out.println(ren3.getValue());
  ren3.multiply(ren4);
  System.out.println(ren3.getValue());
  ren3.divide(ren4);
  System.out.println(ren3.getValue());
  ren3.subtract(ren4);
  System.out.println(ren3.getValue());
  RationalNumber ran1 = new RationalNumber(5,0);
  RationalNumber ran2 = new RationalNumber(5,-3);
  RationalNumber ran3 = new RationalNumber(15,6);
  System.out.println(ran1.getValue());
  System.out.println(ran2.getValue());
  System.out.println(ran3.getValue());
  System.out.println(ran1.getNumerator());
  System.out.println(ran2.getNumerator());
  System.out.println(ran3.getNumerator());
  System.out.println(ran1.getDenominator());
  System.out.println(ran2.getDenominator());
  System.out.println(ran3.getDenominator());
  System.out.println(ran3.reciprocal().getValue());
  System.out.println(ran2.equals(ran3));
  RationalNumber ran4 = ran2;
  System.out.println(ran2.equals(ran4));
  System.out.println(ran2.toString());
  System.out.println(ran3.toString());

}
}
