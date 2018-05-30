
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MovieGuess {



    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/MovieList.txt");
        Scanner scanner = new Scanner(file);

        String movieName = " ";
        String upperCaseMovieName = " ";
        String[] movie;
        movie = new String[28];

        int i = 0;
        while (i < 28) {
            movie[i] = " ";
            i++;
        }
        i = 0;
        while (scanner.hasNextLine()) {         // All movieNames in array movie
            String line = scanner.nextLine();
            movie[i] = line;
            i++;
        }
        i = 0;
        i = (int) (Math.random() * 28);         // chose a movieName

        upperCaseMovieName = movie[i];
        movieName = upperCaseMovieName.toLowerCase();
        GuessLetter gLetter = new GuessLetter();
        gLetter.guessLetter(movieName);
    }
}
