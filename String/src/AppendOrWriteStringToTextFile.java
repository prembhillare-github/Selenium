import java.util.*;
import java.io.*;

public class AppendOrWriteStringToTextFile {
	public static void write(String s, File f) throws IOException
	{
		//FileWriter fw = new FileWriter(f);//when we use FileWriter(f) it overrides the content in the file
		FileWriter fw = new FileWriter(f,true);//when we use FileWriter(f,true) it will append string to the text file
		fw.write(s);
		fw.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f = new File("C:\\Users\\KUMAR\\Desktop\\text.txt");
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter string to write in text File=");
			String str = sc.nextLine();
			write(str,f);
		}
		catch(IOException e)
		{
			
		}
	
	}

}
