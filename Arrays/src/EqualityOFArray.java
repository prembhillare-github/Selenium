import java.util.Arrays;
import java.util.Scanner;

public class EqualityOFArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int i=0,j=0;
		System.out.println("Enter length of 1st array=");
		int l1= sc.nextInt();
		int []a1= new int[l1];
		System.out.println("Enter Elements of 1st array=");
		while(i<l1)
		{
			a1[i]=sc.nextInt();
			i++;
		}
		System.out.println("Enter length of 2nd array=");
		int l2= sc.nextInt();
		int []a2= new int[l2];
		System.out.println("Enter Elements of 2nd array=");
		while(j<l2)
		{
			a2[j]=sc.nextInt();
			j++;
		}
		boolean status=true;
		if(l1==l2)
		{
			for(int p=0;p<l1;p++)
			{
				if(a1[p]!=a2[p])
				{
					status=false;
				}
			}
		}
		else {
			status=false;
		}
		if(status==true) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
		
		
		
		/*
		 * using arrays equal function
		if(Arrays.equals(a1, a2))
		{
			System.out.println("Arrays are  equal");
		}
		else {
			System.out.println("Arrays are NOT equal");
		}
		*/	
		
	}

}
