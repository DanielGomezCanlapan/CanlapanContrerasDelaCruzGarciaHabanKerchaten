package mexer2.prog2.edu.slu;

class Square extends Shape { // creates a class named Square that inherits from the Shape class.
    protected double side;  // sets up a protected variable to store the length of the side of the square

    public Square(String name, double side) { // constructor for the Square class that initializes the name and length of the square
        super(name, 4);  // calls the Shape superclass constructor, providing the square's name and the number of sides
        this.side = side;   //sets the length of the side (parameter), to the instance variable 'side' 
    } // end of constructor

    public double area() {   // method to calculate the area of the square
        double area = side * side; // multiplying side length by itself to get the area of the square
        return area; // returns the calculated area
    } // end of area method

    public double perimeter() { // method to calculate the perimeter of the square
         double perimeter = (4 * side); // multiplying the side length by 4 to get the perimeter of the square
         return perimeter; // return the calculated perimeter
    } //end of perimeter method
} // end of class 
