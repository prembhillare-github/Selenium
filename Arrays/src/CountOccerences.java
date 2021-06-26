import java.util.Arrays;


public class CountOccerences {
		//Count occerences of each element in the array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,1,2,4,3,5};
		int count=0;
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			count=0;
			for(int j=0;j<a.length;j++)
			{
				if(j<i && a[i]==a[j])
				{
					break;
				}
				if(a[j]==a[i])
				{
					count++;
				}
				if(j==a.length-1)
				{
					System.out.println("Element "+a[i]+" occured "+count+" times");
				}
				
			}
			
		}
		
	}

}
