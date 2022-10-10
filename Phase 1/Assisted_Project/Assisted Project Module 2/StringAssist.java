package Asistedprojects;

public class StringAssist {
	public static void main(String args[])
	{
		String string_var1="string function Program";
		String string_var2="String functions";
		
		System.out.println("\nString Operations:");
		//CharAt
		System.out.println(string_var1.charAt(5));
		//codePoint
		System.out.println(string_var1.codePointAt(3));
		//codePointBefore
		System.out.println(string_var1.codePointBefore(1));
		//PointCount
		System.out.println(string_var1.codePointCount(0,5));
		
		System.out.println("\nString Comparison function:");
		
		System.out.println(string_var1.compareTo(string_var2));
		//CompareToIgnoare
		System.out.println(string_var1.compareToIgnoreCase(string_var2));
		System.out.println();
		
		System.out.println("\nConcatenated String:");
		//concat
		System.out.println(string_var1.concat(string_var2));
		//contains
		System.out.println(string_var1.contains(string_var2));
		//EndsWith
		System.out.println(string_var1.endsWith("gram"));
		//Equals
		System.out.println(string_var1.equals(string_var2));
		//EqualsIgnore
		System.out.println(string_var1.equalsIgnoreCase(string_var2));
		//HashCode
		System.out.println(string_var1.hashCode());
		//IndexOf
		System.out.println(string_var1.indexOf("Program"));
		System.out.println();
		
		String string_var3="functions Program function";
		
		System.out.println("\nlast occurance position");
		System.out.println(string_var1.length());
		//Replace
		System.out.println(string_var3.replace("functions", "java"));
		System.out.println(string_var3);
		//StartsWith
		System.out.println(string_var3.startsWith(string_var2));
		//toLower
		System.out.println(string_var3.toLowerCase());
		//toUpper
		System.out.println(string_var3.toUpperCase());
		//Trim
		System.out.println(string_var2.trim());
		
		String string_var4="";
		System.out.println(string_var4.isEmpty());
		
		System.out.println("\nCreating string buffer and append method:");
		
		StringBuffer a=new StringBuffer("Welcome to String world");
		a.append("\nHappy learning");
		System.out.println(a);
		//Replace Method
		a.replace(0, 2,"wEL");
		System.out.println(a);
		//insert
		a.insert(0,"W");
		System.out.println(a);
		//delete
		a.delete(0, 1);
		System.out.println(a);
		//String Builder
		System.out.println("\n");
		
		System.out.println("\nCreating string Builder:");
		StringBuilder b= new StringBuilder("Imagine");
		b.append("Believe");
		System.out.println(b);
		//delete
		System.out.println(b.delete(0,1));
		//Insert
		System.out.println(b.insert(1,"Achieve"));
		//reverse
		System.out.println(b.reverse());
		System.out.println();
		
		System.out.println("\nConversion of string to stringbuffer and stringbuilder:");
		String c="My";
		StringBuffer  d = new StringBuffer(c);
		d.reverse();
		System.out.println("String to StringBuffer");
		System.out.println(d);
		
		//String--------->StringBuilder
		StringBuilder e = new StringBuilder(c);
		e.append("World");
		System.out.println("String to Builder");
		System.out.println(e);
		
		
		
		
		
	}

}
