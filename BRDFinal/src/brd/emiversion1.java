package brd;
//author : Sabaris R B
//class  : emiversion1
//version :1.1
//created date:27/11/18
//modified date:23.12.18

import java.util.Scanner;
//import java.util.List;
//import java.util.ArrrayList;


public class emiversion1 {
	

	//public static void main(String[]args) {
	 double Emi(double Principal,double interst,double tenure,double numofyears)
	{
		double Y,T,S,I,emi;
		interst=interst/100;
		I=interst/numofyears;
		Y=1+I;
		T=Math.pow(Y, tenure);
		S=1/T;
		emi=(Principal*I)/(1-S);
		return emi;
	}

		void repaymentschedule(double emiamount,double principle,double interest,double tenure,double numofyears)
		{
			int installmentno;
			//OPn =Outstanding Principal at the beginning of the nth Installment period
			double opn[]=new double[100];
			//Pn = Principal component of the nth installment
			double pn[]=new double[100]; 
			//In = Interest component of the nth Installment
			double in[]=new double[100];
			opn[1]=principle;
		
			for(installmentno=1;installmentno<=numofyears;installmentno++)
			{
				
				in[installmentno]=(double)Math.round((opn[installmentno]*(interest/(1200)))*100/100);
				pn[installmentno]=(double)Math.round(((emiamount-in[installmentno])*100)/100);
				opn[installmentno+1]=(double)Math.round(((opn[installmentno]-pn[installmentno])*100)/100);
				System.out.println(installmentno +"   "+(in[installmentno])+"  " + (pn[installmentno]) + "  " +opn[installmentno]);
		}
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the no of installments");
	int output=scanner.nextInt();
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
			Scanner scanner=new Scanner(System.in);
					System.out.println("enter the principal amount");
					double amount=scanner.nextDouble();
					
					System.out.println(" rate of interst");
					double interset=scanner.nextDouble();
					
                     System.out.println(" num of tenure");
                     double tenure=scanner.nextDouble();
                     
                     System.out.println("  num of month");
                     double noyears=scanner.nextDouble();
                     
                     emiversion1 emi=new emiversion1();
                     double emiamount=emi.Emi(amount, interset,tenure, noyears);
                     System.out.println(emiamount);
                    
                     emi.repaymentschedule( emiamount,amount,interset, tenure,noyears);
                     
                     
		}
		
		

}
