package kata.clash.units;

public class Dragon {
    private int defensiveHitpoints;
    private int offensiveHitpoints;

    public Dragon() {
        this.defensiveHitpoints = 5000;
        this.offensiveHitpoints = 7500;
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
            return "I WILL RISE AGAIN FROM THE ASHES";
        }
        return "";
    }

    public int Move(int seconds) {
        throw new UnsupportedOperationException();
    }


}
