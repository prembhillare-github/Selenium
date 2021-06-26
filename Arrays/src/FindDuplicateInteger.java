import java.util.Scanner;

public class FindDuplicateInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array elemnet =");
		int l= sc.nextInt();
		int []a = new int[l];
		int count=0;
		int i=0;
		while(i<l)
		{
			
			a[i]=sc.nextInt();
			i++;
		}
		for(int p=0;p<l;p++)
		{
			count=0;
			for(int q=0;q<l;q++)
			{
				if(q<p && a[p]==a[q])
				{
				break;
				}
				if(a[p]==a[q])
				{
					count ++;
				}
				
			}
			if(count>1)
			{
				System.out.println("duplicate number is ="+a[p] );
				System.out.println("occured " +count+ " times" );
				
			}
		}
		
	}

}
