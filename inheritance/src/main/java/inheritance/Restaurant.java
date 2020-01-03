package inheritance;

public class Restaurant {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    private String name;
    private int stars;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    private String price;

    Restaurant(String  name, int stars, String price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
    }

    public String toString(){
        return this.getName() + " has " + this.getStars() + " stars, and is rated " + this.getPrice() + " for price.";
    }


}
