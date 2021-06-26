package ArrayListConcept;

import java.util.ArrayList;

public class SublistFromArrayList {
		// Program to get Sublist from ArrayList
	public static void main(String[] args) {
		ArrayList<Integer> al = RemoveDuplicates.InputArrayList();
		int size = al.size();
		
		System.out.println(al.subList(0, size/2));
		System.out.println(al.subList(size/2,size));
		
	}

}
