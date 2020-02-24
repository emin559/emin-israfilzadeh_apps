package app.formatter;

public class Formatter3 extends Formatter {

  String text;

  public Formatter3() {
  }

  public Formatter3(String s) {
    var text1 = s.toUpperCase();
    text = text1;
    StringBuilder str = new StringBuilder();
    var star = "*";
    for (int i = 0; i < text.length()+4 ; i++) {
      str.append(star);
    }
    str.append("");
    str.append("\n");
    str.append("* ");
    str.append(text1);
    str.append(" *");
    str.append("\n");
    str.append(star);
    for (int i = 0; i < text.length()+3 ; i++) {
      str.append(star);
    }


    this.text = str.toString();
  }

  @Override
  String print(String s){
    var text1 = s.toUpperCase();
    text = text1;
    StringBuilder str = new StringBuilder();
    var star = "*";
    for (int i = 0; i < text.length()+4 ; i++) {
      str.append(star);
    }
    str.append("");
    str.append("\n");
    str.append("* ");
    str.append(text1);
    str.append(" *");
    str.append("\n");
    str.append(star);
    for (int i = 0; i < text.length()+3 ; i++) {
      str.append(star);
    }
    this.text = str.toString();
    return text;
  }

  @Override
  public String toString() {
    return text;
  }
}
