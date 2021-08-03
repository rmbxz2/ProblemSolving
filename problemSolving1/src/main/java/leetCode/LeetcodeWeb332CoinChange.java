package leetCode;

/**
* Describe class here.
*
*
*
*
*
*/
public class LeetcodeWeb332CoinChange {

	/**
	*   Input: coins = [1,2,5], amount = 11	
	*   Output: 3				
	*   Explanation: 11 = 5 + 5 + 1          
	*
	* @param coins
	* @param amount
	* @return
	*/
	public int coinChange(int[] coins, int amount) {

	    return 0;
	}

	/**
	 * Input: coins = [1,2,5], amount = 11
	 * Output: 3
	 * Explanation: 11 = 5 + 5 + 1          
	 * 
	 * @param args
	*/
	public static void main(String[] args) {
		LeetcodeWeb332CoinChange coin = new LeetcodeWeb332CoinChange();
		int[] coins = { 1, 2, 5 };
		int amount = 11;

		coin.coinChange(coins, amount);
	}
}
