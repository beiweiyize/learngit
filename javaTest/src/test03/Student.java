package test03;

public class Student {
private static int agesum=0;
private static float scoresum=0;
private static int count=0;
private String name;
private int age;
private MyDate birth;
private float JavaScore;
public Student()
{
	super();
}
public Student(String name, int age, float javaScore) {
	super();
	this.name = name;
	this.age = age;
	this.JavaScore = javaScore;
	agesum+=age;
	scoresum+=javaScore;
	count++;
}
public MyDate getBirth() {
	return birth;
}
public void setBirth(MyDate birth) {
	this.birth = birth;
}
public static void print()
{
	System.out.println("ƽ������Ϊ:"+(agesum*1.0/count)+" ƽ���ɼ�Ϊ:"+String.format("%.2f", scoresum/count)+"��");
}
}
