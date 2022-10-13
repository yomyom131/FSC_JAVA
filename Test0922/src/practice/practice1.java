package practice;

class E{
	public void AS(int ...values) {
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
		E e = new E();
		e.AS(1);
		e.AS(1, 2, 3, 4);
	}
}