package brd;

public class calculation {
	 
	double lamount;
	double rot;
	double t;
	double n;
	double t1;
	calculation()
	{
	
	}
	public calculation(double lamount,double rot,double t,double cal)
	{
		this.lamount=lamount;
		this.rot=rot;
		this.t=t;
		this.n=cal;
		System.out.println("cons");
	}
	public double iamount()
	{
		double a= (rot/n);
		double num=(lamount*a);
		double v1=(1+a);
		double v2=(Math.pow(v1,t));
		double v3=(1/v2);
		double den=(1-v3);
		double result =	(num/den);
		return result;
		
	}

}
