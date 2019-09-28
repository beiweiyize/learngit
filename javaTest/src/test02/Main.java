package test02;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Student[] stus=new Student[10];
	boolean flag=true;
	int age;
	String name;
	float javaScore;
	int year;
	int month;
	int day;
	MyDate date;
	for(int i=0;i<2;i++)
	{
		System.out.println("请输入你的姓名:");
		name=sc.next();
		System.out.println("请输入你的年龄:");
		age=sc.nextInt();
		System.out.println("请输入Java成绩");
		javaScore=sc.nextFloat();
		stus[i]=new Student(name,age,javaScore);
		while(flag)
		{
			System.out.println("请输入输出日期");
			year=sc.nextInt();
			month=sc.nextInt();
			day=sc.nextInt();
			date=new MyDate(year,month,day);
			if(!date.isResonable())
			{
				System.out.println("输入信息有误，请重新输入");
			}else {
				stus[i].setBirth(date);
				flag=false;
			}
		}
		flag=true;	
	}
	Student.print();
	sc.close();
}
}
