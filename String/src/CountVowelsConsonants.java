import java.util.*;
public class CountVowelsConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String str = InputString.inString();
	int a=0;
	int z=0;
	int n=str.length();
	char [] c= str.toCharArray();
	for(int i=0;i<n;i++)
	{
		if(c[i]!=' ')
		{
		if(c[i]== 'a' ||c[i]== 'e'||c[i]== 'i' ||c[i]== 'o' ||c[i]== 'u'  )
		{
			a++;
		}
		else
		{
		z++;
		}
		}
	}
	System.out.println("Number of vowels= "+a);
	System.out.println("Number of Consonants="+z);
}
}