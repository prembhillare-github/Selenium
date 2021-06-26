import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {
	//To remove duplicate elements from an array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,1,2,5,4,23,6};
		int end=a.length;
		HashSet<Integer> hs = new HashSet<Integer>();
		System.out.println("Before"+Arrays.toString(a));
		for(int i=0;i<end;i++)
		{
			if(!hs.contains(a[i])) {
				hs.add(a[i]);
			}
		}
		System.out.println("after"+hs);
	}

}
