package test02;

public class Main2 {
public static void main(String[] args) {
	Shape rectangle=new Rectangle(0,0,1,0,1,1);
	System.out.println(rectangle.getArea()+"-----"+rectangle.getPerimeter());
	Shape circle=new Circle(0,0,5);
	System.out.println(String.format("%.2f", circle.getArea())+"-----"+String.format("%.2f", circle.getPerimeter()));
	Shape Triangle=new Triangle(0,0,1,0,1,1);
	System.out.println(String.format("%.2f", Triangle.getArea())+"-----"+String.format("%.2f", Triangle.getPerimeter()));
}
}
