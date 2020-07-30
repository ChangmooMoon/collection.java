package Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Ex11_5 {
  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    list.add(new Student("홍길동", 1, 1, 50, 100, 40));
    list.add(new Student("홍2동", 1, 1, 40, 10, 60));
    list.add(new Student("홍3동", 1, 1, 30, 90, 20));
    list.add(new Student("홍4동", 1, 1, 60, 70, 10));
    list.add(new Student("홍5동", 1, 1, 100, 20, 100));

    Collections.sort(list);
    Iterator it = list.iterator();

    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}

class Student implements Comparable{
  String name;
  int ban;
  int no;
  int kor, eng, math;

  Student(String name, int ban, int no, int kor, int eng, int math) {
    this.name = name;
    this.ban = ban;
    this.no = no;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }

  int getTotal() {
    return kor + eng + math;
  }

  float getAverage() {
    return (int)((getTotal() / 3f) * 10 + 0.5) / 10f;
  }

  public String toString() {
    return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math
            + "," + getTotal() + "," + getAverage();
  }

  public int compareTo(Object o) {
    if(o instanceof Student) {
      Student tmp = (Student)o;
      return name.compareTo(tmp.name);
    } else {
      return -1;
    }
  }
}

