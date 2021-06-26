import java.util.Scanner;

public class SumEqualGivenNumber{
	
	public static void main(String [] args) {
		//finding all pairs of elements whose sum is equal to given number
		Scanner sc = new Scanner (System.in);
		int [] a= {1,2,3,4,5,6,7,8,9};
		int t=0;
		System.out.println("Enter any number=");
		int n1=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			for(int j =0;j<a.length;j++) {
				t= a[i]+a[j];
				if(j<i && t==n1)
				{
					break;
					
				}
				if(t==n1) {
					System.out.println("Sum of "+a[i]+" & "+a[j]+" is equals given number="+n1);
				}
			}
		}
		
	}
}