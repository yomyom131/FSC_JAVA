package sec1;

public class DowhileControlStatement {
	public static void main(String[] args) {
		//반복 횟수가 0일 때, do-while문과 while문 비교
		int a;
		a = 0;
		while(a < 0) {
			System.out.print(a + " ");
			a++;
		}									//실행 횟수 0번
		System.out.println();
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		}while(a < 0);						//실핼 횟수 1번
		System.out.println();
		
		//반복 횟수가 1일 때 , do-while문과 while문 비교
		a = 0;
		while(a < 1) {
			System.out.print(a + " ");
			a++;
		}									//실행 횟수 1번
		System.out.println();
		
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		}while(a < 1);						//실행 횟수 1번
		System.out.println();
		
		//반복 횟수가 10일 때, do-while문과 while문 비교
		a = 0;
		while(a < 10) {
			System.out.print(a + " ");
			a++;
		}									//실행 횟수 10번
		System.out.println();
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		}while(a < 10);						//실행 횟수 10번
	}

}
