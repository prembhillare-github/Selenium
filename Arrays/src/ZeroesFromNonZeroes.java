import java.util.Arrays;

public class ZeroesFromNonZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[]= {0,15,0,14,12,19,0,17,0};
		int j=0;
		System.out.println("Original Array="+Arrays.toString(a1));
		for(int i=0;i<a1.length;i++) {
			if(a1[i]!=0) {
				a1[j]=a1[i];
				j++;
			}	
		}
		while(j<a1.length) {
			a1[j]=0;
			j++;
		}
		System.out.println("Updated array="+Arrays.toString(a1));
	}

}
