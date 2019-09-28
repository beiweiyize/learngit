package test03;

public class Average2 implements Average {
	@Override
	public double average(int[] target) {
	    int max=Integer.MIN_VALUE;
	    int min=Integer.MAX_VALUE;
	    int sum=0;
	    for(int temp:target)
		{
			sum+=temp;
			max=Math.max(temp, max);
			min=Math.min(temp, min);
		}
	    return  (sum-max-min)*1.0/(target.length-2);
		
	}

	@Override
	public double average(double[] target) {
		double max=Integer.MIN_VALUE;
	    double min=Integer.MAX_VALUE;
	    int sum=0;
	    for(double temp:target)
		{
			sum+=temp;
			max=Math.max(temp, max);
			min=Math.min(temp, min);
		}
	    return  (sum-max-min)/(target.length-2);		
	}

}
