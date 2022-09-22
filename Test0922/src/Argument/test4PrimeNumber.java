package Argument;

public class test4PrimeNumber {
	public static void main(String[] args) {
		final int n = Integer.parseInt(args[0]);
		for(int i = 2; i <= n; i++) {
			boolean P = true;
			for(int j =2; j<= i/2; j++) {
				if(i % j == 0) {
					P = false;
					break;
				}
			}
			if(P) {
				System.out.print(i + ", ");
			}
		}

	}
}
