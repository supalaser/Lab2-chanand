import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


/**
 * TODO Put here a description of what this class does.
 *
 * @author chanand.
 *         Created Mar 29, 2014.
 */
public class PrimeGenerationTest {

	@Test
	public void testOne() {
		ArrayList<Integer> emptyList = new ArrayList<Integer>();
		assertEquals(emptyList, PrimeNumber.primeNumberGenerator(1));
	}

}
