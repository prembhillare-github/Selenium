import java.util.*;
public class FirstLetterCap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter ur statement=");
		String str = sc.nextLine();
		
		String uprCase = "";
		
		Scanner sc1 = new Scanner(str);
		
		while(sc1.hasNext())
		{
			String word = sc1.next();
			uprCase += Character.toUpperCase(word.charAt(0)) + word.substring(1)+" ";
			
		}
		System.out.println("Original Statement= "+str);
		System.out.println("First letter Cap Statement= "+ uprCase.trim());
	}

}
