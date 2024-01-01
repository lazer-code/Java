import java.util.Arrays;

public class Cinema
{
    private Movie[] movies;

    public Cinema()
    {
        this.movies = new Movie[10];
    }

    public Movie[] getMovies()
    {
        return movies;
    }

    public void setMovies(Movie[] movies)
    {
        this.movies = movies;
    }

    public void addMovie(Movie movie)
    {
        for (int i = 0; i < this.movies.length; i++)
        {
            if (this.movies[i] == null)
            {
                this.movies[i] = movie;
                i = this.movies.length;
            }
        }
    }

    public void addToMovieQueue(String movieName, String id)
    {
        for (int i = 0; i < this.movies.length; i++)
            if (this.movies[i] != null && this.movies[i].getMovieName().equals(movieName))
                this.movies[i].addToQueue(id);
    }

    @Override
    public String toString()
    {
        return "Cinema{" +
                "movies=" + Arrays.toString(movies) +
                '}';
    }
}
