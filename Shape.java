public class Shape {
    public double calculateArea(String shapeType, double param1, double param2) {
        double area = 0.0;

        if (shapeType.equalsIgnoreCase("circle")) {
            double radius = param1;
            area = 3.14 * radius * radius;

        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            double width = param1;
            double height = param2;
            area = width * height;
        }
        return area;
    }
}