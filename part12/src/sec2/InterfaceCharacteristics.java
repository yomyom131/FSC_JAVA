package sec2;

interface A {
	public static final int a = 3;
	public abstract void abc();
}

interface B {
	int b = 3;
	void bcd();
}

public class InterfaceCharacteristics {
	public static void main(String[] args) {
		//static 자동 추가 확인
		System.out.println(A.a);
		System.out.println(B.b);
		
		//final 자동 추가 확인
		//A.a = 5;	//불가능
		//B.b = 5;	//불가능
	}
}
