
// Массивы
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int[] array1 = new int[5];
      array1[0] = 3;
      array1[4] = 5;
      
      for(int i = 0; i < 5; i++) {
        System.out.print(array1[i] + " ");
      }
      
      System.out.println();
      
      String[] array2 = new String[3];
      array2[0] = "Anton";
      array2[2] = "Kate";
      
      for(int i = 0; i < 3; i++) {
        System.out.print(array2[i] + " ");
      }
      
      System.out.println();
  }
}

// Массивы
import java.util.*;

public class Main {
    
    public static void printArray(int[] array) {
      
      for(int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
      }
      
      System.out.println();
    }
    
    public static void main(String[] args) {
      
      int[] array1 = new int[5];
      array1[0] = 3;
      array1[4] = 5;
      
      printArray(array1);
      
      int[] array2 = {2, 4, 5, 7, 8, 12, 24, 8};
      printArray(array2);
  }
}

// Task 9-1
import java.util.*;
import java.util.Scanner;

public class Main {
    
    public static void printArray(int[] array) {
      
      for(int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
      }
      
      System.out.println();
    }
    
    public static int[] scanArray(int n) {
      
      Scanner sc = new Scanner(System.in);
      
      int[] array = new int[n];
      
      for(int i = 0; i < array.length; i++) {
        array[i] = sc.nextInt();
      }
      
      return array;
    }
    
    public static void main(String[] args) {
      
      int[] array = scanArray(7);
      
      printArray(array);
  
  }
}

// Task 9-2
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    
    public static void printArray(int[] array) {
      
      for(int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
      }
      
      System.out.println();
    }
    
    public static int[] scanArray(int n) {
      
      Scanner sc = new Scanner(System.in);
      
      int[] array = new int[n];
      
      for(int i = 0; i < array.length; i++) {
        array[i] = sc.nextInt();
      }
      
      return array;
    }
    
    public static int[] generateArray(int n) {
      
      Random r = new Random();
      
      int[] array = new int[n];
      
      for(int i = 0; i < array.length; i++) {
        array[i] = r.nextInt(100);
      }
      
      return array;
    }
    
    public static void main(String[] args) {
      
      int[] array = generateArray(10);
      
      printArray(array);
  
  }
}

// Task 9-4
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    
    public static void printArray(int[] array) {
      
      for(int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
      }
      
      System.out.println();
    }
    
    public static int[] scanArray(int n) {
      
      Scanner sc = new Scanner(System.in);
      
      int[] array = new int[n];
      
      for(int i = 0; i < array.length; i++) {
        array[i] = sc.nextInt();
      }
      
      return array;
    }
    
    public static int[] generateArray(int n) {
      
      Random r = new Random();
      
      int[] array = new int[n];
      
      for(int i = 0; i < array.length; i++) {
        array[i] = r.nextInt(100);
      }
      
      return array;
    }
    
    public static int[] multiplyByNumber(int[] array, int number) {
      
      System.out.println("Умножаем элементы массива на " + number);
      
      for(int i = 0; i < array.length; i++) {
        array[i] = array[i] * number;
      }
      
      return array;
    }
    
    public static int[] decreaseByNumber(int[] array, int number) {
      
      System.out.println("Вычитаем из элементов массива " + number);
      
      for(int i = 0; i < array.length; i++) {
        array[i] = array[i] - number;
      }
      
      return array;
    }
    
    public static int[] divideByFirstElement(int[] array) {
      
      System.out.println("Делим на первый элемент");
      
      int temp = array[0];
      
      for(int i = 0; i < array.length; i++) {
        array[i] = array[i] / temp;
      }
      
      return array;
    }
    
    public static void main(String[] args) {
      
      int[] array = generateArray(10);
      printArray(array);
      
      multiplyByNumber(array, 2);
      printArray(array);
      
      decreaseByNumber(array, 12);
      printArray(array);
      
      divideByFirstElement(array);
      printArray(array);
  }
}

// Task 9-5
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    
    public static void printArray(int[] array) {
      
      for(int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
      }
      
      System.out.println();
    }
    
    public static int[] scanArray(int n) {
      
      Scanner sc = new Scanner(System.in);
      
      int[] array = new int[n];
      
      for(int i = 0; i < array.length; i++) {
        array[i] = sc.nextInt();
      }
      
      return array;
    }
    
    public static int[] generateArray(int n) {
      
      Random r = new Random();
      
      int[] array = new int[n];
      
      for(int i = 0; i < array.length; i++) {
        array[i] = r.nextInt(100);
      }
      
      return array;
    }
    
    public static int[] multiplyByNumber(int[] array, int number) {
      
      System.out.println("Умножаем элементы массива на " + number);
      
      for(int i = 0; i < array.length; i++) {
        array[i] = array[i] * number;
      }
      
      return array;
    }
    
    public static int[] decreaseByNumber(int[] array, int number) {
      
      System.out.println("Вычитаем из элементов массива " + number);
      
      for(int i = 0; i < array.length; i++) {
        array[i] = array[i] - number;
      }
      
      return array;
    }
    
    public static int[] divideByFirstElement(int[] array) {
      
      System.out.println("Делим на первый элемент");
      
      int temp = array[0];
      
      for(int i = 0; i < array.length; i++) {
        array[i] = array[i] / temp;
      }
      
      return array;
    }
    
    public static void printNonNegativeElements(int[] array) {
      
      for(int i = 0; i < array.length; i++) {
        if(array[i] >= 0) {
          System.out.print(array[i] + " ");
        }
      }
      
      System.out.println();
      
    }
    
    public static void main(String[] args) {
      
      int[] array = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10};
      printArray(array);
      printNonNegativeElements(array);
  }
}

// Task 9-6
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    
    public static void printArray(int[] array) {
      
      for(int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
      }
      
      System.out.println();
    }
    
    public static int[] scanArray(int n) {
      
      Scanner sc = new Scanner(System.in);
      
      int[] array = new int[n];
      
      for(int i = 0; i < array.length; i++) {
        array[i] = sc.nextInt();
      }
      
      return array;
    }
    
    public static int[] generateArray(int n) {
      
      Random r = new Random();
      
      int[] array = new int[n];
      
      for(int i = 0; i < array.length; i++) {
        array[i] = r.nextInt(100);
      }
      
      return array;
    }
    
    public static int[] multiplyByNumber(int[] array, int number) {
      
      System.out.println("Умножаем элементы массива на " + number);
      
      for(int i = 0; i < array.length; i++) {
        array[i] = array[i] * number;
      }
      
      return array;
    }
    
    public static int[] decreaseByNumber(int[] array, int number) {
      
      System.out.println("Вычитаем из элементов массива " + number);
      
      for(int i = 0; i < array.length; i++) {
        array[i] = array[i] - number;
      }
      
      return array;
    }
    
    public static int[] divideByFirstElement(int[] array) {
      
      System.out.println("Делим на первый элемент");
      
      int temp = array[0];
      
      for(int i = 0; i < array.length; i++) {
        array[i] = array[i] / temp;
      }
      
      return array;
    }
    
    public static void printNonNegativeElements(int[] array) {
      
      for(int i = 0; i < array.length; i++) {
        if(array[i] >= 0) {
          System.out.print(array[i] + " ");
        }
      }
      
      System.out.println();
      
    }
    
    public static int findMaxElement(int[] array) {
      
      int max = array[0];
      
      for(int i = 0; i < array.length; i++) {
        if(array[i] > max) {
          max = array[i];
        }
      }
      
      return max;
    }
    
    public static int findIndexOfMaxElement(int[] array) {
      
      int index = 0;
      
      int max = findMaxElement(array);
      
      for(int i = 0; i < array.length; i++) {
        if(array[i] == max) {
          index = i;
          break;
        }
      }
      
      return index;
    }
    
    public static void main(String[] args) {
      
      int[] array = generateArray(10);
      printArray(array);
      
      System.out.println(findMaxElement(array));
      System.out.println(findIndexOfMaxElement(array));
      
      
      
  }
}

// Task 9-7
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Main {

  public static int[] swapElementsOfArray(int[] array, int n, int m) {

    int l = array.length;

    if ((n < 0) || (m < 0) || (n >= l) || (m >= l)) {
      System.out.println("Элементы поменять нельзя!!!");
      return array;
    } else {
      int temp = array[n];
      array[n] = array[m];
      array[m] = temp;

      return array;
    }
  }

  public static void printArray(int[] array) {

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }

    System.out.println();
  }

  public static int[] scanArray(int n) {

    Scanner sc = new Scanner(System.in);

    int[] array = new int[n];

    for (int i = 0; i < array.length; i++) {
      array[i] = sc.nextInt();
    }

    return array;
  }

  public static int[] generateArray(int n) {

    Random r = new Random();

    int[] array = new int[n];

    for (int i = 0; i < array.length; i++) {
      array[i] = r.nextInt(100);
    }

    return array;
  }

  public static int[] multiplyByNumber(int[] array, int number) {

    System.out.println("Умножаем элементы массива на " + number);

    for (int i = 0; i < array.length; i++) {
      array[i] = array[i] * number;
    }

    return array;
  }

  public static int[] decreaseByNumber(int[] array, int number) {

    System.out.println("Вычитаем из элементов массива " + number);

    for (int i = 0; i < array.length; i++) {
      array[i] = array[i] - number;
    }

    return array;
  }

  public static int[] divideByFirstElement(int[] array) {

    System.out.println("Делим на первый элемент");

    int temp = array[0];

    for (int i = 0; i < array.length; i++) {
      array[i] = array[i] / temp;
    }

    return array;
  }

  public static void printNonNegativeElements(int[] array) {

    for (int i = 0; i < array.length; i++) {
      if (array[i] >= 0) {
        System.out.print(array[i] + " ");
      }
    }

    System.out.println();

  }

  public static int findMaxElement(int[] array) {

    int max = array[0];

    for (int i = 0; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }

    return max;
  }

  public static int findIndexOfMaxElement(int[] array) {

    int index = 0;

    int max = findMaxElement(array);

    for (int i = 0; i < array.length; i++) {
      if (array[i] == max) {
        index = i;
        break;
      }
    }

    return index;
  }

  public static void main(String[] args) {

    int[] array = generateArray(10);
    printArray(array);

    swapElementsOfArray(array, 1, 6);
    printArray(array);
    swapElementsOfArray(array, 3, 7);
    printArray(array);
    swapElementsOfArray(array, 5, 5);
    printArray(array);

    swapElementsOfArray(array, 3, 10);
    printArray(array);
    swapElementsOfArray(array, 10, 7);
    printArray(array);
    swapElementsOfArray(array, -1, 7);
    printArray(array);
    swapElementsOfArray(array, 3, -2);
    printArray(array);

  }
}

// https://codeboard.io/projects/370612

// Сортировка массива
import java.util.*;
import java.util.Arrays;

public class Main {

  public static void printArray(int[] array) {

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }

    System.out.println();
  }

  public static void main(String[] args) {

    int[] array = { 1, 5, 0, 6, 8, 2, 13, -6, 12 };
    printArray(array);

    // Сортировка массива
    Arrays.sort(array);
    printArray(array);
  }
}