public static int calculateGCD(int num1, int num2) {
	int temp;
	if (num1%num2 ==0) 
		return num2;
	if (num1 < num2) {
		temp=num1;
		num1=num2;
		num2=temp;
	}
	while (num2 > 0) {
		num1 = num1%num2;
		temp=num1;
		num1=num2;
		num2=temp;
	}
	return num1;
}
//Ans- Time complexity is O(log n)