import java.util.*;
public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter 1st string=");
		String str1 = sc.nextLine();
		System.out.println("Enter 2nd string=");
		String str2 = sc.nextLine();
		System.out.println("Strings before swap "+str1+" "+str2);
		str1=str1+str2;
		str2 = str1.substring(0, str1.length()-str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("Strings after swap= "+ str1 +" "+str2);
	}

}
