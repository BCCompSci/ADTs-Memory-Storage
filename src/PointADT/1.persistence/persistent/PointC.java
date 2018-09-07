// file: PointC.java
// author: Bob Muller
//
// An implementation of an immutable Point type.
//
public class PointC implements Point {

  // The state of the point.
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

  public Point move(double dx, double dy) {
    return new PointC(this.x + dx, this.y + dy);
  }

  public boolean equal(Point other) {
    return (this.getX() == other.getX()) && (this.getY() == other.getY());
  }

  public String toString() {
    return String.format("(%f, %f)", this.getX(), this.getY());
  }

  public static void main(String[] args) {

    Point p = new PointC(2.0, 3.0);
    Point q = p.move(.1, .2);
    System.out.println(q.toString());
  }
}
