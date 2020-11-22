package kata.clash.buildings;

import kata.clash.units.*;

public class BlueTrainingCamp implements TrainingCamp {

    @Override
    public Unit produceUnit(UnitType unitType) {
        switch (unitType) {
            case BOMBER:
                return new Bomber();
            case GIANT:
                return new Giant();
            case MINER:
                return new Miner();
            default:
                throw new IllegalArgumentException("Blue Training Camp cannot produce " + unitType + " unit");
        }
    }
}
