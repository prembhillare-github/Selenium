import java.util.Arrays;

public class ReverseArrayWithoutAdditionalArray {
	// reverse an array without using any additional array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int start =0;
		int temp=0;
		int end=a.length-1;
		System.out.println("Original array="+Arrays.toString(a));
		while(start<end) {
			temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start ++;
			end --;
		}
		System.out.println("Reversed array="+Arrays.toString(a));
	}

}
