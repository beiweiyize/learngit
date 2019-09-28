package test02;

import java.util.GregorianCalendar;

public class MyDate {
public GregorianCalendar cal=new GregorianCalendar();
private int[] months=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
private int year;
private int month;
private int day;

public MyDate() {
	super();
}
public MyDate(int year, int month, int day) {
	super();
	this.year = year;
	this.month = month;
	this.day = day;
}
public boolean isResonable()
{
	if(cal.isLeapYear(year))
	{
		//���������
		if(month==2)
		{
			return day>29?false:true;
		}else {
			return day>months[month-1]?false:true;
		}
	}else {
		//�����ƽ��
		if(month==2)
		{
			return day>28?false:true;
		}else {
			return day>months[month-1]?false:true;
		}
	}
}

}
