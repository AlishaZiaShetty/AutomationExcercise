package Practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNumericVal
{
	
	public static void main(String[] args) 
	{
		String str = "Ali23sha05zia1990born";
		String nums = str.replaceAll("[^0-9 ]", "").replaceAll(" +", " ").trim();
		System.out.println("checking if its right : "+nums);
	}
}
