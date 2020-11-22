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
        defensiveHitpoints -= attackHitpoints;
        if (defensiveHitpoints <= 0) {
            return "WHEN YOU play with Explosives is dangerous bussiness";
        }
        return "";

    }

    public int Move(int seconds) {
        throw new UnsupportedOperationException();
    }


}
