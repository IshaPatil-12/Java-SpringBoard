class Tester {
	public static int calculatePower(int num, int p) {
        
        if (num == 0) {
            return 0;
        }

        if (p == 0) {
            return 1;
        }

        return num * calculatePower(num, p - 1);
	}
	
	public static void main(String[] args) {
		System.out.println("2 to the power of 3: " + calculatePower(2,3));
        System.out.println("0 to the power of 10: " + calculatePower(0, 10));
        System.out.println("5 to the power of 1: " + calculatePower(5, 1));
	}
}
