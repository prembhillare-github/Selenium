import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArraylistAndViceVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] =new int[5];
		ArrayList<Integer> a1= new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		for(int i=0;i<a.length;i++) {
			a[i]=a1.get(i);
		}
		System.out.println(Arrays.toString(a));
	}

}
