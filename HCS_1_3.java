package section1;

public class HCS_1_3
{
	public static void main(String[] args) {
		int val = 421;
		System.out.println("val: "+val);
		
		int valdigit1 = 421;
		valdigit1 /= 100;
		System.out.println("first digit of val: "+valdigit1);
		
		int valdigit2 = 421;
		valdigit2 /= 10;
		valdigit2 %= 10;
		System.out.println("middle digit of val: "+valdigit2);
		
		int valdigit3 = 421;
		valdigit3 %= 10;
		System.out.println("last digit of val: "+valdigit3);
		
		int valReversed = ((valdigit1) + (valdigit2 * 10) + (valdigit3 * 100));
		System.out.println("valReversed: "+valReversed);
		
		
		
		
//	
//		int valdigit2 = 241;
//		valdigit2 /= 10;
//		System.out.println("first two digits of val: "+valdigit2);
//		
//		valdigit1 *= 100;
//		
//		int valReversed = valdigit1 + valdigit2;
//		System.out.println("valReversed: "+valReversed);
//		
////	
		
		//create an int variable called val and store a randomly generated whole number in it in the range from 100 - 999, this means it will be exactly 3 digits long
		
		//print out val
		
		//create a second int variable  cal valReversed.  Using math calculations take the value of val then reverse it and store it into valReversed.
		
		//print out valReversed
		
		/*
			Hints:	Isolate the last digit of any base 10 number by doing % which is a remainder
				Whole number division will result in the part after the decimal being discarded, again think base 10.
				think mathematically before you think java syntax

			-Begin Sample Output:-

			Randomly generated number:  146
			Generated number in reverse:  641

			-End Sample Output-
		*/
	}
}
