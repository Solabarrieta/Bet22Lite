package bets;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import dataAccess.DataAccess;
import domain.Registered;

public class RankingLortuDAWTest {
	
	static DataAccess sut=new DataAccess();
	
	
	@Test
	public void test1() {
		
		List<Registered> resultado = sut.rankingLortu();
		
		assertTrue(resultado.size() != 0);
	}
}

