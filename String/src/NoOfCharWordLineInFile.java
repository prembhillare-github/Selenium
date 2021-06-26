import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//import java.util.HashMap;

public class NoOfCharWordLineInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int nline=0;
		int nchar=0;
		//HashMap<String,Integer> hm = new HashMap<String,Integer>();
		File f = new File("C:\\Users\\KUMAR\\Desktop\\text.txt");
		BufferedReader reader = null;
		try
		{
			reader = new BufferedReader (new FileReader(f));
			String currentLine = reader.readLine();
			while(currentLine!=null)
			{
				nline++;
				String words[]= currentLine.toLowerCase().split(" ");
				i +=words.length;
				for(String word :words)
				{
					//hm.put(word, i);
				char c [] =word.toCharArray();
					nchar+=c.length;
				}
				currentLine= reader.readLine();
			}
			System.out.println("No. of word ="+i);
			System.out.println("No. of line ="+nline);
			System.out.println("No. of Characters ="+nchar);
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	}

}
