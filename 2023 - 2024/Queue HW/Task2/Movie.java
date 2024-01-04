public class Movie
{
    private String movieName;
    private Queue<String> movieQueue;

    public Movie(String movieName, Queue<String> movieQueue)
    {
        this.movieName = movieName;
        this.movieQueue = movieQueue;
    }

    public String getMovieName()
    {
        return movieName;
    }

    public void setMovieName(String movieName)
    {
        this.movieName = movieName;
    }

    public Queue<String> getMovieQueue()
    {
        return movieQueue;
    }

    public void setMovieQueue(Queue<String> movieQueue)
    {
        this.movieQueue = movieQueue;
    }

    public void addToQueue(String id)
    {
        this.movieQueue.insert(id);
    }

    @Override
    public String toString()
    {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", movieQueue=" + movieQueue +
                '}';
    }
}
