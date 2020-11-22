package kata.clash.units;

import kata.clash.movements.MovementType;

public class Bomber extends Unit {

    public Bomber() {
        super(
                350,
                800,
                "WHEN YOU play with Explosives is dangerous bussiness",
                MovementType.RUN
        );
    }
}
