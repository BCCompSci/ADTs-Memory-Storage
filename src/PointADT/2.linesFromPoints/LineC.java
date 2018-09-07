// file:  LineC.java
// author:Bob Muller
//
// This file contains an implementation of the simple Line ADT.
//
public class LineC implements Line {

  private Point left;
  private Point right;

  public LineC(Point p1, Point p2) {

    if (p1.getX() <= p2.getX()) {
      this.left = p1;
      this.right = p2;
    }
    else {
      this.left = p2;
      this.right = p1;
    }
  }

  // Getters
  //
  public Point getLeft()  { return this.left;  }
  public Point getRight() { return this.right; }

  public double length() {
    double
      dx = Math.abs(this.getLeft().getX() - this.getRight().getX()),
      dy = Math.abs(this.getLeft().getY() - this.getRight().getY());
    return Math.sqrt(Math.pow(dx, 2.0) + Math.pow(dy, 2.0));
  }

  public String toString() {
    String
      leftString = this.getLeft().toString(),
      rightString = this.getRight().toString();

      return String.format("{left=%s, right=%s}", leftString, rightString);
    }

    public Point midPoint() {
      Point
        left = this.getLeft(),
        right = this.getRight();
      double
        x = left.getX() + (left.getX() + right.getX()) / 2.0,
        y = left.getY() + (left.getY() + right.getY()) / 2.0;
      return new PointC(x, y);
    }

    public Line move(double dx, double dy) {
      Point
        left  = this.getLeft().move(dx, dy),
        right = this.getRight().move(dx, dy);
      return new LineC(left, right);
    }

    public boolean equals(Line other) {
        Point
            tm = this.midPoint(),
            om = other.midPoint();
        return tm.equals(om);
    }

    public static void main(String[] args) {
        Point
            p1 = new PointC(.2, .3),
            p2 = new PointC(.3, .4);
        Line myLine = new LineC(p1, p2),
            myNewLine = myLine.move(.1, .2);

        System.out.println("line = " + myLine.toString());
        System.out.println("myNewLine = " + myNewLine.toString());
    }
}
