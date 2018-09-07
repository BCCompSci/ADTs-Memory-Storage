// file: PointC.java
// author: Bob Muller
//
// An implementation of the Point type.
//
public class PointC implements MutablePoint {

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

  // Getters and Setters. These retrieve and MUTATE the state.
  //
  public double getX() { return this.x; }
  public double getY() { return this.y; }

  // Setters.
  //
  public void setX(double x) { this.x = x; }
  public void setY(double y) { this.y = y; }

  // This version of move works by MUTATING the values of the state variables.
  public void move(double dx, double dy) {
    this.setX(this.getX() + dx);
    this.setY(this.getY() + dy);
  }

  public boolean equal(MutablePoint other) {
    return
      (this.getX() == other.getX()) &&
      (this.getY() == other.getY());
  }

  public String toString() {
    return String.format("(%f, %f)", this.getX(), this.getY());
  }

  public static void main(String[] args) {

    MutablePoint p = new PointC(2.0, 3.0);
    p.move(.1, .2);
    System.out.format(%s%n", p.toString());
  }
}
