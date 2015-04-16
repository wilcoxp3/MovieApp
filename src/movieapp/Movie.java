package movieapp;
/**
 * The movie class contains two fields for the title and category of a given
 * movie, and getters and setters for each field. It also contains an empty
 * constructor as well as a constructor for setting the title and category.
 * @author wilcoxp3
 */
public class Movie
{
    //fields for the movie's title and category
    public String title;
    public String category;
    
    //constructors for new Movie objects
    public Movie() {}
    
    public Movie(String title, String category)
    {
        this.title = title;
        this.category = category;
    }

    //getters and setters for all fields.
    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }
}
