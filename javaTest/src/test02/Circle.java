package test02;

public class Circle  extends Coordinate implements Shape {
private double radius;
public Circle(long x, long y,double radius) {
	super(x, y);
	this.radius=radius;
}
@Override
public double getArea() {
	return Math.PI*radius*radius;
}
@Override
public double getPerimeter() {
	return 2*Math.PI*radius;
}
}
