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
		System.out.println("�������������:");
		name=sc.next();
		System.out.println("�������������:");
		try {
			age=Integer.valueOf(sc.next());
			ages[i]=age;
			System.out.println("������Java�ɼ�");
			javaScore=Float.valueOf(sc.next());
			scores[i]=javaScore;
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
			
		} catch (NumberFormatException e) {
		     e.printStackTrace();
		}		
}
	
	System.out.println("ƽ������Ϊ:"+String.format("%.2f", ave1.average(ages))+" ƽ���ɼ�Ϊ:"+String.format("%.2f", ave1.average(scores)));
	System.out.println("ƽ������Ϊ:"+String.format("%.2f", ave2.average(ages))+" ƽ���ɼ�Ϊ:"+String.format("%.2f", ave2.average(scores)));
	sc.close();
}
}
