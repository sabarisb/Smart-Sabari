package brd;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.SpringLayout.Constraints;

import org.omg.CORBA.PUBLIC_MEMBER;

public class makerchecker {
  
	static ArrayList<String> Listoffields = new ArrayList<String>();
	private static Matcher matcher;

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = null;
		FileReader fileReader = null;

		String file = "D:\\File1.txt";
		fileReader = new FileReader(file);
		bufferedReader = new BufferedReader(fileReader);

		String string;
		while ((string = bufferedReader.readLine()) != null) {
			string += "~";
			Listoffields.add(string);

		}

		String values = null;
		String[] splitter;
		String[] removetilt1 = new String[16];
		
		int count=0;
		for (int i = 0; i < Listoffields.size(); i++) {
			String str = Listoffields.get(i);
			splitter = str.split("(?<=~)");

			for (int j = 0; j < 16; j++) {

				values = splitter[j].substring(0, splitter[j].lastIndexOf("~"));
				removetilt1[j] = values;

			}
//			sabaris_customer_table.insertEmployee(Integer.toString(count+=1) , removetilt1[0], removetilt1[1], removetilt1[2], removetilt1[3],
//					removetilt1[4], removetilt1[5], removetilt1[6], removetilt1[7], removetilt1[8], removetilt1[9],
//					removetilt1[10], removetilt1[11], removetilt1[12], removetilt1[13], removetilt1[14],
//					removetilt1[15]);

		}

	}

	public static void customername(String txt) {
		String regx = "[a-zA-Z]+\\.?";
		Pattern pattern = Pattern.compile(regx, Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(txt);
	}

	public static void pincode(String pincode) {
		if (pincode.length() <= 6) {
			System.out.println("correct");
		} else {
			System.out.println("incorrect ");
		}
	}

	public static boolean emailValidation(String email) {
		if (email.contains("@") || email.contains(".")) {

			if (!email.contains(" ")) {
				return false;
			}
		}
		return false;
	}

	public static boolean recordStatusValidator1(String RecordStatus)

	{
		if (RecordStatus.contains("N") || RecordStatus.contains("M")||RecordStatus.contains("A")||RecordStatus.contains("R")||RecordStatus.contains("D"))
			
		{
			return true;
		}
		return false;}

		public static boolean flag(String flag)
		{
			if(flag.contains("A")||flag.contains("I"))
			{
				return true;
			} else {
				return false;
			}
			}
		
	}


