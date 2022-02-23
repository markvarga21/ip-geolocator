package geolocator;

/**
 * Main class
 */
public class Main {

    /**
     * Main public static method in Main class
     * @param args a parancsori argumentum
     */
    public static void main(String[] args) {
        if (args.length > 1) {
            System.err.printf("Usage: java %s [ipOrHostName]%n", Main.class.getName());
            System.exit(1);
        }
        GeoLocator geoLocator = GeoLocator.newInstance();
        GeoLocation geoLocation = args.length == 0 ? geoLocator.getGeoLocation() : geoLocator.getGeoLocation(args[0]);
        System.out.println(geoLocation);
    }

}
