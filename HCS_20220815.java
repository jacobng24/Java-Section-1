package section1;

public class HCS_20220815 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
byte	1 byte	Stores whole numbers from -128 to 127
short	2 bytes	Stores whole numbers from -32,768 to 32,767
int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean	1 bit	Stores true or false values
char 	2 bytes 	Stores a single character/letter or ASCII values (Links to an external site.)

		 */
		
		byte var1 = 3;
		System.out.println("var1: "+var1);
		short var2 = 256;
		System.out.println("var2: "+var2);
		int var3 = 233333333; 
		System.out.println("var3: "+var3);
		
		double var4 = 3.2;
		System.out.println("var4: "+var4);
		
		float var5 = 3.2f;
		System.out.println("var5: "+var5);
		
		boolean flag = true;
		flag = false;
		System.out.println("flag: "+flag);
		
		char var6 = '9';
		System.out.println("var6: "+var6);
		
		int val1 = 10;
		int val2 = 5;
		int sum = val1 + val2;
		System.out.println(val1+" + "+val2+" = "+sum);
		System.out.println(val1+" + "+val2+" = "+val1+val2 + "-----");
		System.out.println(val1+" + "+val2+" = "+(val1+val2) + "-----");
		int result = val1 - val2;
		System.out.println(val2+" - "+val1+" = "+result);
		int product = val1 * val2;
		System.out.println(val1+" * "+val2+" = "+product);
		
		double val3 = 2.0;
		
		double val4 = val1 * val2;
		
		
		double average = (val1 + val2) / 2.0;
		System.out.println("the average of "+val1+" and "+val2+": "+average);
	}

}
