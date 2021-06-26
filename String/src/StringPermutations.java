import java.util.*;;
public class StringPermutations {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter String=");
		String str = sc.next();
		
		printPermutations(str, "" );
		
	}
	public static void printPermutations(String ques, String ans)
	{
		

		if(ques.length()==0)
		{
			System.out.println(ans);
			return;
		}
		for(int i=0;i<ques.length();i++)
		{
			char ch = ques.charAt(i);
			String qlpart = ques.substring(0,i);
			String qrpart = ques.substring(i+1);
			String roq = qlpart + qrpart;
			printPermutations(roq,ans+ch);
		}
	}
}
