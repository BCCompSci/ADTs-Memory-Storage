// file:  Line.java
// author:Bob Muller
//
// This file contains an interface for Lines.
//
public interface Line {

  // Getters.
  //
  Point getLeft();
  Point getRight();

  double length();
  Point midPoint();
  Line move(double dx, double dy);

  String toString();
  boolean equals(Line other);
}
