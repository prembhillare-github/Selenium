import java.util.HashSet;

public class UnionofArray {
	//Union of 2 arrays means a arrays containing elements that are in A or B or Both
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int b[]= {1,6,7,8,2,9};
		//for union
		HashSet<Integer> hs = new HashSet<Integer> ();
		for(int i:a) {
			hs.add(i);
		}
		for(int j:b) {
			if(!hs.contains(j))
			{
				hs.add(j);
			}
		}
		System.out.println("Union of a and b="+hs);
		//for intersection
		HashSet<Integer> hs1 = new HashSet<Integer>();
		for(int p=0;p<a.length;p++) {
			for(int q =0;q<b.length;q++) {
				if(q<p && b[q]==a[p])
				{
					break;
				}
				if(b[q]==a[p])
				{
					hs1.add(a[p]);
				}
			}
		}
		System.out.println("Intersection ="+hs1);
	}

}
