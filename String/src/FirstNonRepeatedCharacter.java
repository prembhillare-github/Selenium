import java.util.*;
public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string=");
		String str = sc.nextLine();
		int i,j,n;
		n = str.length();
		char []s= str.toCharArray();
		int count = 0;
	//	HashMap <Integer, Character > hm = new HashMap<Integer, Character>();
		//HashMap can be used to store and print all the non repeated characters in the string apart from just showing the first 
		// non - repeated character in the string
		int count1 = 0;
		for (i=0;i<n;i++)
		{
			count=0;
			for(j=0;j<n;j++)
			{
				if(j<i&& s[j]==s[i])
				{
					break;
				}
				if(s[j]==s[i])
				{
					count ++;
				}			
			}
			
			if(count==1)
			{
				//hm.put(i, s[i]);
				System.out.println("First non repeated character is = "+s[i]);
				count1++;
				break;
			}
			
		}
		//System.out.println("All non repeated characters is string are = ");
	//	System.out.println(hm.entrySet());
		if(count1==0)
		{
			System.out.println("No Non-repeated Character found in string");
		}
		
		
	}

}
