package data_types_and_variables_lab;

import java.util.Scanner;

public class a_metres_to_kilometres
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the distance you'd like me to convert from meters to kilometres: ");
		int metres=Integer.parseInt(scanner.nextLine());
		double kilometres=metres/1000.0;	// делим с ".0", за да не се загубят данни 
		System.out.printf("%d m. is %.2f km.", metres, kilometres);
	}
}
