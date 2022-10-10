package Asistedprojects;

import java.util.regex.*;
public class RegularExpressions {
	
	public static void main(String[] args) {
		String pattern = "[a-z]";
		String check= "Meha Palani";
		
		Pattern p= Pattern.compile(pattern);
		Matcher c= p.matcher(check);
		
		while(c.find())
			System.out.println(check.substring(c.start(),c.end()));
	}

}
