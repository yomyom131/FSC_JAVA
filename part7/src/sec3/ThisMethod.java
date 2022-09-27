package sec3;

class X {
	int m1, m2, m3, m4;
	X() {
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	X(int a) {
		m1 = a;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	X(int a, int b) {
		m1 = a;
		m2 = b;
		m3 = 3;
		m4 = 4;
	}
	
	void print() {
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4);
		System.out.println();
	}
}

class Y{
	int m1, m2, m3, m4;
	Y(){
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	Y(int a) {
		this();
		m1 = a;
	}
	Y(int a, int b) {
		this(a);
		m2 =b;
	}
	
	/*
	 *B(int a, int b){
	 *	this();
	 *	m1 = a;
	 *	m2 = b;
	 *}
	 */
	void print() {
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4);
		System.out.println();
	}
}

public class ThisMethod {
	public static void main(String[] args) {
		// 3가지 객체 생성(this() 미사용)
		X a1 = new X();
		X a2 = new X(10);
		X a3 = new X(10, 20);
		a1.print();
		a2.print();
		a3.print();
		System.out.println();
		
		//3가지 객체 생성(this() 사용)
		Y b1 = new Y();
		Y b2 = new Y(10);
		Y b3 = new Y(10, 20);
		b1.print();
		b2.print();
		b3.print();
	}

}
