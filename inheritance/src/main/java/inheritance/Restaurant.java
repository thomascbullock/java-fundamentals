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

    Restaurant(String  name, int stars) {
        this.name = name;
        this.stars = stars;
    }

    public String toString(){
        return "Restaurant " + this.getName() + " has " + this.getStars() + " stars.";
    }


}
