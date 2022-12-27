// Объявление переменных

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      /*
      продам
      гараж
      */
      
      int a = 30;
      int b = 7;
      
      int result1 = a + b;          
      System.out.println(result1);    // 37
      
      int result2 = a - b;
      System.out.println(result2);    // 23
      
      int result3 = a * b;
      System.out.println(result3);    // 210
      
      int result4 = a / b;
      System.out.println(result4);    // 4
      
      int result5 = a % b;
      System.out.println(result5);    // 2
  }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = 30;
      int b = 7;
      
      a++;
      System.out.println(a);    // 31
      a = a + 1;
      System.out.println(a);    // 32
      a += 1;
      System.out.println(a);    // 33
      
      b--;
      System.out.println(b);    // 6
  }
}

// Приведение типов данных
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = 20;
      int b = 8;
      
      int result1 = a / b;
      System.out.println(result1);
      
      double result2 = a / b;
      System.out.println(result2);
      
      double c = 20;
      double d = 8;
      
      double result3 = c / d;
      System.out.println(result3);
      
      double result4 = a / d;
      System.out.println(result4);
  }
}

// Приведение типов данных
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      System.out.println(50/20);
      System.out.println(50.0/20);
      
  }
}

// Приведение типов данных
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = 20;
      
      System.out.println(a);
      System.out.println((double)a);
  }
}

// Приведение типов данных
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      byte b1 = 127;
      System.out.println(b1);
      
      int i1 = (int)b1;
      System.out.println(i1);
      
      int i2 = 150;
      System.out.println(i2);
      
      byte b2 = (byte)i2;
      System.out.println(b2);
      
  }
}


// Приведение типов данных
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = 10;
      int b = 20;
      int c = 30;
      
      int result1 = a + b * c;
      int result2 = (a + b) * c;
      
      System.out.println(result1); // 610
      System.out.println(result2); // 900
      
  }
}

// Приоритет операций
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = 10;
      int b = 20;
      int c = 30;
      
      int result1 = a + b * c;
      int result2 = (a + b) * c;
      
      System.out.println(result1); // 610
      System.out.println(result2); // 900
      
  }
}