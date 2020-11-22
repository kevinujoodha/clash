package kata.clash.units;

import kata.clash.movements.MovementType;

public class Miner extends Unit {

    public Miner() {
        super(
                800,
                1200,
                "we return in the ground",
                MovementType.TUNNEL_UNDER
        );
    }

}
