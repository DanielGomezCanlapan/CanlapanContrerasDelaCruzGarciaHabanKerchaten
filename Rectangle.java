package mexer2.prog2.edu.slu;

 class Rectangle extends Square {
  private double side2;

  public Rectangle (String name, double s1, double s2){
   super(name,4);
   this.side2 = s1;
   this.side = s2;
  }

  public double area (){
   double area = side * side2;
   return area;
  }
  public double perimeter (){
   double perimeter = (2*side)+(2*side2);
   return perimeter;
  }

 }
