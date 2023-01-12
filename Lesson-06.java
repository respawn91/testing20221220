// Максимум из двух чисел

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = 50;
      int b = 130;
      
      if(a > b) 
        System.out.println(a);
      else 
        System.out.println(b);
        
      int c = -50;
      int d = -30;
      
      if(c > d) 
        System.out.println(c);
      else 
        System.out.println(d);
  }
}

// Максимум из двух чисел

import java.util.*;

public class Main {
    
    public static int maximum(int number1, int number2) {
      
      int max;
      
      if(number1 > number2)
        max = number1;
      else
        max = number2;
      
      return max;
    }
    
    public static void printMaxElement(int a, int b) {
      
      if(a > b)
        System.out.println("Первое число больше");
      else
        if(a < b)
          System.out.println("Второе число больше");
        else
          System.out.println("Числа равны");
    }
    
    public static void main(String[] args) {
      
      int a = 50;
      int b = 130;
      
      int max1 = maximum(a, b);
      System.out.println(max1);
      
      int c = -50;
      int d = -30;
      
      int max2 = maximum(c, d);
      System.out.println(max2);
      
      int x = 50;
      int y = 30;
      int z = 50;
      
      printMaxElement(x,y);
      printMaxElement(y,z);
      printMaxElement(x,z);
  }
}

// Task 6-1
/*
 * Напечатать числа в виде следующей таблицы:
 * 5 5 5 5 5 5
 * 5 5 5 5 5 5
 * 5 5 5 5 5 5
 * 5 5 5 5 5 5
 */

import java.util.*;

public class Main {
    
    public static void print1() {
      for(int i = 0; i < 4; i++) {
        System.out.println("5 5 5 5 5 5");
      }
    }
    
    public static void print2(int number, int rows, int columns) {
      
      for(int i = 0; i < rows; i++) {
        for(int j = 0; j < columns; j++) {
          System.out.print(number + " ");
        }
        System.out.println();
      }
    }
    
    public static void main(String[] args) {
      
      // print1();
      
      print2(7, 10, 3);
    
  }
}

// Task 6-3

import java.util.*;

public class Main {
    
    public static void printElement(int a, int b) {
      
      System.out.printf("%d + %d = %d\t", a, b, a + b);
    }
    
    public static void printRow(int n) {
      
      for(int i = 1; i <= 9; i++) {
        printElement(n, i);
      }
      System.out.println();
    }
    
    public static void printTable() {
      
      for(int i = 1; i <= 9; i++) {
        printRow(i);
      }
    }
    
    
    public static void main(String[] args) {
      
      printTable();
  }
}

// Task 6-4

import java.util.*;

public class Main {
    
    public static void printFibonacciClassic(int n) {
      
      int f1 = 1;
      int f2 = 1;
      
      if(n <= 0) {
        System.out.println("Последовательности не существует!!!");
      }
      
      if(n == 1) {
        System.out.print("1 ");
      }
      
      if(n >= 2) {
        System.out.print("1 1 ");
      }
      
      for(int i = 3; i <= n; i++) {
        
        int fk = f1 + f2;
        System.out.print(fk + " ");
        f1 = f2;
        f2 = fk;
      }
      
      System.out.println();
    }
    
    public static int findFibonacciRecursion(int n) {
      
      if((n == 1) || (n == 2))
        return 1;
      else
        return findFibonacciRecursion(n - 1) + findFibonacciRecursion(n - 2);
    }
    
    public static void printFibonacciRecursion(int n) {
      for(int i = 1; i <= n; i++) {
        System.out.print(findFibonacciRecursion(i) + " ");
      }
      System.out.println();
    }
    
    
    public static void main(String[] args) {
      
      printFibonacciClassic(13);
      printFibonacciRecursion(13);
  }
}

// Task 6-5
import java.util.*;

public class Main {
  
    public static long factorialClassic(int n) {
      
      if(n == 1)
        return 1;
      else {
        
        long result = 1;
        
        for(int i = 1; i <= n; i++) {
          result = result * i;  
        }
        
        return result;
      }
      
    }
    
    public static long factorialRecursion(int n) {
      
      if (n == 1) 
        return 1;
      else
        return n * factorialRecursion(n - 1);
      
    }
    
    public static void main(String[] args) {
      
      System.out.println(factorialClassic(5));
      System.out.println(factorialClassic(7));
      System.out.println(factorialClassic(15));
      
      System.out.println(factorialRecursion(5));
      System.out.println(factorialRecursion(7));
      System.out.println(factorialRecursion(15));
  }
}

// Task 6-6
import java.util.*;

public class Main {
    
    public static int maxOfTwo(int a, int b) {
      
      if(a > b)
        return a;
      else
        return b;
    }
    
    public static int maxOfThree(int a, int b, int c) {
      
      return maxOfTwo(a, maxOfTwo(b,c));
    }
    
    public static int maxOfFour(int a, int b, int c, int d) {
      
      return maxOfTwo(maxOfTwo(a, b), maxOfTwo(c,d));
    }
    
    public static void main(String[] args) {
      
      System.out.println(maxOfTwo(3, 7));                 // 7
      System.out.println(maxOfTwo(-3, -7));               // -3
      System.out.println(maxOfTwo(0, 15));                // 15
      System.out.println(maxOfThree(3, 7, 10));           // 10
      System.out.println(maxOfThree(-3, -7, -10));        // -3      
      System.out.println(maxOfThree(3, 3, 3));            // 3 
      System.out.println(maxOfFour(3, 6, 7, 15));         // 15
      System.out.println(maxOfFour(-3, -6, -7, -15));     // -3
      System.out.println(maxOfFour(6, 6, 6, 6));          // 6
  }
}

// Task 6-6
import java.util.*;

public class Main {

    // max(int, int)
    public static int max(int a, int b) {

        if (a > b)
            return a;
        else
            return b;
    }

    // max(double, double)
    public static double max(double a, double b) {

        if (a > b)
            return a;
        else
            return b;
    }

    // max(int, int, int)
    public static int max(int a, int b, int c) {

        return max(a, max(b, c));
    }

    // max(int, int, int, int)
    public static int max(int a, int b, int c, int d) {

        return max(max(a, b), max(c, d));
    }

    public static void main(String[] args) {

        System.out.println(max(3, 7)); // 7
        System.out.println(max(-3, -7)); // -3
        System.out.println(max(0, 15)); // 15
        System.out.println(max(3, 7, 10)); // 10
        System.out.println(max(-3, -7, -10)); // -3
        System.out.println(max(3, 3, 3)); // 3
        System.out.println(max(3, 6, 7, 15)); // 15
        System.out.println(max(-3, -6, -7, -15)); // -3
        System.out.println(max(6, 6, 6, 6)); // 6
        // max(double, double)
        System.out.println(max(3.0, 7.0));
    }
}

// Task 6-7
/*
 * Даны стороны двух треугольников.
 * Найти сумму их периметров и сумму их площадей
 */

import java.util.*;

public class Main {

    public static double perimetr(double a, double b, double c) {

        if (isTriangle(a, b, c) == true)
            return a + b + c;
        else
            return 0;
    }

    public static double square(double a, double b, double c) {

        if (isTriangle(a, b, c) == true) {
            double p = perimetr(a, b, c) / 2;

            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        } else
            return 0;

    }

    public static boolean isTriangle(double a, double b, double c) {

        if ((a + b > c) && (a + c > b) && (b + c > a) && (a > 0) && (b > 0) && (c > 0))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        double a = -3;
        double b = -4;
        double c = 7;

        System.out.println(perimetr(a, b, c));
        System.out.println(square(a, b, c));
    }
}
