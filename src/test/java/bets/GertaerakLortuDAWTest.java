package bets;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import dataAccess.DataAccess;

public class GertaerakLortuDAWTest {
	
	static DataAccess sut=new DataAccess();
	
	
	@Test
	public void test1() {
		
		String description = "Athletic-Real";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date eventDate=null;
		try {
			eventDate = sdf.parse("20/10/2022");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sport = "Patata";
		
		boolean obtenido = sut.gertaerakSortu(description, eventDate, sport);
		boolean esperado = false; 
		
		assertEquals(esperado, obtenido);
	}
}
