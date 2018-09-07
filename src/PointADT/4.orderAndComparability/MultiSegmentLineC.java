// file: MultiSegmentLineC.java
// author: Bob Muller
// 
import java.awt.*;
import java.util.*;

public class MultiSegmentLineC implements MultiSegmentLine {

    private final boolean DEBUG = false;

    private int N;
    private Line[] lines;
    private Draw draw;
    private java.awt.Color color;

    public MultiSegmentLineC(Line[] lines, java.awt.Color color) {
        N = lines.length;
        this.lines = lines;
        this.color = color;
    }

    public int segments() { return N; }

    public double length() {

        int len = 0;
        for(Line line : this.lines)
            len += line.length();
        return len;
    }

    // Retrieve the ith line segment.
    //
    public Line segment(int i) { return this.lines[i]; }

    public void render(Draw display) {

        display.setPenColor(this.color);

        for(Line line : this.lines)
            line.render(display);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Line line : this.lines)
            sb.append(line.toString() + " ");
        return "{mls:" + sb.toString() + "}";
    }

    // A lexicographic ordering on multi-segment lines. The ordering
    // is derived from the underlying ordering on Line.
    //
    public int compareTo(MultiSegmentLine other) {

        for(int i = 0; i < this.segments(); i++) {
            if(i == other.segments())

                // We've run out of line segments in other but not in this.
                //
                return +1;

            int answer = this.segment(i).compareTo(other.segment(i));

            if(answer != 0) return answer;
        }
        // We made it through all the line segments in this, never finding a difference.
        // The only remaining question is whether other has segments remaining. If so
        // other is bigger.
        //
        if(this.segments() < other.segments()) return -1;

        return 0;
    }

    public boolean equals(Object o) { return this.compareTo((MultiSegmentLine) o) == 0; }

    public static void main(String[] args) {

        Draw display = new Draw();

        display.setCanvasSize(800, 800);
        display.setPenRadius(.006);

        Point
            p1 = new PointC(.25, .25),
            p2 = new PointC(.25, .75),
            p3 = new PointC(.5, .5),
            p4 = new PointC(0, 0),
            p5 = new PointC(1, 1),
            p6 = new PointC(1.0, 0);

        Line[]
            lines1 = {new LineC(p1, p2), new LineC(p2, p3)},
            lines2 = {new LineC(p4, p5), new LineC(p5, p2)},
            lines3 = {new LineC(p3, p5)},
            lines4 = {new LineC(p3, p5), new LineC(p5, p6)};

            MultiSegmentLine[] msls = {
                new MultiSegmentLineC(lines2, Draw.BLUE),
                new MultiSegmentLineC(lines1, Draw.RED),
                new MultiSegmentLineC(lines4, Draw.YELLOW),
                new MultiSegmentLineC(lines3, Draw.GREEN)};

        for(MultiSegmentLine msl : msls)
            msl.render(display);

        StdIn.readChar();
        display.clear();

        Arrays.sort(msls);

        System.out.println("The segmented lines have been sorted ...");

        for(MultiSegmentLine msl : msls)
            msl.render(display);
    }
}
