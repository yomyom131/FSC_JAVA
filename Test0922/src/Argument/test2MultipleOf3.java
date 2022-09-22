package Argument;

public class test2MultipleOf3 {
	public static void main(String[] args) {
		final int n = Integer.parseInt(args[0]);
		for(int i = 1; i<=n; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

}
