package test01;

public class demo04 {
public static void main(String[] args) {
	for(int i=1;i<=1000;i++)
	{
		int sum=1;
	   for(int j=2;j<i;j++)
	   {
		   if(i%j==0)
		   {
			   sum+=j;
		   }
	   }
	  if(sum==i&&i!=1)
	 System.out.println(sum);
   }
}
}


