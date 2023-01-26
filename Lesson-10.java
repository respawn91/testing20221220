// https://codeboard.io/projects/371499 - Очереди

import java.util.*;
import java.util.ArrayList;

public class Main {

  public static void print(ArrayList<String> list) {

    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ; ");
    }
    System.out.println();
  }

  public static void swap(ArrayList<String> list, String name1, String name2) {

    if ((list.contains(name1) == true) && (list.contains(name2) == true)) {

      int indexOne = list.indexOf(name1);
      int indexTwo = list.indexOf(name2);

      list.set(indexOne, name2);
      list.set(indexTwo, name1);
    }
  }

  public static void main(String[] args) {

    ArrayList<String> list = new ArrayList();

    print(list);

    list.add("Kate");
    list.add("Anton");
    print(list);

    list.add(0, "Svetlana");
    print(list);

    list.add(2, "Nikolay");
    print(list);

    list.add(list.size() / 2, "Veronika");
    print(list);

    list.set(4, "Anastasia");
    print(list);

    list.remove(3);
    print(list);

    list.remove("Kate");
    print(list);

    swap(list, "Anton", "Veronika");
    print(list);
    swap(list, "Anton", "Nikolay");
    print(list);
    swap(list, "Veronika", "Anton");
    print(list);
    swap(list, "Svetlana", "Anastasia");
    print(list);
  }
}

// https://codeboard.io/projects/357482 - ArrayList
