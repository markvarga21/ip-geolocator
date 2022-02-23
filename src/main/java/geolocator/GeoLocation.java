package geolocator;

/**
 * Using GeoLocation class, it can tell you where you are,
 * using your IP address
 */
@lombok.Data
public class GeoLocation {

    /**
     * This field represents the AS
     */
    private String as;
    private String city;
    private String country;
    private String countryCode;
    private String isp;
    private double lat;
    private double lon;
    private String org;
    private String query;
    private String region;
    private String regionName;
    private String timezone;
    private String zip;


}
