package sec2;

interface I {
	int a =3;
	void qwe();
}

class J implements I {
	public void qwe() {
		System.out.println("방법 1. 자식 클래스 생성자로 객체 생성");
	}
}

public class CreateObjectOfInterface {
	public static void main(String[] args) {
		//객체 생성
		I j1 = new J();
		I j2 = new J();
		
		//메서드 호출
		j1.qwe();
		j2.qwe();
	}
}
