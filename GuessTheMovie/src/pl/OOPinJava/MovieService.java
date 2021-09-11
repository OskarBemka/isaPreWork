package pl.OOPinJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieService {

    public List<String> getMovies() throws FileNotFoundException {


        File file = new File("/home/oskar/Desktop/projectsPreWork/isaPreWork/GuessTheMovie/movie_list.txt");
        Scanner scanner = new Scanner(file);

        List<String> movieList = new ArrayList<>();

        while (scanner.hasNextLine()) {
            movieList.add(scanner.nextLine());
//            System.out.println(scanner.nextLine());
        }
        System.out.println(movieList);

        return movieList;

    }
}