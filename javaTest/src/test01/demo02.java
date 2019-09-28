package test01;

import java.util.Arrays;
import java.util.Scanner;

public class demo02 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Select s=new Select();
	int target=sc.nextInt();
	boolean flag=s.select(target, 0, Select.length);
	if(flag)
	{
		System.out.println("能找到该数，结果为:"+target);
	}else {
		System.out.println("不能找到该数");
	}
	sc.close();
}
}
class Select{
private static int[] a= {12,34,9,-23,45,6,90,123,19,45,34};
public static int length=a.length;
static {
	Arrays.sort(a);
}

   //二分查找
	public boolean select(int target,int start,int end)
	{
		if(start>end)
		{
			return false;
		}
		//取整数的下限值为中间值mid
		int mid=(int)(start+end)/2;
		if(a[mid]==target)
		{
			return true;
		}
		 else if(a[(int)(start+end)/2]<target)
		{
			return select(target,mid+1,end);
		}else {
			return select(target,start,mid-1);
		}
	}
}
