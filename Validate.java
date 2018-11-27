package brd;


import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Validate 
{
	static SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
	public static void main(String[]args)
	{
	System.out.println(DateTypeValidator(10.225));
	System.out.println(DataLengthValidator("Saba",(short)4));
	System.out.println(SpecialCharacterValidator("Saba"));
	System.out.println(domainValidation());
	System.out.println(emailValidation("mailme.sabaris96@gmail.com"));
		System.out.println(dateformat(formatter,"30/11/1996"));
	}
	private static Boolean dateformat(SimpleDateFormat formatter, String string) {
		
		return null;
	}
	
	public static boolean DateTypeValidator(Object numeric)
	{
		if(numeric.getClass().getSimpleName().equals("integers"))
				{
			return true;
				}
				else if(numeric.getClass().getSimpleName().equals("Strings"))
				{
					return true;
					
				}
	
	else if(numeric.getClass().getSimpleName().equals("character"))
	{
		return true;
	}
	else if(numeric.getClass().getSimpleName().equals("double")){
		return true;
	}
	return false;
}
public static boolean DataLengthValidator(String object,short length) 
{
	if(object.length()<=length)
	{
		return true;
	}
	return false;
}
public static boolean SpecialCharacterValidator(String character)
{
	if(character.contains("@")||character.contains("#")||character.contains("$")||character.contains("%")||character.contains("^"))
	{
		return false;
	}
	return true;
}
public static boolean domainValidation1()
{
String character1 = null;

	if(character1.contains("@")||character1.contains("#")||character1.contains("$")||character1.contains("%")||character1.contains("^"))
{
	return false;
}
return true;
}
public static boolean domainValidation()
{
	ArrayList<String>date=new ArrayList<String>();
	date.add("Monday");
	date.add("Tuesady");
	date.add("wed");
	date.add("thuday");
	date.add("friday");
	date.add("satday");

if(date.contains("Sunday"))
{
	return true;
}
else
{
	
	return false;
}
}
public static  boolean emailValidation(String email) {
	if(email.contains("@")||email.contains("."))
		
	{
		if(!email.contains(" "))
		{
			return false;
		}
	}
	return false;
}
public static Boolean day1(SimpleDateFormat formatter,String datevalue)
{
	try
	{
		formatter.parse(datevalue);
	return true;
	}
	catch(Exception e)
	{
	return false;
	}

	
}	
}

	

	
	
	

