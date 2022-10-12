package exam;

class A{
	public void averageScore(int ...values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		double average = (double) sum / values.length;
		System.out.println(average);
	}

}

public class practice1 {
	public static void main(String[] args) {
		A a = new A();
		a.averageScore(1);
		a.averageScore(1, 2, 3, 4);
	}
}