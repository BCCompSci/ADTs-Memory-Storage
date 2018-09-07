// file: Point.java
// author: Bob Muller
// 
public interface Point extends Comparable<Point> {

    public double getX();
    public double getY();
    public double distance();
    public String toString();
    public int compareTo(Point other);
    public boolean equals(Object o);
}
