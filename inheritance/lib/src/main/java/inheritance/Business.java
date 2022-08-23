package inheritance;


public class Business extends Review{

    ArrayList<Review> restaurantReview = new ArrayList<>();
    public String name;
    public int price;
    public int stars;



    public Store(String name, int stars, int price) {
        this.name = name;
        this.stars = stars;
        this.price = price;

    }
    @Override
    public void addReview(Review review) {
        restaurantReview.add(review);
        float starCounter = 0;
        float average;


        for(Review reviews: restaurantReview){
            starCounter += review.numberOfStars;
        }
        average = starCounter / restaurantReview.size();
        this.stars= (int) average;
    }

    public String toString(){

        return String.format("Shop: %s\nPrice: %d\nStars: %d", this.name, this.priceCategory, this.stars);
    }

}
