package mexer2.prog2.edu.slu;

/**
 * Extends the Shape main class.
 */
public class Triangle extends Shape {
    /**
     * The lengths of the three sides of the triangle.
     */
    private double side1, side2, side3;

    /**
     * Constructor for creating a Triangle object with the lengths of the 3 sides (parameters).
     */
    public Triangle(String name, double s1, double s2, double s3) {
        super(name, 3);
        side1 = s1; // Length of the first side.
        side2 = s2; // Length of the second side.
        side3 = s3; // Length of the third side.
    }

    /**
     * Method used to calculate the area of the triangle using Heron's formula.
     */
    @Override
    public double area() {
        // Line of code used to calculate the semi-perimeter of the triangle
        double s = (side1 + side2 + side3) / 2;
        // Used to calculate the triangle's area using Heron's formula
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }

    /**
     * Method to used to calculate the perimeter of the triangle.
     */
    @Override
    public double perimeter() {
        // Calculates the perimeter of the triangle
        double perimeter = side1 + side2 + side3;
        return perimeter;
    }
}
