//checked exception
import java.io.*;
class exception
{
	public static void main(String args[])throws IOException
	{
		FileReader file=new FileReader("C:\\Users\\Admin\\Desktop\\Movie");
		BufferedReader fileInput= new BufferedReader(file);
		System.out.println(fileInput.readLine());
		file.close();
	}
}