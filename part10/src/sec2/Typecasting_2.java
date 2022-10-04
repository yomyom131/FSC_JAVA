package sec2;

class X {
	int m = 3;
	void qwe() {
		System.out.println("X 클래스");
	}
}

class Y extends X {
	int n = 4;
	void asd() {
		System.out.println("Y 클래스");
	}
}

public class Typecasting_2 {
	public static void main(String[] args) {
		//X타입 / X생성자
		X xx = new X();
		System.out.println(xx.m);
		xx.qwe();
		
		//Y타입 / Y생성자
		Y yy = new Y();
		System.out.println(yy.m);
		System.out.println(yy.n);
		yy.qwe();
		yy.asd();
		
		//X타입 / Y생성자 : 다형적 표현
		X xy = new Y();
		System.out.println(xy.m);
		xy.qwe();
	}
}
