import java.text.DecimalFormat;

public class Sphere {
    private static DecimalFormat f = new DecimalFormat("##.00");

    public static double getVolume(double j) {
        double volume;
        double fourThirds = 1.33;
        double pi = 3.14;

        if (j > 1000) {
            return 0;
        } else if (j < 0) {
            throw new IllegalArgumentException("Radius shouldn't be negative");
        }
        String stringVolume = f.format(fourThirds * pi * Math.pow(j, 3));
        volume = Double.parseDouble(stringVolume);
        return volume;
    }
}
