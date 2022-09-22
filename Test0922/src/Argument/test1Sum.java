package Argument;

public class test1Sum {
	public static void main(String[] args) {
		final int n = Integer.parseInt(args[0]);
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		System.out.printf("i: %d, sum: %d\n", i, sum);
		}
	}
}
