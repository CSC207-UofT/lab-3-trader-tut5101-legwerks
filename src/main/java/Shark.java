/*
A class representing a shark. Can be traded and domesticated.
 */
public class Shark implements Tradable, Domesticatable {

    @Override
    public String sound() {
        return "Shaa~";
    }

    @Override
    public int getPrice() {
        return 90;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
