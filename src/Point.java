public class Point {
    private int x;
    private int y;
    private String label;

    public Point(int xVal, int yVal, String labelVal) {
        x = xVal;
        y = yVal;
        label = labelVal;
    }

    @Override
    public String toString() {
        return "Point: " + label + " is at x = " + x + ", y = " + y;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Point)) {
            return false;
        }
        Point otherPoint = (Point) obj;
        return (this.x == otherPoint.x) && (this.y == otherPoint.y);
    }
}
