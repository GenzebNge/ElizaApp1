package elizaApp1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        Eliza elisaObj = new Eliza();
        String userInput ="";
        System.out.println(elisaObj.getInitialMessage() + elisaObj.getRepitedQuestions());
        userInput =  scan.nextLine();
        System.out.println(userInput);

            while (!userInput.equalsIgnoreCase("Q")){
                System.out.println(elisaObj.getRepitedQuestions());
                userInput =  scan.nextLine();
                System.out.println(userInput);

                  if (userInput.equalsIgnoreCase("q")){
                      System.exit(0);

                  }

        }
    }
}
