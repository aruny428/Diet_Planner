package code;

public abstract class Person {
	
	double weight;
	double height;
	
	protected double bmi(double weight, double height)
	{
		this.weight=weight;
		this.height=height;
		double ans=weight/(height*height);
		return ans;
	}
	
	protected double bmi()
	{
		return this.bmi(weight, height);
	}

}
