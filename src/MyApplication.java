public class MyApplication {
    public static void main(String[] args) {

        Point p1 = new Point(1.0, 2.0);
        Point p2 = new Point(4.0, 5.0);
        Point p3 = new Point(6.0, 3.0);


        Shape triangle = new Shape(new Point[] { p1, p2, p3 });


        System.out.println("Perimeter: " + triangle.perimeter());
        System.out.println("Longest side: " + triangle.longestSide());
        System.out.println("Average side: " + triangle.averageSide());
    }
}
