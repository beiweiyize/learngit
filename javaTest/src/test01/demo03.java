package test01;

public class demo03 {
public static void main(String[] args) {
	for(int i=100;i<=200;i++)
	{
		boolean flag=true;
		for(int j=2;j<=(int)Math.sqrt(i);j++)
		{
			if(i%j==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println(i);
		}			
	}
}
}
