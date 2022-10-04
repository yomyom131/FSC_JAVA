package sec5;

class X {
	void qwe() {
		System.out.println("X 클래스의 qwe()");
	}
}
class Y extends X {
	void qwe() {
		System.out.println("Y 클래스의 qwe()");
	}
	void asd() {
		super.qwe();			//부모 클래스 객체의 qwe() 메서드 호출
	}
}

public class SuperKeyword_2 {
	public static void main(String[] args) {
		//객체 생성
		Y yy = new Y();
		
		//메서드 호출
		yy.asd();
	}
}