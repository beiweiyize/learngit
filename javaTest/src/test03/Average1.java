package test03;

public class Average1 implements Average {
	@Override
	public double average(int[] target) {
		int sum=0;
		for(int temp:target)
		{
			sum+=temp;
		}
		return sum*1.0/target.length;
	}

	@Override
	public double average(double[] target) {
		double sum=0;
		for(double temp:target)
		{
			sum+=temp;
		}
		return sum/target.length;
	}

}
