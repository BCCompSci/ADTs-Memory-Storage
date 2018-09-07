# CSCS 1102 Computer Science 2

The files in this folder contain code with an example of ordering.

+ Point.java — an interface for Points
+ PointC.java — a class file implementation of Point

 The PointC class implements a compareTo for points that compares them by their distance from the origin.

+ Line.java — an interface for Lines
+ LineC.java — a class file implementation of Line

The LineC class implements a compareTo for lines that compares the lines' midpoints (using the point compareTo above)

+ MultiSegmentLine.java — an interface for lines with multiple segments
+ MultiSegmentLineC.java — a class file implementing the MultiSegmentLine interface

The MultiSegmentLineC class implements a compareTo that yields a lexicographic ordering of multisegmented lines.

To Run:

```
> javac MultiSegmentLineC.java
> java MultiSegmentLin
```

Position the console next to the graphics window then hit Enter to reveal each line.
