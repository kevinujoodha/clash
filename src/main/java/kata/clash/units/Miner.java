package kata.clash.units;

public class Miner {
    private int defensiveHitpoints;
    private int offensiveHitpoints;

    public Miner() {
        defensiveHitpoints = 800;
        offensiveHitpoints = 1200;
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
        defensiveHitpoints -= attackHitpoints;
        if (defensiveHitpoints <= 0) {
            return "we return in the ground";
        }
        return "";
    }

    public int Move(int seconds) {
        throw new UnsupportedOperationException();
    }


}
