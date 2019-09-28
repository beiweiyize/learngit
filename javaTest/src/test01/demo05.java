package test01;


public class demo05 {
public static void main(String[] args) {
	for(int x=0;x<=5;x++)
	{
		for(int y=0;y<=5-x;y++)
		{
			if((x+y)*100+(y+1)*10+2==532)
			{
				System.out.println("x="+x+"y="+y+"z="+1);
			}
			if((x+y)*100+(y+6)*10+12==532)
			{
				System.out.println("x="+x+"y="+y+"z="+6);
			}
		}
	}
}
}
