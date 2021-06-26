
public class OnlyDigit extends InputString {
	int i=0;
	static int n=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1= InputString.inString();
		n= str1.length();
		boolean res = NumericString(str1);
		if(res==true)
		{
			InputString.outString("String is Numeric");
		}
		else
		{
			InputString.outString("String is Not Numeric");
		}
		
	}
	public static boolean NumericString(String str)
	{
		String str2 = str;
		for(int i=0;i<n-1;i++)
		{
			if(Character.isDigit(str2.charAt(i))==false)
				return false;
		
		}
		return true;
		
	}

}
