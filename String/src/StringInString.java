import java.util.*;
public class StringInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Any String=");
		String Original= sc.nextLine();
		System.out.println("Enter string to search=");
		String Search = sc.nextLine();
		int count=0;
		int i=0;
		
		if(Original.contains(Search)) // it will return true if condition satisfy
		{
			System.out.println("String contains Search String");
		}
		else
		{
			System.out.println("String does not contain Search String");
		}
	//	String [] OriginalArray = Original.split(" ");
		//int l = OriginalArray.length;
		/*for( i=0;i<l;i++)
		{
			
			if(OriginalArray[i].equals(Search))
			{
				count++;
			}
			
		}
		if(count>0)
		{
			System.out.println("String Found");
		}
		else
		{
			System.out.println("String Not Found");
		}*/
		/*while( i<l)
		{
			if(OriginalArray[i].equals(Search))
			{
				count++;
			}
			i++;
		}
		if(count>0)
		{
			System.out.println("String Found");
		}
		else
		{
			System.out.println("String Not Found");
		}
		*/
			
	}

}
