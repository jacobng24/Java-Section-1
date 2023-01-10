package section1;

import java.util.Scanner;

public class HCS_1_4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//the Scanner class, reference the java api, has a method to take in the next line of input from the user
		System.out.print("Please input diameter of your circle in inches:\t");
		double val = sc.nextDouble();
		val = val * Math.PI;
		System.out.println("The circumference of your circle:\t"+val);
		val = val / Math.PI;
		val /= 2;
		val = (val * val) * Math.PI;
		 
		
		System.out.println("The area of your circle is:\t"+val);

		/*
		Inform the user that this program will ask them for the diameter of a circle then calculate and provide for them the
		area of the circle and circumference of the circle

		Sample output:
		This program will request the diameter of a circle
		        then calculate and output the circumference and are of that circle.

		Please input the diameter of a circle in inches:        3.2

		The circumference of a circle with a 3.2 diameter is 10.053096491487338 inches

		The area of a circle with a 3.2 diameter is 8.042477193189871 inches squared

		:End sample output*/

	}
}