package ArrayListConcept;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
	//Program to remove duplicate elements form ArrayList
	
	public static ArrayList<Integer> InputArrayList() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter size of ArrayList=");
		int size = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<size;i++) {
			al.add(sc.nextInt());
		}
		return al;
	}
	public static void main(String[] args) {
		
		ArrayList<Integer> al1 = InputArrayList();
		Set <Integer> duplicate = new LinkedHashSet<Integer>(al1);
	
		System.out.println("Arraylist after removal");
		System.out.println(duplicate);
	}
}
