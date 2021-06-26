import java.util.*;
public class ReverseStringUsingRecursion extends InputString{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = InputString.inString();
		String[] strArray = str1.split(" ");
		int n= strArray.length;
		printReverse(strArray,n);
		//while( i<n)
		//{
		//	printReverse(strArray[n-1-i]);
		//	i++;
		//}
	}
	public static void printReverse(String[] strArray,Integer n1)
	{
		int n2=n1;
		if(n2<=0)
		{
			InputString.outString("Reverse string Printed");
		}
		else
		{
		InputString.outString(strArray[n2-1]);
		n2--;
		printReverse(strArray,n2);		
		}
		
	}

}
