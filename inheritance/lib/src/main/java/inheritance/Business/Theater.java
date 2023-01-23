package inheritance.Business;

import inheritance.BusinessReview.Review;

import java.util.ArrayList;

public class Theater {
    private String name;
    private float numOfStars;
    private ArrayList<Review> reviews;
    private ArrayList<String> movies;


    public Theater(String name, float numOfStars) {
        this.name = name;
        this.numOfStars = numOfStars;
        this.movies = new ArrayList<String>();
        this.reviews = new ArrayList<Review>();
    }

    public void addMovie(String newMovie) {
        if (!movies.contains(newMovie)) {
            movies.add(newMovie);
        }
    }

    public void removeMovie(String deleteMovie) {
        if (movies.contains(deleteMovie)) {
            movies.remove(deleteMovie);
        }
    }

    public void addReview(Review review) {
        int sumOfReviewStars = 0;
        reviews.add(review);
        for (Review arrayReview : reviews) {
            sumOfReviewStars += arrayReview.getNumOfStars();
        }
        float averageNumOfStars = (sumOfReviewStars / reviews.size());
        setNumOfStars(averageNumOfStars);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getNumOfStars() {
        return numOfStars;
    }

    public void setNumOfStars(float numOfStars) {
        this.numOfStars = numOfStars;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public ArrayList<String> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<String> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", numOfStars=" + numOfStars +
                ", reviews=" + reviews +
                ", movies=" + movies +
                '}';
    }
}