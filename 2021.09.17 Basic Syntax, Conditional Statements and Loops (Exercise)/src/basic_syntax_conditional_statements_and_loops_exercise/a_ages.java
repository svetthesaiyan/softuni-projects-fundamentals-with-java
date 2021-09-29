package basic_syntax_conditional_statements_and_loops_exercise;

import java.util.Scanner;

public class a_ages
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age=Integer.parseInt(scanner.nextLine());
		if(age>=0 && age<=2)
			System.out.print("Aw, you're a tiny, little baby!");
		else if(age>=3 && age<=13)
			System.out.print("You're growing so fast, aren't ya, little bud?");
		else if(age>=14 && age<=19)
			System.out.print("You're a teen that's moody most of the time... Those hormonal changes are kind of rough, right?");
		else if(age>=20 && age<=65)
			System.out.print("It's time for the real world, pal - taxes, taxes and even more taxes...");
		else if(age>65)
			System.out.print("Hey, why's that dementia link purple...");
	}
}
