import java.util.*;
public class FreqCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Statement");
		String str = sc.nextLine();
		
		str = str.replace(" ","");
		char[]s1 = str.toCharArray();
		int i=0,j=0,count =0;
		int len= str.length();
		for ( i =0;i<len;i++)
		{
			count=0;
			for (j=0;j<len;j++)
			{
				if (j<i && s1[j]==s1[i])
				{
					break ;
				}
				 if (s1[j]==s1[i])
				{
					count++;
				}
				 if (j==len-1)
				 {
					 System.out.println("Char "+s1[i]+" found "+count+" times");
				 }
			}
			
		}
	}

}
