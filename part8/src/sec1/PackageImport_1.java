package sec1;

public class PackageImport_1 {
	public static void main(String[] args) {
		//객체 생성
		// A a = new();			//오류
		sec1.A a = new sec1.A();
		
		//멤버 활용
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
	}

}
