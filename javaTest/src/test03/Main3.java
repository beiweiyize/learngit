package test03;

import java.util.Scanner;

public class Main3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Student[] stus=new Student[10];
	int[] ages=new int[10];
	double[] scores=new double[10];
	Average ave1=new Average1();
	Average ave2=new Average2();
	boolean flag=true;
	int age;
	String name;
	float javaScore;
	int year;
	int month;
	int day;
	MyDate date;
	for(int i=0;i<10;i++)
	{
		System.out.println("请输入你的姓名:");
		name=sc.next();
		System.out.println("请输入你的年龄:");
		try {
			age=Integer.valueOf(sc.next());
			ages[i]=age;
			System.out.println("请输入Java成绩");
			javaScore=Float.valueOf(sc.next());
			scores[i]=javaScore;
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
			
		} catch (NumberFormatException e) {
		     e.printStackTrace();
		}		
}
	
	System.out.println("平均年龄为:"+String.format("%.2f", ave1.average(ages))+" 平均成绩为:"+String.format("%.2f", ave1.average(scores)));
	System.out.println("平均年龄为:"+String.format("%.2f", ave2.average(ages))+" 平均成绩为:"+String.format("%.2f", ave2.average(scores)));
	sc.close();
}
}
