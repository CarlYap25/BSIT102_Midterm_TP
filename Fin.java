import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
public class Fin 
{
	public static void main(String[] args)throws IOException
	{
		Scanner sc = new Scanner(System.in);
		String Text, Text2;
		
		System.out.println("Input your File Name: ");
		Text = sc.nextLine();
		System.out.println("Input text content: ");
		Text2 = sc.nextLine();
		
		FileWriter fw = new FileWriter("D:\\Carl\\" + sc.nextLine() + ".cy");
		
		fw.write(Text);
		fw.close();
	}
}
