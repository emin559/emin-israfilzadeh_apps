package app.task0203;

import java.util.ArrayList;
import java.util.Scanner;

public class scannerApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> operators = new ArrayList<>();
    operators.add("+");
    operators.add("-");
    operators.add("*");
    operators.add("/");
    int ft = 0;
    int sd = 0;

    String operation = "";

    String input = sc.nextLine();


    while (!(input.equals("quit"))) {
      for (String operator : operators) {
        if (input.contains(operator)) {
          try {
            ft = Integer.parseInt(input.substring(0, input.indexOf(operator)));
            sd = Integer.parseInt(input.substring(input.indexOf(operator) + 1, input.length()));

            switch (operator) {
              case "+":
                System.out.println(ft + sd);
                input = sc.nextLine();
                break;

              case "-":
                System.out.println(ft - sd);
                input = sc.nextLine();

                break;

              case "*":
                System.out.println(ft * sd);
                input = sc.nextLine();

                break;

              case "/":
                System.out.println(ft / sd);
                input = sc.nextLine();
                break;

            }
            break;
          } catch (Exception e) {
            System.out.println("Please add correct numbers!");
            input = sc.nextLine();
          }
          //catch end

        }//if end
      }//for end


    }

  }

}

