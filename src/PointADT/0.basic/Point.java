// file: Point.java
// author: Bob Muller
//
// A simple Point type.
//
interface Point {

  double getX();
  double getY();

  @Override
  boolean equals(Object other);
  @Override
  String toString();
}
