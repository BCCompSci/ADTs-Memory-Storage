// file: WeightedPointC.java
// author: Bob Muller
// 
// This file contains an implementation of the WeightedPoint API. This
// implementation achieves the goal of -reusing- the code implementing
// the Point API by -composition- rather than inheritance.  Composition
// is modular and scales well so it is always to be favored over OO
// implementation inheritance which is not modular and doesn't scale.
//
// The key idea here is that this implementation wraps the implementation
// of Point with an additional layer of abstraction by creating a private
// state variable (called myPoint below) that takes on a value of type Point.
//
public class WeightedPointC implements WeightedPoint {

    // State variables.
    //
    private Point myPoint;
    private double weight;

    public WeightedPointC(double x, double y, double weight) {

        // Construction of a WeightedPoint causes the construction of a Point.
        //
        this.myPoint = new PointC(x, y);    // NB: no call to super!
        this.weight = weight;
    }

    // Simple slipcovers for some of the functions in the Point API.
    //
    public double getX() { return myPoint.getX(); }
    public double getY() { return myPoint.getY(); }

    // NB: the following two functions (move & equals) are a bit tricky. To
    // implement the move operation in the WeightedPoint API, the following move
    // function must return a value of type Point rather than WeightedPoint.
    // A similar comment holds for equals (below), it must accept as an argument
    // a value of type Point rather than a WeightedPoint.
    //
    public Point move(double dx, double dy) { return myPoint.move(dx, dy); }

    // NB: We are choosing not to customize equals, the comparison of WeightedPoints
    // ignores the weights. We could have done otherwise.
    //
    public boolean equals(Point other) { return myPoint.equals(other); }

    // Functions specialized for WeightedPoints.
    //
    public String toString() {
        String ps = myPoint.toString();
        return "{point= " + ps + ", weight= " + this.getWeight() + "}";
    }
    public double getWeight() { return this.weight; }

    public static void main(String[] args) {
        Point wp = new WeightedPointC(.1, .2, .3);
        System.out.println(wp.toString());
    }
}
