package app.formatter;

public class Formatter1 extends Formatter {

  String text;

  public Formatter1() {
  }

  public Formatter1(String s) {
  this.text = s.toLowerCase();
  }

  @Override
  String print(String text){
    var text1 = text.toLowerCase();
    return text1;
  }

  @Override
  public String toString() {
    return text;
  }
}
