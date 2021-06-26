import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Word to check Palindrome=");
		String str = sc.next();
		char [] s1 = str.toCharArray();
		int n= str.length();
		int i,j,count =0;
		for (i=0,j=n-1;i<n&&j>=0;i++,j-- )
		{
			if (s1[i]!=s1[j])
				count++;
				
		}
		if (count==0)
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
	}

}
