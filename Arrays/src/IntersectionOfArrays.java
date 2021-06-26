
public class IntersectionOfArrays {

	public static void main(String[] args) {
		//find intersection between two arrays means finding common elements
		// TODO Auto-generated method stub
		int[]a1= {14,12,15,17,13,31,91};
		int a2[]={20,24,25,311,62,84,37,171};
		int count=0;
		System.out.println("Same elements are=");
		for(int i=0;i<a1.length;i++) {
			for(int j =0;j<a2.length;j++) {
				if(a1[i]==a2[j]) {
					count++;
					System.out.println(a1[i]);
				}
			}
		}
		if(count==0)
		{
			System.out.println("No arrays are same");
		}
	}

}
