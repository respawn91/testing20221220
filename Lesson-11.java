
// Exception
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = 10;
      int b = 5;
      
      int c = a / b;
      System.out.println(c);
      
      int x = 10;
      int y = 0;
      
      int z = x / y;
      System.out.println(z);
      
  }
}

// Exception
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int[] array = new int[5];
      
      array[0] = 10;
      array[2] = 7;
      array[5] = 6;
      
  }
}

// Exception
import java.util.*;

public class Main {
  public static void main(String[] args) {
      
      int a = 10;
 

      int x = 10;
      int y = 0;
      
      try {
        System.out.
  }
      catch(Exception e) {
        System.out.println("Делить на ноль нельзя!!!");
      }
      
      System.out.println("Продолжаю работу...");
  }
}

// Exception
import java.util.*;

public class Main {
    
    public static int division(int a, int b) throws ArithmeticException {
      
      try {
        int c = a / b;
        return c;
      }
      catch(ArithmeticException e) {
        e.printStackTrace();
        throw new ArithmeticException("Делить на ноль нельзя!!!");
      }
    }
    
    public static void main(String[] args) {
      
      int a = 10;
      int b = 5;
      System.out.println(division(a, b));
      
      int x = 10;
      int y = 0;
      System.out.println(division(x, y));
      
      System.out.println(division(15, 3));
  }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int[] array = new int[5];
      
      try {
        array[0] = 4;
        array[5] = 7;
        array[4] = 5 / 0;
      }
      catch(ArrayIndexOutOfBoundsException ai) {
        System.out.println("ArrayIndexOutOfBoundsException!!!");
      }
      catch(ArithmeticException ae) {
        System.out.println("ArithmeticException!!!");
      }
      catch(Exception e) {
        System.out.println("Exception!!!");
      }
      
      
  }
}

// Stack Trace
import java.util.*;

public class Main {

  public static void method1() {
    method2();
  }

  public static void method2() {
    method3();
  }

  public static void method3() {

    try {
      System.out.println(10 / 0);
    } catch (ArithmeticException ex) {
      ex.printStackTrace();
    } finally {
      method4();
    }
  }

  public static void method4() {
    method5();
  }

  public static void method5() {
    System.out.println("Done!");
  }

  public static void main(String[] args) {

    method1();
  }
}

// Unit-tests
// https://codeboard.io/projects/372476
// https://codeboard.io/projects/372479
