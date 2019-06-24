package Assigments.Assigment17;

import java.util.ArrayList;

public class Test {
    private static ArrayList<String> movieList = new ArrayList<String>();

    public static void populateList() {
        movieList.add("The Godfather");
        movieList.add("Titanic");
        movieList.add("Dances with Wolves");
        movieList.add("The Pianist");
        movieList.add("Wall Street");
        movieList.add("Amadeus");
    }


    public static String getMovie(int movieIndex) throws MyException {
        // size = 6
        if (movieIndex >= movieList.size() || movieIndex < 0) {
            // the body
            throw new MyException("the movie does not exist");
        }
        return movieList.get(movieIndex);
    }


    public static void main(String[] args) {
        populateList();
        try{
            String movie = getMovie(-1);
            System.out.println("The movie title is: "+ movie);
        }catch (MyException me){
            System.out.println(me.getMessage());
        }

    }
}