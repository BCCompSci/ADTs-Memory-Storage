// file: MutablePoint.java
// author: Bob Muller
//
// A simple Mutable Point type.
//
interface MutablePoint {

  // Getters
  //
  double getX();
  double getY();

  // Setters, only for mutable types, NB return types are void
  //
  void setX(double x);
  void setY(double y);

  void move(double dx, double dy);   // return type is void

  boolean equal(MutablePoint other);
  String toString();
}
