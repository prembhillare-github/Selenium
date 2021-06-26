import java.util.*;
public class DisplayDuplicate {
		// Display duplicate characters from string
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter String=");
		String str = sc.nextLine();
		int count =0;
		int i,j;
		char []s=str.toCharArray();
		for ( i=0;i<str.length()-1;i++)
		{	
			count =0;
			for( j=0;j<str.length()-1;j++)
			{
				if(j<i && s[j]==s[i])
				{
					break;
				}
				if (s[j]==s[i])
				{
					count ++;
				}
			}
			if (count >1)
			{
				System.out.println("Duplicate char is = "+s[i]+" Repeated "+count+" times");
			}
			//str = str.replace(" "+s[i], "");
			}
	
	}	
	}

