
public class Task14 {
	public static void main(String[] args) {
		System.out.println("Task14 start");
		System.out.println(solution(200));
		System.out.println("Task14 end");
	}

	private static int solution(int target) {
		int[] coins = { 1, 2, 5, 10, 20, 50, 100, 200 };
		int[] result = new int[target + 1];
		result[0] = 1;
		for (int i = 0; i < coins.length; i++) {
			for (int j = coins[i]; j <= target; j++) {
				result[j] += result[j - coins[i]];
			}
		}
		return result[target];
	}
}
