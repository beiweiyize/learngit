package test02;

public class Triangle extends Coordinate implements Shape{
private Coordinate point1;
private Coordinate point2;
private Coordinate point3;
public Triangle(long x1,long y1,long x2,long y2,long x3,long y3)
{
	super(x1,y1);
	point1=new Coordinate(x1,y1);
	point2=new Coordinate(x2,y2);
	point3=new Coordinate(x3,y3);
}
@Override
public double getArea() {
	double a=length(point1, point2);
	double b=length(point1, point3);
	double c=length(point2, point3);
	double p=(a+b+c)/2;
	return Math.sqrt(p*(p-a)*(p-b)*(p-c));
}
@Override
public double getPerimeter() {
	return length(point1, point2)+length(point1, point3)+length(point2, point3);
}
public  double length(Coordinate p1,Coordinate p2)
{
	return Math.sqrt(Math.pow(p1.x-p2.x, 2)+Math.pow(p1.y-p2.y, 2));
}
}
