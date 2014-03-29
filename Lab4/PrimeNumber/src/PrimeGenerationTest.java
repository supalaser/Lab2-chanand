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
	@Test
	public void testTwo() {
		ArrayList<Integer> emptyList = new ArrayList<Integer>();
		assertEquals(emptyList, PrimeNumber.primeNumberGenerator(1));
	}
	@Test
	public void testThree() {
		assertEquals(makeList(2), PrimeNumber.primeNumberGenerator(3)); 
	}
	@Test
	public void testFour() {
		assertEquals(makeList(2,3), PrimeNumber.primeNumberGenerator(4)); 
	}
	@Test
	public void testSix() {
		assertEquals(makeList(2,3,5), PrimeNumber.primeNumberGenerator(6)); 
	}
	@Test
	public void testThirteen() {
		assertEquals(makeList(2,3,5,7,11), PrimeNumber.primeNumberGenerator(13)); 
	}
	
	
	
	
	
	public ArrayList<Integer> makeList(int...ints){
		ArrayList<Integer> results = new ArrayList<Integer>();
		for (int i: ints){
			results.add(i);
		}
		return results;
	}

}
