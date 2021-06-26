import java.util.Arrays;

public class ContinousArraySumsGivenNumber {

	public static void main(String[] args) {
		//to find all the sub arrays that sums up to a given number 
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,-1,5,6,7,8,9};
		int n1=11;
		int sum=0;
		System.out.println("Created array is="+Arrays.toString(a));
		System.out.println("The subarrays sums "+n1+" are=");
		for(int i=0;i<a.length;i++)
		{
			sum=0;
			for(int j=i;j<a.length;j++)
			{
				sum = sum +a[j];
				if(n1==sum) {
					System.out.println(Arrays.toString(Arrays.copyOfRange(a, i, j+1)));
				}
			}
		}
	}

}
