import java.util.*;
public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter String=");
		String str = sc.nextLine();
		char [] c = str.toCharArray();
		Arrays.sort(c);
		String sorted = new String(c);
		System.out.println("Sorted String= "+sorted);
		int a[]= {15,5,17,2,3,640};
		Arrays.sort(a);
		
		String b = Arrays.toString(a);
		
		
		
		System.out.println("Sorted Integer array = "+b);
	}

}
