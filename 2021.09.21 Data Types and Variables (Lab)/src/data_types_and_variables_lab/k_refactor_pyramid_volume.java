package data_types_and_variables_lab;

import java.util.Scanner;

public class k_refactor_pyramid_volume
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the length of your pyramid: ");
		double length=Double.parseDouble(scanner.nextLine());
		System.out.print("Enter the width of your pyramid: ");
		double width=Double.parseDouble(scanner.nextLine());
		System.out.print("Enter the height of your pyramid: ");
		double height=Double.parseDouble(scanner.nextLine());
		
		double volume=(length*width*height)/3;
		System.out.printf("\n"+"The volume of your pyramid is %.2f cubed metres.", volume);
	}
}
