public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }
  public boolean equals(RealNumber other){
    if(other.getValue() == 0){
      return this.getValue() == 0;
      }
    else if(this.getValue() == 0){
      return other.getValue() == 0;
      }
    else
    return (other.getValue() / this.getValue() <= 1.00001 && other.getValue() / this.getValue() >= 0.99990) || (this.getValue() / other.getValue() <= 1.00001 && this.getValue() / other.getValue() >= 0.99999);
  }
  public RealNumber add(RealNumber other){
    RealNumber result = new RealNumber(this.value += other.getValue());
    return result;
  }
  public RealNumber multiply(RealNumber other){
    RealNumber result = new RealNumber(this.value *= other.getValue());
    return result;
  }
  public RealNumber divide(RealNumber other){
    RealNumber result = new RealNumber(this.value /= other.getValue());
    return result;
  }
  public RealNumber subtract(RealNumber other){
    RealNumber result = new RealNumber(this.value -= other.getValue());
    return result;
  }
}
