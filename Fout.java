import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Fout 
{
	public static void main (String[] args)throws IOException
	{
		
		System.out.println("Enter File Name ");
		Scanner sc = new Scanner(System.in);
		
		File fl = new File("D:\\Carl\\" + sc.nextLine() + ".cy");
		sc = new Scanner(fl);
		
		
		String File = sc.nextLine();
		System.out.print(File);
		
		sc.close();
	}
}
