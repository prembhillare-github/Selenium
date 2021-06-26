import java.util.*;
public class ReplaceWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any String-");
		String str1= sc.nextLine();
		String str2= "";
		System.out.println("Original String= "+str1);
		for(int i=0;i<str1.length()-1;i++)
		{
			if(str1.charAt(i)!=' ')
			{
				str2 +=str1.charAt(i);
			}
		}
		System.out.println("String without White spaces= "+str2);
	}

}
