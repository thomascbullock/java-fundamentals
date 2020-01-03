package inheritance;

public class Restaurant extends Business {

    public Restaurant(String name, String price) {
        super(name, price);
    }

    public Restaurant(String name, String price, String chain) {
        super(name, price, chain);
    }

    public String toString(){
        String retString = "The restaurant " + this.name + " has " + this.getStars() + " stars, and is rated " + this.price + " for price.";
        if (this.getChain() != null) {
            retString += " " + this.name + " is part of the " + this.chain + " chain.";
        }

        return retString;
    }

}
