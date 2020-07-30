package CollectionEx;

import java.util.Stack;

public class BrowserStack {
  public static Stack back = new Stack();
  public static Stack forward = new Stack();

  public static void goUrl(String url) {
    back.push(url);
    if(!forward.empty())
      forward.clear();
  }

  public static void goForward() {
    if (!forward.empty()) {
      back.push(forward.pop());
    }
  }

  public static void goBack() {
    if (!back.empty()) {
      forward.push(back.pop());
    }
  }

  public static void main(String[] args) {
    goUrl("네이버");
    goUrl("다음");
    goUrl("네이트");
    goUrl("디씨");

    System.out.println(back);
    System.out.println(forward);
    System.out.println(back.peek());
    System.out.println();

    goBack();
    System.out.println(back);
    System.out.println(forward);
    System.out.println(back.peek());
    System.out.println();

    goForward();
    System.out.println(back);
    System.out.println(forward);
    System.out.println(back.peek());
    System.out.println();

    goUrl("github");
    System.out.println(back);
    System.out.println(forward);
    System.out.println(back.peek());
    System.out.println();
  }
}
