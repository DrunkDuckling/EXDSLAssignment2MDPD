import java.lang.Math; 

public class MathComputation {
	
	public static void main(String[] args) {
		// Generated prints from Xtext

	System.out.println("Math is: " + "5+3*10" + " - result is: " + 5+3*10);

	System.out.println("Math is: " + "400" + " result is: " + 400);

	int x = 3;
	System.out.println("x" + " Defined as: " + "3");
	System.out.println("Result of: " +  "x+2*3" + " is: " + (x+2*3));

	int y = 2;
	int z = 3;
	System.out.println("y" + " Defined as: " + "2");
	System.out.println("z" + " Defined as: " + "3");
	System.out.println("Result of: " +  "y+z" + " is: " + (y+z));

	int b = 2;
	int h = 3;
	int g = 3;
	System.out.println("b" + " Defined as: " + "2");
	System.out.println("h" + " Defined as: " + "3");
	System.out.println("g" + " Defined as: " + "3");
	System.out.println("Result of: " +  "b*g+h/3" + " is: " + (b*g+h/3));

	int q = 10/2;
	int w = 3-2;
	int e = 4+4;
	System.out.println("q" + " Defined as: " + "10/2");
	System.out.println("w" + " Defined as: " + "3-2");
	System.out.println("e" + " Defined as: " + "4+4");
	System.out.println("Result of: " +  "q*w+e/2" + " is: " + (q*w+e/2));

	int helloWorld = 42;
	System.out.println("helloWorld: " + "is " +  helloWorld);

	int MyFairLady = 20;
	System.out.println("MyFairLady: " + "is " +  MyFairLady);
		    	    
      	// BEGIN: external functions only
      	// System.out.println("external example " + (externals.power(2, 6)));
      	// END: external functions only
    }
			    
    // BEGIN: required for external functions
    public static interface Externals {
    	public int power(int base, int exponent);
    }
    private static Externals externals;

    public MathComputation(Externals _externals) {
    	externals = _externals;
    }
    // END: required for external functions
    
    public void compute() {
    }
  }
