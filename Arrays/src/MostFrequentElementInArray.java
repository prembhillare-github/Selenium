import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MostFrequentElementInArray {
	// to get the most frequent or most occured element in an array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,1,2,3,4,5,1,2,1};
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i:a) {
			
			if(!hm.containsKey(i))
			{
				hm.put(i, 0);
			}
			if(hm.containsKey(i))
			{
				hm.put(i, hm.get(i)+1);
				
			}
		}
	
		System.out.println(hm);
		int count=0;
		int val1=0;
		for(Entry<Integer, Integer> val :hm.entrySet())
		{
			if(count<= val.getValue()) {
				count=val.getValue();
				val1 = val.getKey();
			}
		}
		System.out.println("Most frequest element="+val1);
		System.out.println("Repeated ="+count+" Times");
		
	}

}
