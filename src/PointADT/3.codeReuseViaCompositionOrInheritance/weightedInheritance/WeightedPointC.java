// file: WeightedPointC.java
// author:Bob Muller
//
// This file contains an implementation of WeightedPoints that
// attempts to -reuse- code via implementation (i.e., class)
// -inheritance-. THIS IS A BAD IDEA, PLEASE DON'T DO IT.
//
// WARNING - BAD CODE - BAD CODE - WARNING
//
public class WeightedPointC extends PointC implements WeightedPoint {

    private double weight;

    public WeightedPointC(double x, double y, double weight) {

        super(x, y);
        this.weight = weight;
    }
    public double getWeight() { return this.weight; }

    @Override
    public String toString() {
        String ps = super.toString();
        return "{point= " + ps + ", weight= " + this.getWeight() + "}";
    }

    public static void main(String[] args) {

        Point wp = new WeightedPointC(.1, .2, .3);
        System.out.println(wp.toString());
    }
}
