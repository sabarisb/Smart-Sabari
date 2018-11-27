package brd;

import java.util.Scanner;

public class Brd{
	
public static void main(String[] args) 
{
	
        Scanner scan = new Scanner(System.in);
        System.out.println("enter");
        String input = scan.next();
       
        try
        {
            double isNum = Double.parseDouble(input);
            if(isNum == Math.floor(isNum)) 
            {
                System.out.println("Input is Integer");
            }
            
            else 
            {
                System.out.println("Input is Double");
            }
        }
        catch(Exception e)
        {
            if(input.toCharArray().length == 1)
            {
                System.out.println("Input is Character");
            }
            else
            {
                System.out.println("Input is String");
            }
            
        }
        
}
}   
