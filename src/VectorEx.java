import java.util.*;

public class VectorEx {
  public static void main(String[] args) {
    Vector v = new Vector(5);
    v.add("1");
    v.add("2");
    v.add("3");
    print(v);

    v.trimToSize();
    print(v);

    v.ensureCapacity(6);
    print(v);

    v.setSize(7);
    print(v);

    v.clear();
    print(v);
  }

  public static void print(Vector v) {
    System.out.println("v: " + v);
    System.out.println("v.size(): " + v.size());
    System.out.println("v.capacity(): "+ v.capacity());
    System.out.println();
  }
}
