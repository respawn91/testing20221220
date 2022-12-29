// Работа с библиотекой Math

import java.util.*;

public class Main {
  
    public static void main(String[] args) {
      
      double pi = Math.PI;
      System.out.println(pi);
      
      double result1 = Math.cos(0);
      System.out.println(result1);
      
      double result2 = Math.pow(3, 4);
      System.out.println(result2);
      
      double result3;
      result3 = Math.sqrt(95);
      System.out.println(result3);
      
      System.out.println(Math.log10(100));
      
      System.out.println(Math.log(Math.E));
      
  }
}

// Task 4-1

import java.util.*;

public class Main {
  
    public static void main(String[] args) {
      
      double radius = 4;
      
      double C = 2 * Math.PI * radius;
      
      System.out.println(C);
  }
}


// Task 4-3
/*
Дано трехзначное число. Найти:
- число единиц в нем;
- число десятков в нем;
- сумму его цифр;
- произведение его цифр.
*/

import java.util.*;

public class Main {
  
    public static void main(String[] args) {
      
      int number = 173;
      
      int e = number % 10;
      int d = number / 10 % 10;
      int s = number / 100;
      
      // System.out.println(number + " = " + s + " x 100 + " + d + " x 10 + " + e);
      System.out.printf("%d = %d x 100 + %d x 10 + %d\n", number, s, d, e);
      
      System.out.println("Сумма цифр числа " + number + " равна " + (s + e + d));
      System.out.println("Произведение цифр числа " + number + " равно " + (s * e * d));
  }
}


// Печать
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = 10;
      System.out.println(a);
      
      System.out.println(10);
      System.out.println("10");
      
      System.out.println("Продам гараж.  Срочно.");
      
      String str = "Test";
      System.out.println(str);
      System.out.println(str + " Test!!!");
      
      int x = 20;
      int y = 30;
      
      System.out.println(x + y);
      
      System.out.println(str + x);
      
      System.out.println(str + x + y);
      
      System.out.println(str + (x + y));
  }
}


// Операция сравнения
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int x = 30;
      int y = 20;
      int z = 30;
      
      // x равен y ?
      System.out.println(x == y); // false
      
      System.out.println(x > z);  // false
      System.out.println(x >= z); // true
      
      System.out.println(x < z);  // false
      System.out.println(x <= z); // true
      
      System.out.println(y != z); // true
  }
}


import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int x = 30;
      int y = 20;
      int z = 30;
      
      boolean result1 = x == y;
      boolean result2 = x > z;
      boolean result3 = x >= z;
      boolean result4 = x < z;
      boolean result5 = x <= z;
      boolean result6 = y != z;
      
      System.out.println(result1);
      System.out.println(result2);
      System.out.println(result3);
      System.out.println(result4);
      System.out.println(result5);
      System.out.println(result6);
  }
}


// && и ||

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int salary1 = 50000;
      int salary2 = 20000;
      
      // Кредит выдается паре при зарплатах больше 30000 у обоих
      boolean result1 = ((salary1 > 30000) && (salary2 > 30000));
      System.out.println(result1);
      
      // Кредит выдается паре при зарплате больше 30000 хотя бы у одного
      
      boolean result2 = ((salary1 > 30000) || (salary2 > 30000));
      System.out.println(result2);
  }
}


// Task 4-5

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int number = 2353;
      
      boolean isEven = (number % 2 == 0);
      boolean isEndedBySeven = (number % 10 == 7);
      
      System.out.println("Оканчивается ли на 7? " + isEndedBySeven);
      System.out.println("Четно ли число? " + isEven);
  }
}


// if

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      // Если число больше 100, вывести его на экран
      int number = 213;
      
      if(number > 100) 
      {
        System.out.println("Число больше 100!");
        System.out.println(number);
      }
  }
}


// if-else

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      // Если число больше или равно 100, вывести его на экран
      // Если число меньше 100, вывести об этом информацию
      int number = 13;
      
      if(number >= 100)
      {
        System.out.println(number);
      }
      else 
      {
        System.out.println("Число меньше 100!");
      }
  }
}


// Task 4-6
/*
Составить программу, которая уменьшает первое введенное число в два раза, 
если оно больше второго введенного числа по абсолютной величине.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = -50;
      int b = -30;
      
      System.out.printf("a = %d, b = %d\n", a, b);
      
      System.out.println("Думаю...");
      
      if(Math.abs(a) > Math.abs(b)) 
      {
        a = a / 2;
      }
      
      System.out.printf("a = %d, b = %d\n", a, b);
  }
}


// Task 4-7
/*
Известен вес боксера-любителя. Известно, что вес таков, что боксер может быть отнесен к одной из трех весовых категорий: 
- легкий вес — до 60 кг; 
- средний вес — до 75 кг; 
- тяжелый вес — до 91 кг;
- супертяжелый вес – с 91 кг.
Определить, в какой категории будет выступать данный боксер.

*/

import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int w = sc.nextInt();
    
      if(w <= 0) {
        System.out.println("Неправильный вес!");
      }
      else if(w < 60) {
            System.out.println("Легкий вес!");
            }
            else if(w < 75) {
                System.out.println("Средний вес!");
                }
                else if(w < 91) {
                    System.out.println("Тяжелый вес!");
                    }
                    else {
                    System.out.println("Супертяжелый вес!");
                  }
  }
}

// Task 4-7
/*
Известен вес боксера-любителя. Известно, что вес таков, что боксер может быть отнесен к одной из трех весовых категорий: 
- легкий вес — до 60 кг; 
- средний вес — до 75 кг; 
- тяжелый вес — до 91 кг;
- супертяжелый вес – с 91 кг.
Определить, в какой категории будет выступать данный боксер.

*/

import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int w = sc.nextInt();
    
      if(w <= 0) 
      {
        System.out.println("Неправильный вес!");
      }
      else
          if(w < 60)
          {
            System.out.println("Легкий вес!");
          }
          else
              if(w < 75)
              {
                System.out.println("Средний вес!");
              }
              else
                  if(w < 91)
                  {
                    System.out.println("Тяжелый вес!");
                  }
                  else
                  {
                    System.out.println("Супертяжелый вес!");
                  }
  }
}


// Task 4-8

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int day = sc.nextInt();
      
      switch(day)
      {
        // day = 1
        case 1:
          System.out.println("Monday");
          break;
        case 2:
          System.out.println("Tuesday");
          break;
        case 3:
          System.out.println("Wednesday");
          break;
        case 4:
          System.out.println("Thursday");
          break;
        case 5:
          System.out.println("Friday");
          break;
        case 6:
          System.out.println("Saturday");
          break;
        case 7:
          System.out.println("Sunday");
          break;
          
        default:
          System.out.println("Incorrect day!!!");
      }
  }
}