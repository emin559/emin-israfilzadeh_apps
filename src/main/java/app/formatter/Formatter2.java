package app.formatter;

public class Formatter2 extends Formatter {

  String text;

  public Formatter2() {
  }

  public Formatter2(String s) {
    this.text = s.toUpperCase();
  }


  @Override
  String print(String text){
    var text1 = text.toUpperCase();
    return text1;
  }


  @Override
  public String toString() {
    return text;
  }
}
