package Polymorphism;

class Shape {
    protected int l;
    protected int b;

    public void calculateArea() {
        System.out.println("Area of the shape");
    }
}

class Circle extends Shape {
	
	double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
    @Override
    public void calculateArea() {
    	double area =Math.PI*radius*radius;
        System.out.println("Area of circle"+ area);
    }
}

class Square extends Shape {

	public Square(int length) {
		this.b=length;
		this.l=length;	
	}
    @Override
    public void calculateArea() {
    	int Area = l*b;
        System.out.println("Area of square"+Area);
    }



    public static void main(String[] args) {
        Shape s1 = new Circle(5.0);  // Creating an object of Circle
        s1.calculateArea();      // Calls the overridden method in Circle

        Shape s2 = new Square(4);  // Creating an object of Square
        s2.calculateArea();      // Calls the overridden method in Square
    }
 }

