import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


/**
 * TODO Put here a description of what this class does.
 *
 * @author chanand.
 *         Created Mar 25, 2014.
 */
public class PrimeNumberTest {

	@Test
	public void testTheWorldIsNotInsane() {
		assertTrue("The world is insane", true);
	}
	@Test
	public void testOne() {
		ArrayList<Integer> emptyList = new ArrayList<Integer>();
		assertEquals(emptyList, PrimeNumber.getPrimeFactors(1));
	}
	@Test
	public void testTwo() {
		assertEquals(makeList(2), PrimeNumber.getPrimeFactors(2)); 
	}
	@Test
	public void testThree() {
		assertEquals(makeList(3), PrimeNumber.getPrimeFactors(3)); 
	}
	@Test
	public void testFour() {
		assertEquals(makeList(2,2), PrimeNumber.getPrimeFactors(4)); 
	}
	@Test
	public void testFive() {
		assertEquals(makeList(5), PrimeNumber.getPrimeFactors(5)); 
	}
	@Test
	public void testSix() {
		assertEquals(makeList(2,3), PrimeNumber.getPrimeFactors(6)); 
	}
	@Test
	public void testTwelve() {
		assertEquals(makeList(2,2,3), PrimeNumber.getPrimeFactors(12)); 
	}
	@Test
	public void testBigNumber() {
		assertEquals(makeList(5,7,7,1327), PrimeNumber.getPrimeFactors(325115)); 
	}
	public ArrayList<Integer> makeList(int...ints){
		ArrayList<Integer> results = new ArrayList<Integer>();
		for (int i: ints){
			results.add(i);
		}
		return results;
	}
	

}
