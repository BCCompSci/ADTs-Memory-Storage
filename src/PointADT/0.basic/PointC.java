// file: PointC.java
// author: Bob Muller
//
// An implementation of the Point type.
//
public class PointC implements Point {

  // These are called "instance variables". They record the state of
  // the point.
  //
  private double x;
  private double y;

  // A constructor of Points.
  //
  public PointC(double x, double y) {
    this.x = x;
    this.y = y;
  }

  // Getters.
  //
  public double getX() { return this.x; }
  public double getY() { return this.y; }

  @Override
  public boolean equals(Object o) {
    Point other = (Point) o;
    return (this.getX() == other.getX()) && (this.getY() == other.getY());
  }

  @Override
  public String toString() {
    return String.format("(%f, %f)", this.getX(), this.getY());
  }

  // Unit testing
  //
  public static void main(String[] args) {

    // NB: The only things we can do with p are the things
    // specified in the Point interface!
    //
    Point p = new PointC(2.0, 3.0);
    double y = p.getY();
    System.out.format("p = %s\n", p.toString());
  }
}
