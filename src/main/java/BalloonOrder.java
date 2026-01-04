public class BalloonOrder {
    private String colour = "RED";
    private int count = 0;

    public BalloonOrder(int count) {
        this("RED", count);
    }

    public BalloonOrder(String colour, int count) {
        if (colour == null) {
            colour = "RED";
        } else {
            colour = colour.toUpperCase();
        }

        if (!(colour.equals("RED") || colour.equals("GREEN"))) {
            colour = "RED";
        }

        this.colour = colour;
        this.count = count;
    }

    public String getColour() {
        return colour;
    }

    public int getCount() {
        return count;
    }

}