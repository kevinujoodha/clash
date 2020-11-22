package kata.clash;


import org.junit.Assert;
import org.junit.Test;

import kata.clash.buildings.BlackElixirFactory;
import kata.clash.exceptions.DwarfsAngryException;
import kata.clash.exceptions.InvalidQuantityException;

public class Ex1 {
    @Test

    public void When_Gems_Supplied_Are_Not_Enough_Throw_DwarfsAngryException() throws Exception
    {
    	
    	boolean hasException = false;
    	try 
    	{
    		BlackElixirFactory.ProduceElixir(1, 100);    		
    	}
    	catch(DwarfsAngryException exc)
    	{
    		hasException = true;
    	}
    	
    	Assert.assertTrue(hasException);
    	
    }

    @Test
    public void When_BlueElixir_Supplied_Is_Not_Enough_Throw_DwarfsAngryException() throws Exception
    {
    	throw new UnsupportedOperationException();
    }

    @Test
    public void With_2_Gems_And_500_BlueElixir_Should_Produce_100_BlackElixir() throws Exception
    {
    	throw new UnsupportedOperationException();
    }

    @Test
    public void With_4_Gems_And_1000_BlueElixir_Should_Produce_200_BlackElixir() throws Exception
    {
    	throw new UnsupportedOperationException();
    }

    @Test
    public void With_5_Gems_And_200_BlueElixir_Should_Produce_100_BlackElixir() throws Exception
    {
    	throw new UnsupportedOperationException();
    }

    @Test
    public void When_Gem_Supplied_Is_Too_Much_Throw_InvalidQuantityException() throws Exception
    {
    	throw new UnsupportedOperationException();
    }

    @Test
    public void When_Blue_Elixir_Supplied_Is_Too_Much_Throw_InvalidQuantityException() throws Exception
    {
    	throw new UnsupportedOperationException();
    }


}
