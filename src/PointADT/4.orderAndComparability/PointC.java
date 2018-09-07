// file: PointC.java
// author: Bob Muller
// 
public class PointC implements Point {

    private static boolean DEBUG = false;

    private double x;
    private double y;

    public PointC(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public String toString() { return "(" + this.getX() + ", " + this.getY() + ")"; }

    private static int makeCompareResult(double d) {
        if (d < 0.0) return -1;
        if (d > 0.0) return  1;
        else return 0;
    }

    // Our natural ordering compares distance to the origin. This equates Points
    // in rings around the origin.
    //
    public int compareTo(Point other) {
        return makeCompareResult(this.distance() - other.distance());
    }
/* OTHER compareTo's
 *
    // An alternative ordering: just compare the distance from the Y-axis.
    //
    public int compareTo(Point other) {
        return makeCompareResult(this.getX() - other.getX());
    }

    // A lexicographic ordering: first compare x's. If no difference compare y's.
    //
    public int compareTo(Point other) {
        int xResult = makeCompareResult(this.getX() - other.getX());
        return (xResult != 0) ? xResult : makeInt(this.getY() - other.getY());
    }
*/
    // The most direct way to ensure that equals is consistent with compareTo.
    //
    public boolean equals(Object o) { return this.compareTo((Point) o) == 0; }

    public double distance() {
        double x = this.getX();
        double y = this.getY();
        return Math.sqrt(x * x + y * y);
    }

    public static void main(String[] args) {

        Point p = new PointC(.5, .5);
        Point q = new PointC(.5, 0.0);
        System.out.println("Point " + q.toString() + " at distance = " + q.distance());
    }
}
