package CollectionEx;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListEx {
  public static void main(String[] args) {
    ArrayList list = new ArrayList(); // 크기가 10인 ArrayList 생성

    list.add(5);
    list.add(4);
    list.add(2);
    list.add(3);
    list.add(1);
    list.add(5);

    ArrayList list2 = new ArrayList(list.subList(2, 4));
    list2.add(6);

    ArrayList list3 = new ArrayList();
    list3.addAll(list);
    list3.addAll(list2);

    list.retainAll(list2);

    System.out.println(list);
    System.out.println(list2);
    System.out.println(list3);

    Vector v = new Vector();

  }
}
