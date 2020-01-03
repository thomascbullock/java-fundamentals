package inheritance;

public class Review {

    protected User author;
    protected String body;
    protected int stars;

    Review(User author, String body, int stars){
        this.author = author;
        this.body = body;
        this.stars = stars;
    }

    public String getAuthor() {
        return this.author.getName();
    }

    public String getBody() {
        return this.body;
    }

    public int getStars() {
        return this.stars;
    }

    public void updateStars(int stars) {
        this.stars = stars;
    }

    public String toString(){
        return this.author.getName() + " says: " + this.body + " Rating: " + this.stars + " stars.";
    }
}

