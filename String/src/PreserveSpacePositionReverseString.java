import java.util.*;
public class PreserveSpacePositionReverseString extends InputString{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1= InputString.inString();
		String str2="";
		char []str1Array=str1.toCharArray();
		char []str2Array= new char[str1.length()];
		
		int i;
		int n=str1.length();
				
		for(i=0;i<n;i++)
		{
			if(str1Array[i]==' ')
			{
				str2Array[i]=' ';
			
			}
		}
		int j = str2Array.length-1;
		for(i=0;i<n;i++)
		{
			if(str1Array[i]!=' ')
			{	
				if(str2Array[j]==' ')
				{
					j--;
				}
			
			str2Array[j]=str1Array[i];
			j--;
			}
		}
		System.out.println(String.valueOf(str2Array));
	
	}
}