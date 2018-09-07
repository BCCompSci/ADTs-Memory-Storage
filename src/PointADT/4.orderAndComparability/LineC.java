// file: LineC.java
// author: Bob Muller
// 
public class LineC implements Line {

    private final boolean DEBUG = false;

    private Point p1;
    private Point p2;

    public LineC(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point midpoint() {

        Point
            min = this.min(),
            max = this.max();
        double
            x1 = min.getX(), y1 = min.getY(),
            x2 = max.getX(), y2 = max.getY();

        return new PointC(x1 + (x2 - x1) / 2.0, y1 + (y2 - y1) / 2.0);
    }

    public Point min() { return this.p1.compareTo(p2) <= 0 ? p1 : p2; }

    public Point max() { return this.p1.compareTo(p2) <= 0 ? p2 : p1; }

    public double length() {
        double
            x1 = this.min().getX(), y1 = this.min().getY(),
            x2 = this.max().getX(), y2 = this.max().getY(),
            dx = Math.abs(x2 - x1),
            dy = Math.abs(y2 - y1);
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void render(Draw display) {
        StdIn.readChar();
        System.out.print("rendering " + this.toString());

        display.line(this.min().getX(), this.min().getY(),
                     this.max().getX(), this.max().getY());
    }

    public String toString() { return "{p1 = " + this.min() + ", p2 = " + this.max() + "}"; }

    // The natural ordering compares midpoints.
    //
    public int compareTo(Line other) { return this.midpoint().compareTo(other.midpoint()); }

    public boolean equals(Object o) { return this.compareTo((Line) o) == 0; }

    public static void main(String [] args) {

        Draw display = new Draw();

        Point
            p = new PointC(0.0, 0.0),
            q = new PointC(1.0, 0.0);

        Line line = new LineC(p, q);

        line.render(display);

        System.out.println(line.toString());
        System.out.println("midpoint is " + line.midpoint().toString());
        System.out.println("distance of midpoint is " + line.midpoint().distance());
    }
}
