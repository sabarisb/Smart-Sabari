package brd;

import java.util.Scanner;
//import java.util.List;
//import java.util.ArrrayList;


public class emi {
	

	//public static void main(String[]args) {
	 double Emi(double P,double i,double t,double n)
	{
		double Y,T,S,I,x;
		i=i/100;
		I=i/n;
		Y=1+I;
		T=Math.pow(Y, t);
		S=1/T;
		x=(P*I)/(1-S);
		return x;
	}

		void repay(double saba,double R,double i,double t,double n)
		{
			int j;
			double opn[]=new double[100];
			double pn[]=new double[100]; 
			double in[]=new double[100];
			opn[1]=R;
		
			for(j=1;j<=n;j++)
			{
				
				in[j]=(double)Math.round((opn[j]*(i/(1200)))*100/100);
				pn[j]=(double)Math.round(((saba-in[j])*100)/100);
				opn[j+1]=(double)Math.round(((opn[j]-pn[j])*100)/100);
				System.out.println(j +"   "+(in[j])+"  " + (pn[j]) + "  " +opn[j]);
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
	int output=sc.nextInt();
	int g=output;
	if(g==output)
	{
		System.out.println(g);
		System.out.println(in[g]);
		System.out.println(pn[g]);
		System.out.println(opn[g]);
	}

			}
		public static void main (String[]args) {
			Scanner sc=new Scanner(System.in);
					System.out.println("enter the amount");
					double R=sc.nextDouble();
					
					System.out.println("int trate");
					double i=sc.nextDouble();
					
                     System.out.println(" tenure");
                     double t=sc.nextDouble();
                     
                     System.out.println(" month");
                     double n=sc.nextDouble();
                     
                     emi mi=new emi();
                     double saba=mi.Emi(R, i,t, n);
                     System.out.println(saba);
                    
                     mi.repay( saba,R,i, t,n);
                     
                     
		}
		
		

}
