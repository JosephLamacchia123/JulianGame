public class Location {
    String description;
    Location neighboringLocation;
    Option[] options;

    public Location(String description, Location neighboringLocation, Option[] options) {
        this.description = description;
        this.neighboringLocation = neighboringLocation;
        this.options = options;
    }

    public Location(String description, Location neighboringLocation) {
        this.description = description;
        this.neighboringLocation = neighboringLocation;
    }
}
