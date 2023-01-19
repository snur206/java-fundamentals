package inheritance;

import java.util.ArrayList;

public class Shop {
    private String name;
    private String description;
    private String numOfDollarSigns;
    private ArrayList<Review> reviews;

    public Shop(String name, String description, String numOfDollarSigns) {
        this.name = name;
        this.description = description;
        this.numOfDollarSigns = numOfDollarSigns;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNumOfDollarSigns() {
        return numOfDollarSigns;
    }

    public void setNumOfDollarSigns(String numOfDollarSigns) {
        this.numOfDollarSigns = numOfDollarSigns;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "Shop: " + name + "Description: " + description + "Price: " + numOfDollarSigns;
    }
}
