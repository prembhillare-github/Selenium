
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Welcome to Beed";
		String[] strArray = str.split(" ");
		for (int i=strArray.length-1;i>=0;i--)
		{
			System.out.println(strArray[i]);
		}
		//for (int i=0 ; i<3;i++) {
			//char []s1 = strArray[i].toCharArray();
			//for (int j= s1.length-1; j>=0;j--) {
			//	System.out.print(s1[j]);
			//}
			//System.out.print(" ");
		//}
		
	}
	

}
