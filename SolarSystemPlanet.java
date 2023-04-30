public enum SolarSystemPlanet {
    MERCURY(1, 0, 0, 2439.7, null, "VENUS"),
    VENUS(2, 57_910_000, 108_200_000, 6051.8, "MERCURY", "EARTH"),
    EARTH(3, 149_600_000, 149_600_000, 6.371, "VENUS", "MARS"),
    MARS(4, 227_939_200, 227_939_100, 3389.5, "EARTH", "JUPITER"),
    JUPITER(5, 778_330_000, 778_500_000, 69.911, "MARS", "SATURN"),
    SATURN(6, 1_429_400_000, 1_429_400_000, 58.232, "JUPITER", "URANUS"),
    URANUS(7, 2_870_990_000L, 2_871_000_000L, 25.362, "SATURN", "NEPTUNE"),
    NEPTUNE(8, 4_498_250_000L, 4_498_250_000L, 24.622, "URANUS", null);

    private final int orderFromSun;
    private final long distanceFromPreviousPlanet;
    private final long distanceFromSun;
    private final double radius;
    private final String previousPlanet;
    private final String nextPlanet;

    SolarSystemPlanet(int orderFromSun, long distanceFromPreviousPlanet, long distanceFromSun,
                      double radius, String previousPlanet, String nextPlanet) {
        this.orderFromSun = orderFromSun;
        this.distanceFromPreviousPlanet = distanceFromPreviousPlanet;
        this.distanceFromSun = distanceFromSun;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
        this.nextPlanet = nextPlanet;
    }

    public int getOrderFromSun() {
        return orderFromSun;
    }

    public long getDistanceFromPreviousPlanet() {
        return distanceFromPreviousPlanet;
    }

    public long getDistanceFromSun() {
        return distanceFromSun;
    }

    public double getRadius() {
        return radius;
    }

    public String getPreviousPlanet() {
        return previousPlanet;
    }

    public String getNextPlanet() {
        return nextPlanet;
    }
}