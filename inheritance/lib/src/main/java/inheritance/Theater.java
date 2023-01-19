package inheritance;

import java.util.ArrayList;

public class Theater {
    private String name;
    private ArrayList<Review> reviews;


    public Theater(String name) {
        this.name = name;
        this.reviews = new ArrayList<>();
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

    private void setNumOfStars(float averageNumOfStars) {
    }

    public String getName() {
        return name;
    }

//    public void addMovie(String name) {
//        reviews.add();
//    }
//
//    public void removeMovie(String name) {
//        reviews.remove();
//    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "Movie: " + name;
    }

}
