package inheritance;

public class RestaurantReview extends Review {

    private Restaurant restaurant;

    public RestaurantReview(User author, String body, int stars, Restaurant restaurant) {
        super(author, body, stars);
        this.restaurant = restaurant;
    }

    public String toString(){
        return this.getAuthor() + "'s review of " + this.restaurant.name + ": " + this.body + " Rating: " + this.stars + " stars.";
    }

}
