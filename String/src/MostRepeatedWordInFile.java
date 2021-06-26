import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class MostRepeatedWordInFile {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		HashMap <String, Integer> hm = new HashMap<String,Integer>();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("C:\\Users\\KUMAR\\Desktop\\text.txt"));
			String currentLine = reader.readLine();
			while(currentLine!=null)
			{
				String []words= currentLine.toLowerCase().split(" ");
				for(String word:words)
				{
					if(hm.containsKey(word))
					{
						hm.put(word, hm.get(word)+1);
					}
					else
					{
						hm.put(word, 1);
					}
				}
				currentLine = reader.readLine();
			}
			String repeated = null;
			int count =0;
			Set <Entry<String, Integer>> entrySet = hm.entrySet();
			for(Entry<String,Integer>entry :entrySet)
			{
				if(entry.getValue()>count)
				{
					repeated = entry.getKey();
					count = entry.getValue();
					
				}
			}
			System.out.println("Most repeated word = "+repeated);
			System.out.println("Occurenece of word = "+ count);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}

}
