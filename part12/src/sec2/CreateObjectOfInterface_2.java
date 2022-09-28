package sec2;

interface M {
	int m = 3;
	void asd();
}

public class CreateObjectOfInterface_2 {
	public static void main(String[] args) {
		//객체 생성
		M m1 = new M() {
			public void asd() {
				System.out.println("방법 2. 익명 이너 클래스를 이용한 객체 생성");
			}
		};
		
		M m2 = new M() {
			public void asd() {
				System.out.println("방법 2. 익명 이너 클래스를 이용한 객체 생성");
			}
		};
		
		//메서드 호출
		m1.asd();
		m2.asd();
	}
}
