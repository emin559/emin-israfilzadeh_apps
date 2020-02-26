package app.task2602;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class StringTask {
  public static void main(String[] args) {
    String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry";
    String counter;

    ArrayList<String> textList = new ArrayList<>();
    for (int i = 0; i < text.length(); i++) {
      var textLower = text.toLowerCase();
      textList.add(String.valueOf(textLower.charAt(i)));
    }

    HashMap<String, Integer> textSet = new HashMap<>();
    for (int i = 0; i < text.length(); i++) {
      var textLower = text.toLowerCase();
      var amount = 0;
      for (int j = 0; j < textList.size(); j++) {
        if (textList.get(i).equals(textList.get(j))) amount++;
      }
      textSet.put(textList.get(i), amount );
    }

    System.out.println(textSet);

    }
  }

