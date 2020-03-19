package app.task1903;

/**
 * http://www.asciitable.com/index/asciifull.gif
 * https://cdn.cs50.net/2016/x/psets/0/pset0/bulbs.html
 * http://sticksandstones.kstrom.com/appen.html
 */
public class StringOps {

  // abc -> ABC
  // aBc -> AbC
  // Abc -> aBC
  String invertCase(String origin) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < origin.length(); i++) {
      int lInt = origin.charAt(i);
      if (lInt >= 97) {
        char l = (char) (lInt - 32);
        result.append(l);

      } else {
        char l = (char) (lInt + 32);
        result.append(l);
      }

    }
    return result.toString();
  }

  // abc -> ABC
  // aBc -> ABC
  // Abc -> ABC
  String toUpperCase(String origin) { // a -> A A -> A
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < origin.length(); i++) {
      int lInt = origin.charAt(i);
      if (lInt >= 97) {
        char l = (char) (lInt - 32);
        result.append(l);

      } else {
        char l = (char) lInt;
        result.append(l);
      }

    }
    return result.toString();
  }

  // abc -> abc
  // aBc -> abc
  // Abc -> abc
  String toLowerCase(String origin) { // A -> a a -> a
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < origin.length(); i++) {
      int lInt = origin.charAt(i);
      if (lInt >= 97) {
        char l = (char) (lInt - 32);
        result.append(l);

      } else {
        char l = (char) lInt;
        result.append(l);
      }

    }
    return result.toString();
  }

  public static void main(String[] args) {
    StringOps ooo = new StringOps();

    System.out.println(ooo.toUpperCase("EoIuYIjlkjI"));
    System.out.println(ooo.toLowerCase("OIUPOIUREWOINMBVC"));
    System.out.println(ooo.invertCase("UuOlIk"));
  }

}
