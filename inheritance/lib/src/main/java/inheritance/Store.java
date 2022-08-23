package inheritance;

import java.util.LinkedList;

public class Store extends Review{
    // confused on the why stackoverflow said I need a linked list to fix app not working ASK alex
    LinkedList<Review> restaurantReview = new LinkedList<>();
    public String name;

    public int stars;



    public Store(String name, int stars) {
        super();
        this.name = name;
        this.stars = stars;

    }

    public void addReview(Review review) {
        restaurantReview.add(review);
        double starCounter = 0;
        double average=0;


        for(Review reviews: restaurantReview){
            starCounter += review.numberOfStars;
        }
        average = starCounter / restaurantReview.size();
        this.stars= (int) average;
    }

    public String toString(){
        return String.format("Restaurant: %s\nStars: %d", this.name, this.stars);
    }

}
