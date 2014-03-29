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
	public void testTwo() {
		assertEquals(makeList(2), PrimeNumber.primeNumberGenerator(2)); 
	}
	
	
	public ArrayList<Integer> makeList(int...ints){
		ArrayList<Integer> results = new ArrayList<Integer>();
		for (int i: ints){
			results.add(i);
		}
		return results;
	}

}
