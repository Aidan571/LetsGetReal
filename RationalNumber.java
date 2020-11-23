public class RationalNumber extends RealNumber{
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0.0);
    numerator = nume;
    denominator = deno;
    if(this.denominator == 0){
      denominator = 1;
      numerator = 0;
    }
    else if(this.denominator < 0){
      denominator = denominator * -1;
      numerator = numerator * -1;
    }
  }
  public double getValue(){
    return numerator * 1.0 /denominator;
  }
  public int getNumerator(){
    return this.numerator;
  }
  public int getDenominator(){
    return this.denominator;
  }
  public RationalNumber reciprocal(){
    RationalNumber result = new RationalNumber(this.denominator,this.numerator);
    return result;
  }
}
