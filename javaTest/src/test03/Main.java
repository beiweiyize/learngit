package test03;

import java.util.Scanner;

public class Main {
public static void isReasonable(String result) throws MyException 
{
	if(result.equals("XYZ"))
	{
		throw new MyException("This is a XYZ");
	}else {
		System.out.println("ABC,δ�׳��쳣");
	}
}


//����
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("������һ���ַ���:");
	String result=sc.next();
	try {
		Main.isReasonable(result);
	} catch (MyException e) {
		e.printStackTrace();
	}
}
}
