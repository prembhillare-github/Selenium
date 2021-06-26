import java.util.*;
public class CharCountWithoutLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Any String=");
		String str = sc.nextLine();
		System.out.print("Enter character for frequency count=");
		String c = sc.next();
		int n1 = str.length();
		String str2= str.replace(c, "");
		int n2 = str2.length();
		int n3 = n1-n2;
		System.out.println("Frequency count of character= "+c+" in given string is= "+n3);
		
			
	}

}
