import java.util.Scanner;

public class GuessLetter {

    private String newLetter = " ";             // new guessed letter
    private String dotName;                     // movie name letters changed with dots
    private boolean wrongLetter = false;        // no wrong letters
    private boolean wrightLetter = false;       // no wright letters
    private int countWrightLetter = 0;
    private int countWrongLetter = 0;
    private int countGuess = 0;                 // cont the guesses

    public void guessLetter(String movieName) {

        // movieName changed to dots & array

            dotName = movieName.replaceAll("[a-zA-Z]", ".");
            char[] saveCharDotName = dotName.toCharArray();
            char[] charDotName = dotName.toCharArray();

        Scanner keyboard = new Scanner(System.in);

        //System.out.println(movieName);          // print movieName for test

        int i = 0;
        while (i < movieName.length()) {

            if (!wrightLetter && !wrongLetter) {
                System.out.println(dotName);
            }
            System.out.println("Guess a letter: ");

            newLetter = keyboard.nextLine();
            char charNewLetter = newLetter.charAt(0);

            if (Character.isLetter(charNewLetter)) {

                for (int j = 0; j < movieName.length(); j++) {

                    if (movieName.substring(j, j + 1).equals(newLetter)) {
                        charDotName[j] = charNewLetter;
                        wrightLetter = true;
                        countWrightLetter++;
                        i++;
                    }
                }
                if (!wrightLetter && wrongLetter) {          // HER
                    wrongLetter = true;
                    countWrongLetter++;
                    System.out.println("Wrong letter " + newLetter);
                }
                for (int k = 0; k < movieName.length(); k++) {
                    saveCharDotName[k] = charDotName[k];
                }
                dotName = new String(saveCharDotName);
                if (wrongLetter || wrightLetter) {
                    System.out.println(dotName);
                }
                countGuess++;
            } else {
                System.out.println("Guess letter is not a letter");
                countGuess++;
            }

            if (countWrightLetter == movieName.length()) {
                System.out.println("You have guessed wright!!");
                break;
            }
            if (countGuess > 15) {
                System.out.println("You have used " + countGuess + " guesses!!");
                break;
            }
        }

    }
}
