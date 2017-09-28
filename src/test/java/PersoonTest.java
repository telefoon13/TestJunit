import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PersoonTest {

	@Test(expected = IllegalArgumentException.class)
	public void iedereVoornaamMoetMinstensUit1TekenBestaan() {
		new Persoon(Arrays.asList("Mike", "", "Tom"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void iederePersoonHeeftMinstens1Voornaam() {
		new Persoon(new ArrayList<String>());
	}

	@Test(expected = IllegalArgumentException.class)
	public void eenPersoonMagNiet2KeerDezelfdeVoornaamHebben() {
		new Persoon(Arrays.asList("Mike", "Mike"));
	}

	@Test
	public void eenPersoonMetMinstens1VoornaamDieMinstens1TekenBevatWordtAanvaard() {
		new Persoon(Arrays.asList("A"));
	}

	@Test
	public void eenPersoonToStringGeeftAlleVoornamenGescheidenDoorSpatie() {
		Persoon persoon = new Persoon(Arrays.asList("Mike", "Tom", "Jan", "Robin"));
		assertTrue(persoon.toString().equals("Mike Tom Jan Robin"));
	}

	@Test(expected = NullPointerException.class)
	public void persoonAanmakenMetNullArrayMagNiet() {
		new Persoon(null);
	}

	@Test
	public void eenPersoonAanmakenMetEenVerzamelingMetSlechts1VoornaamMag() {
		new Persoon(Arrays.asList("Mike"));
	}

	@Test(expected = NullPointerException.class)
	public void eenPersoonMetVoornaamNullMagNiet() {
		new Persoon(Arrays.asList("Mike", null, "Tom"));
	}

	@Test
	public void eenPersoonMetMeerdereVoornamenMag() {
		new Persoon(Arrays.asList("Mike", "Tom", "Jan", "Robin"));
	}
}