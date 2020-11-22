package kata.clash.units;

public class Bomber {
    private int defensiveHitpoints;
    private int offensiveHitpoints;

    public Bomber() {
        defensiveHitpoints = 350;
        offensiveHitpoints = 800;
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

    public String ReceiveHit(int attackHitpoints) {
        throw new UnsupportedOperationException();
    }

    public int Move(int seconds) {
        throw new UnsupportedOperationException();
    }


}
