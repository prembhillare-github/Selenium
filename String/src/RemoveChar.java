import java.util.*;
public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the statement=");
		String str = sc.nextLine();
		System.out.println("Enter the char to remove=");
		String ch = sc.nextLine();
		char l = ch.charAt(0);
		
		remLetter(str,l);	
	}
	static void remLetter(String s , char c)
	{
		char[] t = s.toCharArray();
		int j,count =0, n=s.length();
		for (int i=j=0; i<n; i++)
		{
			if(t[i] !=c)
				t[j++]=t[i];
			else
				count ++;
			
			while(count> 0)
			{
				t[j++] = '\0' ;
				count --;
			} 
		}
		System.out.println(t);
	}
}
	