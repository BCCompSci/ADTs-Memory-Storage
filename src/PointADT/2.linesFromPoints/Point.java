// file:  Point.java
// author:Bob Muller
//
// This file contains an interface for Points.
//
public interface Point {

  // public PointC(double x, double x);

  double getX();
  double getY();
  Point move(double dx, double dy);

  String toString();
  boolean equals(Point other);
}
