package inheritance;

public class Review {

    private String author;
    private String body;
    private int stars;

    Review(String author, String body, int stars){
        this.author = author;
        this.body = body;
        this.stars = stars;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String toString(){
        return this.getAuthor() + " says: " + this.getBody() + " Rating: " + this.getStars() + " stars.";
    }
}

