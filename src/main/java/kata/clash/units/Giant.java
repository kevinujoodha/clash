package kata.clash.units;

public class Giant {
    private int defensiveHitpoints;
    private int offensiveHitpoints;

    public Giant() {
        defensiveHitpoints = 4500;
        offensiveHitpoints = 3000;
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
            return "OUR IRON FISTS WILL BE REMEMBERED FOREVER";
        }
        return "";

    }

    public int Move(int seconds) {
        throw new UnsupportedOperationException();
    }


}
