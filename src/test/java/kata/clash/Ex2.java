package kata.clash;

import kata.clash.buildings.TrainingCamp;
import kata.clash.units.*;
import org.junit.Assert;
import org.junit.Test;

import kata.clash.buildings.BlackTrainingCamp;
import kata.clash.buildings.BlueTrainingCamp;

public class Ex2 {

	private static TrainingCamp blacktrainingCamp = new BlackTrainingCamp();
	private static TrainingCamp bluetrainingCamp = new BlueTrainingCamp();

	/* Q1 */

	@Test
	public void A_Dragon_Then_It_Should_Have_7500_getOffensiveHitpoints() {
		Unit newlyCreatedDragon = blacktrainingCamp.produceUnit(UnitType.DRAGON);

		Assert.assertEquals(7500, newlyCreatedDragon.getOffensiveHitpoints());
	}

	@Test
	public void A_Dragon_Then_It_Should_Have_5000_getDefensiveHitpoints() {
		Unit newlyCreatedDragon = blacktrainingCamp.produceUnit(UnitType.DRAGON);

		Assert.assertEquals(5000, newlyCreatedDragon.getDefensiveHitpoints());
	}

	@Test
	public void A_Bomber_Then_It_Should_Have_800_getOffensiveHitpoints() {
		Unit newlyCreatedBomber = bluetrainingCamp.produceUnit(UnitType.BOMBER);

		Assert.assertEquals(800, newlyCreatedBomber.getOffensiveHitpoints());
	}

	@Test
	public void A_Bomber_Then_It_Should_Have_350_getDefensiveHitpoints() {
		Unit newlyCreatedBomber = bluetrainingCamp.produceUnit(UnitType.BOMBER);

		Assert.assertEquals(350, newlyCreatedBomber.getDefensiveHitpoints());
	}

	@Test
	public void A_Giant_Then_It_Should_Have_3000_getOffensiveHitpoints() {
		Unit newlyCreatedGiant = bluetrainingCamp.produceUnit(UnitType.GIANT);

		Assert.assertEquals(3000, newlyCreatedGiant.getOffensiveHitpoints());
	}

	@Test
	public void A_Giant_Then_It_Should_Have_4500_getDefensiveHitpoints() {
		Unit newlyCreatedGiant = bluetrainingCamp.produceUnit(UnitType.GIANT);

		Assert.assertEquals(4500, newlyCreatedGiant.getDefensiveHitpoints());
	}

	@Test
	public void A_Miner_Then_It_Should_Have_1200_getOffensiveHitpoints() {
		Unit newlyCreatedMiner = bluetrainingCamp.produceUnit(UnitType.MINER);

		Assert.assertEquals(1200, newlyCreatedMiner.getOffensiveHitpoints());
	}

	@Test
	public void A_Miner_Then_It_Should_Have_800_getDefensiveHitpoints() {
		Unit newlyCreatedMiner = bluetrainingCamp.produceUnit(UnitType.MINER);

		Assert.assertEquals(800, newlyCreatedMiner.getDefensiveHitpoints());
	}

	@Test
	public void With_10000_OffensiveHitpoints_Then_A_Dragon_Dies_And_Shouts_His_Last_Message()
                {
                    Unit dragonUnit = blacktrainingCamp.produceUnit(UnitType.DRAGON);

                    String lastMessageBeforeDying = dragonUnit.receiveHit(2000);

                    Assert.assertTrue(dragonUnit.getDefensiveHitpoints() > 0);
					Assert.assertTrue(lastMessageBeforeDying.isEmpty());

                    lastMessageBeforeDying = dragonUnit.receiveHit(8000);

                    Assert.assertTrue(dragonUnit.getDefensiveHitpoints() <=0);
					Assert.assertEquals("I WILL RISE AGAIN FROM THE ASHES", lastMessageBeforeDying);
                }

	@Test
	public void With_4501_OffensiveHitpoints_Then_A_Giant_Dies_And_Shouts_His_Last_Message()
                {
                    Unit giantUnit = bluetrainingCamp.produceUnit(UnitType.GIANT);
                    String lastMessageBeforeDying = giantUnit.receiveHit(4501);

                    Assert.assertTrue(giantUnit.getDefensiveHitpoints() <= 0);
					Assert.assertEquals("OUR IRON FISTS WILL BE REMEMBERED FOREVER", lastMessageBeforeDying);
                }

	@Test
	public void With_1300_OffensiveHitpoints_Then_A_Miner_Dies_And_Shouts_His_Last_Message()
                {
                    Unit minerUnit = bluetrainingCamp.produceUnit(UnitType.MINER);
                    String lastMessageBeforeDying = minerUnit.receiveHit(1300);

                    Assert.assertTrue(minerUnit.getDefensiveHitpoints() <= 0);
					Assert.assertEquals("we return in the ground", lastMessageBeforeDying.toLowerCase());
                }

	@Test
	public void With_400_OffensiveHitpoints_Then_A_Bomber_Dies_And_Shouts_His_Last_Message()
                {
                    Unit bomberUnit = bluetrainingCamp.produceUnit(UnitType.BOMBER);
                    String expectedMessage = "WHEN YOU play with Explosives is dangerous bussiness";
                    String lastMessageBeforeDying = bomberUnit.receiveHit(400);

                    Assert.assertTrue(bomberUnit.getDefensiveHitpoints() <= 0);
					Assert.assertEquals(lastMessageBeforeDying.toLowerCase(), expectedMessage.toLowerCase());
                }
}
