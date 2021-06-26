import java.util.Arrays;
import java.util.Scanner;
public class SecondLargest {
	//find the 2nd largest from integer array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter length of array=");
		int l = sc.nextInt();
		int a[] = new int[l];
		int i=0;
		int temp=0;
		int stemp=0;		
		System.out.println("Enter array elements=");
		while(i<l)
		{
			a[i]=sc.nextInt();
			i++;
		}
		
		for(int p=0;p<l;p++)
		{
			if(a[p]>temp)
			{
				stemp=temp;
				temp=a[p];
			}
			if(a[p]<temp && a[p]>stemp)
			{
				stemp=a[p];
			}	
		}
		System.out.println("Second Highest number="+stemp);
		/*Using arrays sort method. But it doesn't work if array element is repeated
		Arrays.sort(a);
		System.out.println("Largest number ="+a[l-1]);
		System.out.println("Second largest number="+a[l-2]);
		*/
	}

}
