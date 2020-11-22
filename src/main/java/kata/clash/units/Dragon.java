package kata.clash.units;

import kata.clash.movements.MovementType;

public class Dragon extends Unit {

    public Dragon() {
        super(
                5000,
                7500,
                "I WILL RISE AGAIN FROM THE ASHES",
                MovementType.FLY
        );
    }
}
