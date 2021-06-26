import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner (System.in);
		System.out.println("Enter 1st String=");
		String str1= sc.next();
		System.out.println("Enter 2nd String=");
		String str2= sc.next();
		
		if (checkAnagram(str1,str2))
		{
			System.out.println("Strings are Anagram");
		}
		else
		{
			System.out.println("Strings are not Anagram");
		}
		}
	public static boolean checkAnagram(String str1, String str2)
	{
		char [] strArray1 = str1.toCharArray();
		char [] strArray2 = str2.toCharArray();
		Arrays.sort(strArray1);
		Arrays.sort(strArray2);
		
		String sortedstr1 = new String(strArray1);
		String sortedstr2 = new String(strArray2);
		
		if(sortedstr1.equals(sortedstr2))
		{
		return true;
		}
		else
		{
			return false;
		}
	}
}
