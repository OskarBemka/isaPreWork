package pl.OOPinJava;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        MovieService movieService = new MovieService();
        List<String> movieList = movieService.getMovies();
        Random random = new Random();
        int movieNumberToGuess = random.nextInt(movieList.size());

        String movieToGuess = movieList.get(movieNumberToGuess);
        System.out.println("Guess the movie title by giving single letter");

        String regex = "(?![%s])[a-zA-z]";
        String undercoverMovieTitle = movieToGuess.replaceAll("[a-zA-Z]", "_");
        System.out.println(undercoverMovieTitle);

        Scanner scanner = new Scanner(System.in);
        String playerInPut ;
        String uncoveredWord = "";
        Set<String> ussedLetters = new HashSet<>();



        int i =10;

        while (uncoveredWord != movieToGuess) {
            playerInPut = scanner.nextLine();
            while (playerInPut.length() > 1) {
                System.out.println("wrong input try again");
                playerInPut = scanner.nextLine();
            }
            ussedLetters.add(playerInPut);
            uncoveredWord = movieToGuess.replaceAll(String.format(regex, ussedLetters), "_");
            System.out.println(uncoveredWord + "  Used letters : " + ussedLetters);

            if (!movieToGuess.contains(playerInPut)) {
                i--;
                System.out.println(i + " left chances");
                if (i == 0) {
                    System.out.println("loser");
                    break;
                }
                }
            if (movieToGuess == uncoveredWord) {
                System.out.println("brawo");
                break;
            }
            }

    }
}
