package brd3;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Brd_fileupload {

	private static String s1;
	private static String str;
	private static BufferedReader bf;
	
	public static void main(String[]args) throws IOException
	{
	ArrayList<String> Listoffields =new ArrayList<String>();
//		
		String file="File1.txt";
		if(file.endsWith(".txt")) {
			System.out.println("the file '.txt' ");
			FileReader f1=new FileReader("D:\\File1.txt");
			BufferedReader bf=new BufferedReader(f1);
			String string;
			while((string =bf.readLine())!=null)
			{
				string +="~";
				Listoffields.add(string);
				
			}
			
		}
		String removed=null;
		for(int i=0;i< Listoffields.size();i++)
		{
			String str=Listoffields.get(i);
			String[] str1=str.split("(?<=~)");
			for(int j=0;j<16;j++)
			{
				removed=str1[j].substring(0,str1[j].lastIndexOf("~"));
				System.out.println(removed);
			}
			database.getConnection("1",removed[0],removed[1],removed[2],removed[3],removed[4],removed[5],removed[6],removed[7],removed[8],removed[9],removed[10],removed[11],removed[12],removed[13],removed[14],removed[15]);
//            customername(str1[1].substring(0,str[1].lastIndexOf("~")));  
//		pincode(str1[4],substring(0,str[4],lastIndexOF("~")));
			recordStatusValidator(str1[5].substring(0,str1[9].lastIndexOf("~")));
		}
		
		}
	else
		{
			System.err.println("the file wrong format");
		}
		public static void customername(String txt)
		{
			String regx="[a-zA-Z]+\\.?";
			Pattern pattern=Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
			Matcher matcher=pattern.matcher(txt);
		}
		public static void pincode(String pcode) {
			if(pcode.length()<=6)
			{System.out.println("correct");
			}
			else
			{
				System.out.println("incorrect ");
			}
		}
		public static boolean emailValidation(String email)
		{
			if(email.contains("@")||email.contains("."))
			{
//				 Pattern pattern=Pattern.comple(//s);
//			Matcher matcher=pattern.matcher(email);
				if(!email.contains(" "))
				{return false;
				}}
			return false;
		}
		public static boolean recordStatusValidator1(String RecordStatus, String active_Inactive)
		
		{
			if(RecordStatus.contains("N")||active_Inactive.contains("M"));
			{
				return true;
			}
			else
			{
				return false;
			}
			
			
				}
		
		}

	
		
	

