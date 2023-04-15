package csjava;
import java.io.*;
public class NewClass {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException,IOException
	{
		FileReader reader = new FileReader("C:\\Users\\ACER\\eclipse-workspace\\csjava\\bin\\csjava\\ABC.txt");
        BufferedReader bufferread = new BufferedReader(reader);
        StreamTokenizer token = new StreamTokenizer(bufferread);
        // Use of commentChar() method
        token.commentChar('a');
        int t;
        while ((t = token.nextToken()) != StreamTokenizer.TT_EOF)
        {
            switch (t)
            {
            case StreamTokenizer.TT_NUMBER:
                System.out.println("Number : " + token.nval);
                break;
            case StreamTokenizer.TT_WORD:
                System.out.println("Word : " + token.sval);
                break;
  
            }

	}
  }

}
