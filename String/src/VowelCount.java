import java.util.*;
public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur statement=");
		String str = sc.nextLine();
		int a=0,e=0,i=0,o=0,u=0;
		char [] s = str.toCharArray();
		int n = str.length();
		for(int j=0;j<n;j++)
		{
			if (s[j]=='a')
				a++;
			else if (s[j]=='e')
				e++;
			else if (s[j]=='i')
				i++;
			else if (s[j]=='o')
				o++;
			else if (s[j]=='u')
				u++;
			
		}
		System.out.println("a="+a);
		System.out.println("e="+e);
		System.out.println("i="+i);
		System.out.println("o="+o);
		System.out.println("u="+u);
		
	}

}
