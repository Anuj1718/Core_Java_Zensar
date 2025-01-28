package abstractclass;

abstract class Shape {
 String name;

 public Shape(String name) {
     this.name = name;
 }

 abstract void cal_area();
}

class Circle extends Shape {
 double radius;

 public Circle(String name, double radius) {
     super(name);
     this.radius = radius;
 }

 @Override
 void cal_area() {
     double area = Math.PI * radius * radius;
     System.out.println("Area of " + name + ": " + area);
 }
}

class Square extends Shape {
 double side;

 public Square(String name, double side) {
     super(name);
     this.side = side;
 }


 @Override
 void cal_area() {
     double area = side * side;
     System.out.println("Area of " + name + ": " + area);
 }
}

class Rectangle extends Shape {
 double length, width;

 public Rectangle(String name, double length, double width) {
     super(name);
     this.length = length;
     this.width = width;
 }

 @Override
 void cal_area() {
     double area = length * width;
     System.out.println("Area of " + name + ": " + area);
 }
}

