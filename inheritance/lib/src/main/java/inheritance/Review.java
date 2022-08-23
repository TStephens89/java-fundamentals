package inheritance;

public class Review {
    public String body;
    public String author;
    public int numberOfStars;
    public Store store;

    public Review(String body, String author, int numberOfStars){
        this.body = body;
        this.author = author;
        reviewersStarRating(numberOfStars);

    }

    public Review() {

    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }


    public int getNumberOfStars() {
        return numberOfStars;
    }


    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public void reviewersStarRating(int stars){
        if(stars < 0 || stars > 6){
            throw new IllegalArgumentException("Must choose between 0-5");
        }
        this.numberOfStars = stars;
    }


   //I kept getting a weird output stackoverflow said use toString but I am unsure on why it is need ASK Alex or Ben
    public String toString(){
        return String.format("Review: " + this.body + " Reviewed by " + this.author + " Stars received: " + this.numberOfStars );
    }
}
