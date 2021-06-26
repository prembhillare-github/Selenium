package ArrayListConcept;

import java.util.ArrayList;
import java.util.Collections;

public class SortDescending {
	// sort ArrayList in descending order
	public static void main(String[] args) {
		ArrayList <Integer> al= RemoveDuplicates.InputArrayList();
		al.sort(null);
		Collections.reverse(al);
		System.out.println("Descending sorted arraylist");
		System.out.println(al);
	}

}
