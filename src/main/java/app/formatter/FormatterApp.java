package app.formatter;

public class FormatterApp {
  public static void print(String s, Formatter f) {

    f.print(s);
    }


  public static void main(String[] args) {
    Formatter fmt1 = new Formatter1();
    Formatter fmt2 = new Formatter2();
    Formatter fmt3 = new Formatter3();


    fmt1.print("EEE");
    fmt2.print("eeeee");
    fmt3.print("eeeee");

    print("Emin", fmt1);
    print("Emin", fmt2);
    print("Emin", fmt3);

    System.out.println(new Formatter1("Eminnnnnn"));
    System.out.println(new Formatter2("Eminnnnnn"));
    System.out.println(new Formatter3("Eminnnnnn"));
  }

}
