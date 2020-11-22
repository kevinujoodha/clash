package kata.clash.units;

import kata.clash.movements.MovementType;

public abstract class Unit {
    private int defensiveHitpoints;
    private int offensiveHitpoints;
    private String dyingMessage;
    private MovementType movementType;

    public Unit(int defensiveHitpoints, int offensiveHitpoints, String dyingMessage, MovementType movementType) {
        this.defensiveHitpoints = defensiveHitpoints;
        this.offensiveHitpoints = offensiveHitpoints;
        this.dyingMessage = dyingMessage;
        this.movementType = movementType;
    }

    public int getDefensiveHitpoints() {
        return defensiveHitpoints;
    }

    private void setDefensiveHitpoints(int defensiveHitpoints) {
        this.defensiveHitpoints = defensiveHitpoints;
    }

    public int getOffensiveHitpoints() {
        return offensiveHitpoints;
    }

    private void setOffensiveHitpoints(int offensiveHitpoints) {
        this.offensiveHitpoints = offensiveHitpoints;
    }

    public String getDyingMessage() {
        return dyingMessage;
    }

    public void setDyingMessage(String dyingMessage) {
        this.dyingMessage = dyingMessage;
    }

    public MovementType getMovementType() {
        return movementType;
    }

    public void setMovementType(MovementType movementType) {
        this.movementType = movementType;
    }

    public String receiveHit(int attackHitpoints) {
        defensiveHitpoints -= attackHitpoints;
        if (defensiveHitpoints <= 0) {
            return dyingMessage;
        }
        return "";
    }

    public int Move(int seconds) {
        return movementType.getDistanceInOneSecond() * seconds;
    }


}
