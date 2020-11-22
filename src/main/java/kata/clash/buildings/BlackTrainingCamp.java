package kata.clash.buildings;

import kata.clash.units.Dragon;
import kata.clash.units.Unit;
import kata.clash.units.UnitType;

public class BlackTrainingCamp implements TrainingCamp {

    @Override
    public Unit produceUnit(UnitType unitType) {
        if (UnitType.DRAGON == unitType) {
            return new Dragon();
        }
        throw new IllegalArgumentException("Blue Training Camp cannot produce " + unitType + " unit");
    }
}
