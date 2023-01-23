package inheritance.BusinessReview;

public class MovieReview extends Review {
    String movie;

    public MovieReview(String text, String author, int numOfStars, String movie) {
        super(text, author, numOfStars);
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "MovieReview{" +
                "movie: '" + movie + '\'' +
                ", body: '" + getText() + '\'' +
                ", author: '" + getAuthor() + '\'' +
                ", stars: " + getNumOfStars() +
                '}';
    }
}