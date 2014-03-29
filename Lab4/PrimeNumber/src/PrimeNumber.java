import java.util.ArrayList;


/**
 * TODO Put here a description of what this class does.
 *
 * @author chanand.
 *         Created Mar 25, 2014.
 */
public class PrimeNumber {

	/**
	 * TODO Put here a description of what this method does.
	 *
	 * @param i
	 * @return
	 */
	public static ArrayList<Integer> getPrimeFactors(int n) {
		ArrayList<Integer> results = new ArrayList<Integer>();
		int current = 2;
		while(n>1){
			if(n%current==0){
				results.add(current);
				n/=current;
			}else{
				current++;
			}
		}
		return results;
	}

	/**
	 * TODO Put here a description of what this method does.
	 * @param i 
	 *
	 */
	public static ArrayList<Integer> primeNumberGenerator(int i) {
		return null;
		
	}
	

}
