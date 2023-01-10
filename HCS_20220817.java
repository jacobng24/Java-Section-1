package section1;

public class HCS_20220817 {

	public static void main(String[] args) {
		int x = 5;
		System.out.println("x:\t"+x);
	
	    System.out.println(x + 3);
	    System.out.println("x:\t"+x);
	    
	    x = x + 3;
	    System.out.println("x:\t"+x);
	    
	    x = x - 2;
	    System.out.println("x:\t"+x);
	    
	    x = x * 8;
	    System.out.println("x:\t"+x);
	    
	    x = x / 6;
	    System.out.println("x:\t"+x);
	    
	    x = x % 3;
	    System.out.println("x:\t"+x);
	    
	    //////////////////////////////////////
	    System.out.println("----------");
	    x = 5;
	    //x = x + 3;
	    x += 3;
	    System.out.println("x:\t"+x);
	    
	    //x = x - 2;
	    x -= 2;
	    System.out.println("x:\t"+x);
	    
	    //x = x * 8;
	    x *= 8;
	    System.out.println("x:\t"+x);
	    
	    //x = x / 6;
	    x/= 6;
	    System.out.println("x:\t"+x);
	    
	    //x = x % 3;
	    x %= 3;
	    System.out.println("x:\t"+x);
	    
	    x++;
	    System.out.println("x:\t"+x);
	    
	    ++x;
	    System.out.println("x:\t"+x);
	    
	    x--;
	    System.out.println("x:\t"+x);
	    
	    int y = 578;
	    System.out.println("last digit of "+y+" is "+(578 % 10));
	    
	    y = y / 10;
	    System.out.println("y:\t"+y);
	    y = 578;
	    System.out.println("y / 10 = \t"+ ((double) y / 10));
	}

}
