class Tester {
	
	public static int cutRod(int[] price, int n) {
		
		int[] maxRevenue = new int[n + 1];
		maxRevenue[0] = 0;

		for (int i = 1; i <= n; i++) {
			int maxVal = Integer.MIN_VALUE;
			
			for (int j = 1; j <= i; j++) {
				maxVal = Math.max(maxVal, price[j - 1] + maxRevenue[i - j]);
			}
			maxRevenue[i] = maxVal;
		}

		return maxRevenue[n];
	}

	public static void main(String[] args) {
		int price1 [] = { 1, 5, 8, 9, 10, 17, 17, 20 };
		int n1 = 4;
		System.out.println("Maximum price for n=4: " + cutRod(price1, n1));

        int price2 [] = { 10, 24, 30, 40, 45 };
		int n2 = 5;
		System.out.println("Maximum price for n=5: " + cutRod(price2, n2));
	}
}