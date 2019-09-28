package test01;

import java.util.Date;
import java.util.Scanner;

public class demo01 {
	
@SuppressWarnings("deprecation")
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Student[] stus=new Student[10];
	int age;
	int year;
	int month;
	int day;
	float score;
	for(int i=0;i<10;i++)
	{
		String name=sc.next();
		age=sc.nextInt();
		year=sc.nextInt();
		month=sc.nextInt();
		day=sc.nextInt();
		score=sc.nextFloat();
		stus[i]=new Student(name,age,new Date(year,month,day),score);
	}
	
	//也可以用重写toString方法
	Student.print();
	//关闭输入流
	sc.close();
}
}

class Student{
public static int sum=0;
public static int sumage=0;
public static float sumscore=0;
private String name;
private int age;
private Date date;
private float score;
public Student() {
	super();
}
public Student(String name, int age, Date date, float score) {
	super();
	this.name = name;
	this.age = age;
	this.date = date;
	this.score = score;
	sumage+=age;
	sumscore+=score;
	sum++;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public float getScore() {
	return score;
}
public void setScore(float score) {
	this.score = score;
}
public static void print()
{
	System.out.println("平均年龄为:"+Student.sumage*1.0/sum+"---"+"平均成绩为:"+Student.sumscore/sum);
}

}
