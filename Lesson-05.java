// Цикл FOR

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Начало");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("Конец");
    }
}

// Цикл FOR

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      System.out.println("Начало");
      
      for(int i = -5; i > -15; i--) {
        System.out.println(i);
      }
      
      System.out.println("Конец");
  }
}

// Цикл FOR

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      System.out.println("Начало");
      
      for(int i = 1; i <= 100; i = i * 2) {
        System.out.println(i);
      }
      
      System.out.println("Конец");
  }
}

// Task 5-1

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      for(int i = 0; i <= 9; i++) {
        System.out.print("20 ");
      }
  }
}

// Task 5-2

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      for(int i = 10; i <= 25; i++) {
        System.out.printf("%d %d.4\n", i, i);
      }
  }
}

// Task 5-4
// Найти сумму всех целых чисел от 100 до 500;

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int sum = 0;
      
      for(int i = 100; i <= 500; i++) {
        System.out.println("sum before = " + sum);
        System.out.println("i = " + i);
        sum = sum + i;
        System.out.println("sum after = " + sum);
        System.out.println("= = = = = = = = = = = = = =");
      }
      
      System.out.println("sum = " + sum);
  }
}

// Task 5-5
/*
 * Даны натуральное число n и вещественные числа a1, a2, ..., an.
 * Определить среднее арифметическое вещественных чисел
 */

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
      int n = 8;
      
      Scanner sc = new Scanner(System.in);
      
      double sum = 0;
      
      for(int i = 0; i < n; i++) {
        double temp = sc.nextDouble();
        sum = sum + temp;
        //System.out.print(temp + " ");
      }
      
      System.out.println("Sum = " + sum);
      
      double average = sum / n;
      
      System.out.println("Average = " + average);
  }
}

// Цикл WHILE

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int i = 0;
      
      System.out.println("WHILE");
      while(i < 10) {
        System.out.print(i + " ");
        i++;
      }
      
      System.out.println();
      
      System.out.println("FOR");
      for(int j = 0; j < 10; j++) {
        System.out.print(j + " ");
      }
  }
}

// Цикл DO WHILE

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int i = 0;
      
      System.out.println("DO WHILE");
      
      do {
        System.out.print(i + " ");
        i++;
      }
      while(i < 10);
      
  }
}

// DO WHILE VS WHILE

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("WHILE");

        int i = 15;

        while (i < 10) {
            System.out.println(i);
            i++;
        }

        System.out.println("DO WHILE");

        int j = 15;

        do {
            System.out.println(j);
            j++;
        } while (j < 10);
    }
}

// Task 5-7
/*
 * Дана непустая последовательность целых чисел, оканчивающаяся нулем.
 * Найти:
 * - сумму всех чисел последовательности;
 * - количество всех чисел последовательности
 */

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      int sum = 0;
      int counter = 0;
      
      int temp = sc.nextInt();
      
      while(temp != 0) {
        sum = sum + temp;
        counter++;
        temp = sc.nextInt();
      }
      
      System.out.println("sum = " + sum);
      System.out.println("count = " + counter);
  }
}

// Task 5-8

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
    
      int number = sc.nextInt();
      System.out.println("Число " + number);
      int countOfThree = 0;
      int countOfEven = 0;
      
      while(number != 0) {
        int lastDigit = number % 10;
        
        if(lastDigit == 3) {
          countOfThree++;
        }
        
        if(lastDigit % 2 == 0) {
          countOfEven++;
        }
        
        number = number / 10;
      }
      
      System.out.println("Количество цифр 3 в числе равно " + countOfThree);
      System.out.println("Количество четных цифр в числе равно " + countOfEven);
      
  }
}

// Task 5-10

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
    
      int number = sc.nextInt();
      
      int max = 0;
      
      while(number != 0) {
        int lastDigit = number % 10;
        
        System.out.print(lastDigit + " ");
        
        if(lastDigit > max) {
          max = lastDigit;
        }
        
        if(max == 9) {
          break;
        }
    
        number = number / 10;
      }
      
      System.out.println();
      System.out.println(max);
      
  }
}

// Task 5-10

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
    
      int number = sc.nextInt();
      
      int max = 0;
      
      while(number != 0) {
        int lastDigit = number % 10;
        
        System.out.print(lastDigit + " ");
        
        if(lastDigit > max) {
          max = lastDigit;
        }
        
        if(max == 9) {
          break;
        }
    
        number = number / 10;
      }
      
      System.out.println();
      System.out.println(max);
      
  }
}

// Task 5-11

import java.util.*;

public class Main {
    public static void main(String[] args) {

        for (int i = 5000; i > 0; i--) {
            if (i % 39 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
