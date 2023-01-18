package inheritance;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String price;
    private int numOfStars = 0;
    private ArrayList<Review> reviews = new ArrayList<>();

    public Restaurant(String name, String price, int numOfStars) {
        this.name = name;
        this.price = price;
        this.numOfStars = numOfStars;
        this.reviews = reviews;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getNumOfStars() {
        return numOfStars;
    }

    public void setNumOfStars(int numOfStars) {
        this.numOfStars = numOfStars;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }
    @Override
    public  String toString() {
        return "Restaurant " + name + "prices are " + price + "star rating is " + numOfStars;
    }

}
