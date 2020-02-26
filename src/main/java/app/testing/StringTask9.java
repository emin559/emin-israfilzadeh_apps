package app.testing;

public class StringTask9 implements Filterable {

  @Override
  public String filter(String origin) {
    String vowel = "aeiuo";
    for (int i = 0; i < origin.length(); i++) {
        if (vowel.contains(String.valueOf(origin.charAt(i)).toLowerCase())){
          String removable = String.valueOf(origin.charAt(i));
          origin = origin.replaceAll(removable, "-");
        }
    }
    return origin.replace("-", "").toLowerCase();
  }

}
