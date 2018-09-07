// file: MultiSegmentLine.java
// author: Bob Muller
//
public interface MultiSegmentLine extends Comparable<MultiSegmentLine> {

    public int segments();
    public Line segment(int i);
    public double length();
    public void render(Draw display);
    public String toString();
    public int compareTo(MultiSegmentLine other);
    public boolean equals(Object o);
}
