package Argument;

public class test3Factorial {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int F = 1;
		for(int i = 1; i <=n; i++) {
			F *= i;
		}
		System.out.println(F);
		
	}

}