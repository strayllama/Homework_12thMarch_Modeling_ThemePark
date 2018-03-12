import java.util.ArrayList;

public abstract class Ride {
    private String name;
    private int price;
    private ArrayList<IRide> riders;
    private int minHeight;
    private int maxHeight;

    public Ride(String name, int price, int minHight, int maxHight) {
        this.name = name;
        this.price = price;
        riders = new ArrayList<>();
        this.minHeight = minHight;
        this.maxHeight = maxHight;
    }

    // GETTERS
    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public int getMinHeight() {
        return this.minHeight;
    }

    public int getMaxHeight() {
        return this.maxHeight;
    }

    public ArrayList<IRide> getRiders() {
        return riders;
    }

    // SETTORS
    public void addRider(IRide rider) {
        if (!this.restrict(rider)) {
            // default restrict return is false, so no restriction. Only rides that impliment interface IRestrict will change the default
            riders.add(rider);
        }
    }

    // OTHER METHOD
    // RESTICT NEEDS TO BE OVER WRITTEN BY ANY CLASSES THAT IMPLEMENT RESTICTION
    public boolean restrict(IRide rider) {
        return false;
    }

}
