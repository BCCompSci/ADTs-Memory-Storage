public class PointC implements Point {

  private double x, y;

  public PointC(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() { return this.x; }
  public double getY() { return this.y; }

  public boolean equal(Point other) { return true; }
  public String toString() {
    return String.format("(%f, %f)", this.getX(), this.getY());
  }

  // Unit Testing
  //
  public static void main(String[] args) {
    Point
      p = new PointC(2.0, 3.0),
      q = new PointC(4.0, 5.0);
    double xp = p.getX();

  }
}
