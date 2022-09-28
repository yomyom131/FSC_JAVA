package sec1;

abstract class X {
	abstract void abc();
}

public class AbstractClass_2 {
	public static void main(String[] args ) {
		//객체 생성
		X a1 = new X() {
			void abc() {
				System.out.println("방법 2. 익명 이너 클래스 방법으로 객체 생성");
			}
		};
		X a2 = new X() {
			void abc() {
				System.out.println("방법 2. 익명 이너 클래스 방법으로 객체 생성");
			}
		};
		//메서드 호출
		a1.abc();
		a2.abc();
	}
}
