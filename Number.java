public abstract class Number{
  public abstract double getValue();

  public int compareTo(Number other){
    int holder = (int) (this.getValue() - other.getValue());
    return holder;
  }

  public boolean equals(Number other){
    if(other.getValue() == 0){
      return this.getValue() == 0;
      }
    else if(this.getValue() == 0){
      return other.getValue() == 0;
      }
    else
    return (other.getValue() / this.getValue() <= 1.00001 && other.getValue() / this.getValue() >= 0.99990) || (this.getValue() / other.getValue() <= 1.00001 && this.getValue() / other.getValue() >= 0.99999);
  }
}
