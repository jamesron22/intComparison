import java.util.Scanner;
/*
 *  A program that compares the size of two numbers.
 *  Author: Ronald Colmeman
 *  Date: October 2019
*/
public class Comparison
{
	  public static void main(String[] args)
    {
		Scanner firstInput = new Scanner (System.in);
		System.out.print("Enter first number: ");
		int Num1 = firstInput.nextInt();

		Scanner secInput = new Scanner (System.in);
		System.out.print("Enter second number: ");
		int num2 = secInput.nextInt();

		if (Num1 > num2)
		{
			System.out.println(Num1 + " is larger than " + num2);
		}
		else
		{
			System.out.println(Num1 + " is smaller than " + num2);
		}
	}
}
