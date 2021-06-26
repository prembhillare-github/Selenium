
public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {91,93,94,95,96,97,98,99,100};
		int sum=0;
		int sum1=0;
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			sum= sum+a[i];
		
		}
		temp=a[0];
		int p=0;
		while(p<a.length+1) {
			sum1= sum1+temp;
			p++;
			temp++;
		}
		System.out.println("Sum="+sum);
		System.out.println("Sum1="+sum1);
		int fsum=sum1-sum;
		System.out.println("Missing number="+fsum);
	}

}
