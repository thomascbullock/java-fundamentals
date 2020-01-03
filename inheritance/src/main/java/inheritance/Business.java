package inheritance;

import java.util.ArrayList;

public class Business {

    protected String name;
    protected String price;
    protected String chain;
    protected ArrayList<Review> reviews = new ArrayList<Review>();

    public Business(String  name, String price) {
        this.name = name;
        this.price = price;
    }

    //overloaded constructor with chain

    public Business(String name, String price, String chain) {
        this.name = name;
        this.price = price;
        this.chain = chain;
    }

    public String getName() {
        return name;
    }

    public int getStars() {
        int starCount = 0;
        for (Review review : this.reviews) {
            starCount += review.getStars();
        }
        return starCount/this.reviews.size();
    }

    public String getPrice() {
        return price;
    }

    public String getChain() {
        return chain;
    }

    public String toString(){
        String retString = this.name + " has " + this.getStars() + " stars, and is rated " + this.price + " for price.";
        if (this.chain != null) {
            retString += " " + this.name + " is part of the " + this.chain + " chain.";
        }
        return retString;
    }

    public ArrayList<String> getAuthors(){
        ArrayList<String> authorList = new ArrayList<String>();

        for (Review review : this.reviews) {
            authorList.add(review.getAuthor());
        }

        return authorList;
    }

    public boolean hasAuthored(String newAuthor){
        ArrayList<String> authors = getAuthors();

        if (authors.contains(newAuthor)){
            return true;
        }
        return false;
    }

    public void addReview(Review review) throws IllegalArgumentException {

        if (hasAuthored(review.getAuthor())){
            throw new IllegalArgumentException("You have already added a review for " + this.name+ ".");
        } else {
            reviews.add(review);
        }
    }
}
