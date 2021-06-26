import java.util.*;
public class InputString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str2 = null;
		String str1 = inString();
		outString(str2);
		
	}
	public static String inString()
	{
		System.out.println("Enter any String=");
		 Scanner sc = new Scanner (System.in);
		 String str = sc.nextLine();
		 return str;
		
	}

	public static void outString(String str3)
	{
		String str4=str3;
		System.out.println(str4);
	}
}
