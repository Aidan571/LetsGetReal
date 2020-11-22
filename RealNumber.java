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
    if(other.value == 0){
      return this.value == 0;
      }
    else if(this.value == 0){
      return other.value == 0;
      }
    else
    return (other.value / this.value <= 1.00001 && other.value / this.value >= 0.99990) || (this.value / other.value <= 1.00001 && this.value / other.value >= 0.99990);
  }
  public RealNumber add(RealNumber other){
    this.value += other.value;
    return null;
  }
  public RealNumber multiply(RealNumber other){
    this.value *= other.value;
    return null;
  }
  public RealNumber divide(RealNumber other){
    this.value /= other.value;
    return null;
  }
  public RealNumber subtract(RealNumber other){
    this.value -= other.value;
    return null;
  }
}
