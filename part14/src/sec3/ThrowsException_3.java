package sec3;

//1. 하위 매서드에 직접 예외를 처리할 때
class X {
	void qwe() {
		asd();
	}
	void asd() {
		try {
			Class cls = Class.forName("java.lang.Object");		//ClassNotFoundException
			Thread.sleep(1000);
		} catch (InterruptedException | ClassNotFoundException e) {
			//예외 처리 구문
		}
	}
}

//2. 예외를 호출 메서드로 전가할 때
class Y {
	void qwe() {
		try {
			asd();	//InterruptedException
		} catch (InterruptedException | ClassNotFoundException e) {
			//예외 처리 구문
		}
	}
	void asd() throws InterruptedException, ClassNotFoundException {
		Class cls = Class.forName("java.lang.Object");			//ClassNotFoundException
		Thread.sleep(1000);	//InterruptedException
	}
}
public class ThrowsException_3 {
	public static void main(String[] args) {
		
	}

}
