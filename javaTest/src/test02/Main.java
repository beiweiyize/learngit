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
		System.out.println("�������������:");
		name=sc.next();
		System.out.println("�������������:");
		age=sc.nextInt();
		System.out.println("������Java�ɼ�");
		javaScore=sc.nextFloat();
		stus[i]=new Student(name,age,javaScore);
		while(flag)
		{
			System.out.println("�������������");
			year=sc.nextInt();
			month=sc.nextInt();
			day=sc.nextInt();
			date=new MyDate(year,month,day);
			if(!date.isResonable())
			{
				System.out.println("������Ϣ��������������");
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
