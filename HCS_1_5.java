package section1;

import java.util.Scanner;

public class HCS_1_5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//the Scanner class, reference the java api, has a method to take in the next line of input from the user
		System.out.print("Please enter the x value of point 1:\t");
		int val = sc.nextInt();
		System.out.print("Please enter the y value of point 1:\t");
		int val2 = sc.nextInt();
		System.out.print("Please enter the x value of point 2:\t");
		int val3 = sc.nextInt();
		System.out.print("Please enter the y value of point 2:\t");
		int val4 = sc.nextInt();
		
		double val5 = (val3 - val);
		val5 *= val5;
		double val6 = val4 - val2;
		val6 *= val6;
		
		double val7 = val5 + val6;
		val7 = Math.sqrt(val7);
		
		
	
		System.out.println("The distance between (" +val +" , " +val2 +") and ("+val3 +", " +val4 +") is "+val7);
	
	
		 int v1 = 17;
		 int v2 = 88;
		 int v3 = 157;
		 int sum1 = v1 + v2 + v3;
		 System.out.println("17 + 88 + 157 = " +sum1);
		 double avg = sum1 / 3.0;
		 System.out.println("The average  of 17, 88, and 157 is " +avg);
	

		/*
			This is a post section project and will be graded for accuracy. 
			Output should match sample output exactly other than comments and numbers
				which the user will input
		
			Write an application that takes two whole number points from the user, 
				x and y coordinates, and calculates the distance between them

			Store the 3 values written on the board into int variables called v1,v2,v3

			calculate and store the sum of those three values in an int variable called sum1

			calculate and store the average of the values v1, v2 and v3 into a double variable called avg

			output the values with their sum and average
			
			
			Sample output: numbers after prompt will be input by the end user
			{
			
			Please enter the x value of point 1:		2
			Please enter the y value of point 1:		2
			Please enter the x value of point 2:		3
			Please enter the y value of point 2:		3
			
			The distance between (2,2) and (3,3) is 1.414214


			Variable v1:	15 	//15 will be replaced with the 1st value on the board
			Variable v2:	85 	//85 will be replaced with the 2nd value on the board
			Variable v3:	154	//154 will be replaced with the 3rd value on the board

			15 + 85 + 154 = 254	//again these values will be replaced with the values on the board and the sum will reflect those values

			The average of 15, 85 and 154 is	84.66666666666667	//same as the above comment for the average

			}
			end sample output:

		*/	
	}
}