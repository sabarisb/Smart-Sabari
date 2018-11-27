 package brd;

import java.text.DecimalFormat;

import java.util.Scanner;

public class Emidet {

	@SuppressWarnings("resource")
	public static void main(String[] args )

	{

		Scanner ec = new Scanner(System.in);
		System.out.println("enter the amount");
		double lamount = ec.nextDouble();

		System.out.println(" enter %");
		double rateofinterest = ec.nextDouble();
		double rot = (rateofinterest / 100);

		System.out.println(" enter  tenure ");
		double t = ec.nextDouble();

		System.out.println(" enter mo of years");
		double n = ec.nextDouble();
		System.out.println(lamount);
		System.out.println(rot);
		System.out.println(t);
		System.out.println(n);
calculation cal = new calculation(lamount, rot, t, n);
		
		//calculation c = new calculation();
		double p = cal.iamount();
		System.out.println(p);
		cal.iamount();


	}
}