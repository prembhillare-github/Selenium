package ArrayListConcept;

import java.util.ArrayList;
import java.util.Collections;


public class ReverseArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al = RemoveDuplicates.InputArrayList();
		int size= al.size();
		System.out.println("Original ArrayList= "+al);
		System.out.print("Reversed ArrayList= ");
		ArrayList<Integer> al2=new ArrayList<Integer>();
		for(int i=size-1;i>=0;i--) {
			al2.add(al.get(i));
		}
		System.out.print(al2);
		Collections.reverse(al2);
		System.out.println(al2);
		Collections.sort(al);
		System.out.println("Sorted Array");
		System.out.println(al);

	}

}
