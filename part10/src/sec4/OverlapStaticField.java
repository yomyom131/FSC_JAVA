package sec4;

class M {
	static int n =3;
}

class N extends M {
	static int n =4;
}

public class OverlapStaticField {
	public static void main(String[] args) {
		//클래스명으로 바로 접근
		System.out.println(M.n);
		System.out.println(N.n);
		System.out.println();
		
		//객체 생성
		M aa = new M();
		N bb = new N();
		M ab = new N();
		
		//생성한 객체로 정적 필드 호출
		System.out.println(aa.n);
		System.out.println(bb.n);
		System.out.println(ab.n);
	}
}
