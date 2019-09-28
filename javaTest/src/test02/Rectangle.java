package test02;

public class Rectangle extends Coordinate implements Shape {
private Coordinate point1;
private Coordinate point2;
private Coordinate point3;
public Rectangle(long x1,long y1,long x2,long y2,long x3,long y3)
{
	super(x1,y1);
	point1=new Coordinate(x1,y1);
	point2=new Coordinate(x2,y2);
	point3=new Coordinate(x3,y3);
}
@Override
public double getArea() {
	return length(point1, point2)*length(point2, point3);
}
@Override
public double getPerimeter() {
	return 2*(length(point1, point2)+length(point2, point3));
}
public  double length(Coordinate p1,Coordinate p2)
{
	return Math.sqrt(Math.pow(p1.x-p2.x, 2)+Math.pow(p1.y-p2.y, 2));
}
}
