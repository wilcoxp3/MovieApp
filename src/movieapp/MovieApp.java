
package movieapp;
import java.util.ArrayList;

/**
 * The program MovieApp allows a user to query a database of movies based
 * on the movie category (animated, drama, horror, musical, or scifi). It fetches
 * the data through the MovieIO class to populate an ArrayList with Movie objects.
 * It then prompts the user to choose a category, prints the title of each movie
 * in that category, and prompts the user to continue with another query, or
 * quit the program.
 * @author wilcoxp3
 */
public class MovieApp
{
    public static void main(String[] args)
    {
        //create new ArrayList with number of elements equal to the number
        //of movies
        ArrayList<Movie> movies = new ArrayList(MovieIO.NUM_OF_MOVIES);
        
        //populate the ArrayList with Movie objects using the getMovie static
        //method from the class MovieIO.
        for (int i = 0; i < MovieIO.NUM_OF_MOVIES; i++)
        {
            movies.add(MovieIO.getMovie(i + 1));
        }
        
        //print opening message
        System.out.println("Welcome to the Movie List Application.\n");
        System.out.println("There are 100 movies in the list.\n");
        while (true)
        {   
            //get the category choice from the user
            System.out.println("What category are you interested in?\n"
                    + "     Press 1 for Animated\n"
                    + "     Press 2 for Drama\n"
                    + "     Press 3 for Horror\n"
                    + "     Press 4 for Musical\n"
                    + "     Press 5 for SciFi");
            int movieChoice = Validation.getInt("Enter a number 1-5: ", 1, 5);
            
            //call the printMovies method to print the list of movies for the
            //appropriate category.
            printMovies(movieChoice, movies);
            
            //After the user has entered a valid category, prompt to continue.
            if (!Validation.getContinue("\nContinue? (y/n): "))
            {
                System.out.println("Thank you for using the Movie List Application.");
                break;
            }
        }
        System.out.println("DONE");
    }
    
    /**
     * printMovies accepts the int indicating the user's choice of movie categories
     * and the ArrayList containing all Movies. It then prints the title of each
     * movie in that category.
     * @param movieChoice
     * @param movies 
     */
    public static void printMovies(int movieChoice, ArrayList<Movie> movies)
    {
        String movieCategory = null;
        switch (movieChoice)
        {
            case 1:
                movieCategory = "animated";
                break;
            case 2:
                movieCategory = "drama";
                break;
            case 3:
                movieCategory = "horror";
                break;
            case 4:
                movieCategory = "musical";
                break;
            case 5:
                movieCategory = "scifi";
                break;
        }
        
        System.out.println("Below are movies in the " + movieCategory + " category.");
        for (Movie m : movies)
            {
                if (m.getCategory().equalsIgnoreCase(movieCategory))
                {
                    System.out.println("\t" + m.getTitle());
                }
            }
    }
}