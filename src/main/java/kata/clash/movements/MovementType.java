package kata.clash.movements;

public enum MovementType {
    WALK(3),
    RUN(6),
    TUNNEL_UNDER(5),
    FLY(8);

    private final int distanceInOneSecond;

    MovementType(int distanceInOneSecond) {
        this.distanceInOneSecond = distanceInOneSecond;
    }

    public int getDistanceInOneSecond() {
        return distanceInOneSecond;
    }
}
