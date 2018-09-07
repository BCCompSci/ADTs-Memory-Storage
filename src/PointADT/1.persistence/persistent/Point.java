// file: Point.java
// author: Bob Muller
//
// A simple Immutable Point type.
//
interface Point {
  double getX();
  double getY();
  Point move(double dx, double dy);

  @Override
  boolean equal(Point other);
  @Override
  String toString();
}
