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
      denominator *= -1;
      numerator *= -1;
    }
    int divisor = gcd(numerator,denominator);
    numerator /= divisor;
    denominator /= divisor;
  }
  public double getValue(){
    return numerator * 1.0 / denominator;
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
  public boolean equals(RationalNumber other){
    return (this.numerator == other.numerator && this.denominator == other.denominator);
  }
  public String toString(){
    return "" + numerator + '/' + denominator;
  }
  private static int gcd(int a, int b){
    if(b ==0){
      return a;
    }
    return gcd(b, a%b);
  }
  private void reduce(){
    int divisor = gcd(this.numerator,this.denominator);
    numerator /= divisor;
    denominator /= divisor;
  }
  public RationalNumber multiply(RationalNumber other){
    RationalNumber result = new RationalNumber((this.numerator * other.numerator), (this.denominator * other.denominator));
    if(result.denominator < 0){
      result.denominator *= -1;
      result.numerator *= -1;
    }
    return result;
  }
  public RationalNumber divide(RationalNumber other){
    RationalNumber result = new RationalNumber((this.numerator * other.denominator), (this.denominator * other.numerator));
    if(result.denominator < 0){
      result.denominator *= -1;
      result.numerator *= -1;
    }
    return result;
  }
  public RationalNumber add(RationalNumber other){
    int denom = this.denominator * other.denominator;
    int numer = (this.numerator * other.denominator + other.numerator * this.denominator);
    RationalNumber result = new RationalNumber(numer,denom);
    return result;
  }
  public RationalNumber subtract(RationalNumber other){
    int denom = this.denominator * other.denominator;
    int numer = (this.numerator * other.denominator - other.numerator * this.denominator);
    RationalNumber result = new RationalNumber(numer,denom);
    if(result.denominator < 0){
      result.denominator *= -1;
      result.numerator *= -1;
    }
    return result;
  }
}
