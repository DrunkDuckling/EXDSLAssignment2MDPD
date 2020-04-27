import java.lang.Math; 

public class MathComputation {
    // BEGIN: required for external functions
    public static interface Externals {
    	public int power(int base, int exponent);
    }
    private static Externals externals;

    public MathComputation(Externals _externals) {
    	externals = _externals;
    }
    // END: required for external functions

    public static void main(String[] args) {
    	

	System.out.println("Math is: " + "5+3*10" + " - result is: " + 35);

	System.out.println("Math is: " + "400" + " - result is: " + 400);

	int x = 3;
	System.out.println("x" + " Defined as: " + "3");
	System.out.println("Result of: " +  "x+2*3" + " is: " + 9);

	int y = 2;
	int z = 3;
	System.out.println("y" + " Defined as: " + "2");
	System.out.println("z" + " Defined as: " + "3");
	System.out.println("Result of: " +  "y+z" + " is: " + 5);

	int helloWorld = 42;
	System.out.println("helloWorld: " + "is " +  42);
      	// BEGIN: external functions only
      	// System.out.println("external example " + (externals.power(2, 6)));
      	// END: external functions only
    }

    public void compute() {
      
    }
  }