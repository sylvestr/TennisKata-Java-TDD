package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	TennisGame game = new TennisGame();
	@Test
	public void loveAllTest()
	{

		Assert.assertEquals(game.getResultat(), "love-all");
		
	}
	
	@Test
	public void fifteenLoveTest()
	{
		game.serveurMarqueInFirst();
		Assert.assertEquals(game.getResultat(), "fifteen-love");
		
	}
	
	public void loveFifteenTest()
	{
		game.ReceveurMarqueInFirst();
		Assert.assertEquals(game.getResultat(), "love-fifteen");
	}
	
	

}
