import java.util.*;
public class CountWordsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc= new Scanner(System.in);
			System.out.println("Enter ur String");
			String str = sc.nextLine();
			String[] strArray= str.split(" ");
			int n= strArray.length;
			int i,count=0;
			for(i=0;i<n;i++)
			{
				if(strArray[i]!="")
				{
					count++;
				}
				
					
			}
			System.out.println("Word count in given string is= "+count);
	}

}
