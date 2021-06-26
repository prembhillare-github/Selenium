import java.util.Arrays;

public class LeaderInArray {

	public static void main(String[] args) {
		//find all the leaders in an integer array
		//leader number means if number is greater than all the numbers form 
		//its right side of array
		// TODO Auto-generated method stub
		int a1[]= {1,18,5,3,9,4,2,8,7,3};
		//here leader numbers are 18,9,8,7,3
		System.out.println("Given array is="+Arrays.toString(a1));
		System.out.println("Leaders in array are");
		int temp=0;
		for(int i=a1.length-1;i>=0;i--)
		{
			
			if(a1[i]>temp)
			{
				System.out.println(a1[i]);
				temp=a1[i];
				
				
			}
		}
	}

}
