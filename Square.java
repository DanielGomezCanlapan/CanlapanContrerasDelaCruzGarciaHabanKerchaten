package mexer2.prog2.edu.slu;

 class Square extends Shape {
     protected double side;

     public Square(String name, double side){
         super(name,4);
         this.side = side;
     }

     public double area (){
         double area = side * side;
         return area;
     }
     public double perimeter (){
         double perimeter = (4*side);
         return perimeter;
     }

}
