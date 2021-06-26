package ArrayListConcept;

import java.util.ArrayList;

public class RemoveObjects {
		// How to remove objects from ArrayList
	public static void main(String[] args) {
		ArrayList<Integer> al = RemoveDuplicates.InputArrayList();
		al.remove(0); // remove with index
		al.remove(al.get(0)); //remove with object
		System.out.println(al);
		
	}

}
