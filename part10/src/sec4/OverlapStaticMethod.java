package sec4;

class X {
	static void print() {
		System.out.println("X 클래스");
	}
}
class Y extends X {
	static void print() {
		System.out.println("Y 클래스");
	}
}

public class OverlapStaticMethod {
	public static void main(String[] args) {
		//클래스명으로 바로 접근
		X.print();
		Y.print();
		System.out.println();
		
		//객체 생성
		X xx = new X();
		Y yy = new Y();
		X xy = new Y();
		
		//객체를 통한 메서드 호출
		xx.print();
		yy.print();
		xy.print();
	}
}
