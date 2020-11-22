package kata.clash;


import kata.clash.exceptions.DwarfsAngryException;
import kata.clash.exceptions.InvalidQuantityException;
import org.junit.Test;

import static kata.clash.buildings.BlackElixirFactory.produceElixir;
import static org.junit.Assert.assertEquals;

public class Ex1 {

    @Test(expected = DwarfsAngryException.class)
    public void When_Gems_Supplied_Are_Not_Enough_Throw_DwarfsAngryException() throws Exception {
        produceElixir(1, 100);
    }

    @Test(expected = DwarfsAngryException.class)
    public void When_BlueElixir_Supplied_Is_Not_Enough_Throw_DwarfsAngryException() throws Exception {
        produceElixir(2, 199);
        throw new UnsupportedOperationException();
    }

    @Test
    public void With_2_Gems_And_500_BlueElixir_Should_Produce_100_BlackElixir() throws Exception {
        assertEquals(100, produceElixir(2, 500));
    }

    @Test
    public void With_4_Gems_And_1000_BlueElixir_Should_Produce_200_BlackElixir() throws Exception {
        assertEquals(200, produceElixir(4, 1000));
    }

    @Test
    public void With_5_Gems_And_200_BlueElixir_Should_Produce_100_BlackElixir() throws Exception {
        assertEquals(100, produceElixir(5, 200));
    }

    @Test(expected = InvalidQuantityException.class)
    public void When_Gem_Supplied_Is_Too_Much_Throw_InvalidQuantityException() throws Exception {
        produceElixir(7, 200);
    }

    @Test(expected = InvalidQuantityException.class)
    public void When_Blue_Elixir_Supplied_Is_Too_Much_Throw_InvalidQuantityException() throws Exception {
        produceElixir(5, 201);
    }

    @Test(expected = InvalidQuantityException.class)
    public void When_Blue_Elixir_Supplied_Is_Too_Much_And_Multiple_Of_200_Throw_InvalidQuantityException() throws Exception {
        produceElixir(5, 400);
    }

    @Test(expected = InvalidQuantityException.class)
    public void When_Gem_Supplied_Is_Too_Much_And_Multiple_Of_5_Throw_InvalidQuantityException() throws Exception {
        produceElixir(10, 200);
    }


}
