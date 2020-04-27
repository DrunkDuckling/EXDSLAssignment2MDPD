
import java.lang.Math; 

public class MathComputation {
    // BEGIN: required for external functions
    public static interface Externals {
      public int power(int base, int exponent);
    }
    private static Externals externals;

    public MathComputation(final Externals _externals) {
      externals = _externals;
    }
    // END: required for external functions

    public static void main(final String[] args) {
      int y = 3;
      System.out.println("y" + " Defined as: " + y);
      System.out.println("in" + "x+10" + "Result: " + 13);
      System.out.println("Math is: " + "3+3*10" + " - result is: " + 33);
      System.out.println("Math is: " + "40" + " - result is: " + 40);
      int x = 32;
      System.out.println("x" + " Defined as: " + x);
      System.out.println("in" + "x+4*50" + "Result: " + 232);
      int hej = 2000;
      System.out.println("hej: " + "is " +  hej);

      // BEGIN: external functions only
      // System.out.println("external example " + (externals.power(2, 6)));
      // END: external functions only
    }

    public void compute() {
      
    }
  }