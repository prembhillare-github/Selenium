import java.util.*;
public class ReverseEachWord extends InputString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = InputString.inString();
		String [] str1Array = str1.split(" ");
		int n= str1Array.length;
		for(int i=0;i<n;i++)
		{
			String s1 = str1Array[i];
			int l1= s1.length();
			for(int j=l1-1;j>=0;j--)
			{
			System.out.print(s1.charAt(j));
			
			}System.out.print(" ");
		}
		
		
	}

}
