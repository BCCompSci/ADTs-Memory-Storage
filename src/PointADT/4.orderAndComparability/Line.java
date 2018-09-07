// file: Line.java
// author: Bob Muller
//
public interface Line extends Comparable<Line> {

    public Point midpoint();
    public Point min();
    public Point max();
    public double length();
    public void render(Draw d);
    public String toString();
    public int compareTo(Line other);
    public boolean equals(Object o);
}
