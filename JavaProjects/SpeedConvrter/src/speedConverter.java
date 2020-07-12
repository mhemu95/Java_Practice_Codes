public class speedConverter {

    public static double toMilesPerHour(double kiloMetersPerHour) {
        if (kiloMetersPerHour < 0) {
            return -1;
        }
        double milesPerHour = Math.round(kiloMetersPerHour / 1.609);

        return milesPerHour;
    }

    public static void printConversion (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("invalid value");
        }
        toMilesPerHour(kilometersPerHour);
    }
}
