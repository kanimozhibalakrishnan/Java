interface Polygon_Shape {
 void calculateArea(int length, int breadth);
}


//implement the interface

class Rectangle implements Polygon_Shape {
 //implement the interface method
 public void calculateArea(int length, int breadth) {
 System.out.println("The area of the rectangle is " + (length * breadth));
 }
}


class Demo1 {
 public static void main(String[] args) {
 Rectangle rect = new Rectangle(); //declare a class object
 rect.calculateArea(10, 20); //call the method
 }
}





abstract class Shape{ 
abstract void draw(); 
} 


//In real scenario, implementation is provided by others i.e. unknown by end user 


class Rectangle extends Shape{ 
void draw(){System.out.println("drawing rectangle");} 
} 
class Circle1 extends Shape{ 
void draw(){System.out.println("drawing circle");} 
} 


//In real scenario, method is called by programmer or user 


class TestAbstraction1{ 
public static void main(String args[]){ 
Shape s=new Circle1();//In a real scenario, object is provided through method, e.g., 
getShape() method 
s.draw(); 
} 
} 