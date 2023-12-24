public class Shape {
    private Point[] points;

    public Shape(Point[] points) {
        this.points = points;
    }

    public double perimeter() {
        double perimeter = 0.0;
        for (int i = 0; i < points.length; i++) {
            int nextIndex = (i + 1) % points.length;
            perimeter += points[i].distanceTo(points[nextIndex]);
        }
        return perimeter;
    }

    public double longestSide() {
        double longestSide = 0.0;
        for (int i = 0; i < points.length; i++) {
            int nextIndex = (i + 1) % points.length;
            double sideLength = points[i].distanceTo(points[nextIndex]);
            longestSide = Math.max(longestSide, sideLength);
        }
        return longestSide;
    }

    public double averageSide() {
        return perimeter() / points.length;
    }
}
