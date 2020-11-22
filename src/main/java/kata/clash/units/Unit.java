package kata.clash.units;

public abstract class Unit {
    private int defensiveHitpoints;
    private int offensiveHitpoints;
    private String dyingMessage;

    public Unit(int defensiveHitpoints, int offensiveHitpoints, String dyingMessage) {
        this.defensiveHitpoints = defensiveHitpoints;
        this.offensiveHitpoints = offensiveHitpoints;
        this.dyingMessage = dyingMessage;
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

    public String receiveHit(int attackHitpoints) {
        defensiveHitpoints -= attackHitpoints;
        if (defensiveHitpoints <= 0) {
            return dyingMessage;
        }
        return "";
    }

    public int Move(int seconds) {
        throw new UnsupportedOperationException();
    }


}
