package kata.clash.units;

import kata.clash.movements.MovementType;

public class Giant extends Unit {

    public Giant() {
        super(
                4500,
                3000,
                "OUR IRON FISTS WILL BE REMEMBERED FOREVER",
                MovementType.WALK
        );
    }

}
