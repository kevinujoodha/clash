package kata.clash.units;

public class Bomber {
	private int DefensiveHitpoints;
	private int OffensiveHitpoints;
	
	public int getDefensiveHitpoints() {
		return DefensiveHitpoints;
	}
	private void setDefensiveHitpoints(int defensiveHitpoints) {
		DefensiveHitpoints = defensiveHitpoints;
	}
	public int getOffensiveHitpoints() {
		return OffensiveHitpoints;
	}
	private void setOffensiveHitpoints(int offensiveHitpoints) {
		OffensiveHitpoints = offensiveHitpoints;
	}
    public String ReceiveHit(int attackHitpoints)
    {
        throw new UnsupportedOperationException();
    }
    
    public int Move(int seconds)
    {
      throw new UnsupportedOperationException();
    }

	
}
