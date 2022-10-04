package sec2;

//캐스팅의 가능 여부를 확인할 수 있는 instanceof

class I {}
class J extends I {}

public class Typecasting_3 {
	public static void main(String[] args) {
		//instanceof
		I ii = new I();
		I ij = new J();
		
		System.out.println(ii instanceof I);
		System.out.println(ij instanceof I);
		
		System.out.println(ii instanceof J);
		System.out.println(ij instanceof J);
		
	if(ii instanceof J){
			J j = (J) ii;
			System.out.println("ii를 J로 캐스팅했습니다.");
		}else {
			System.out.println("ii를 J타입으로 캐스팅이 불가합니다.");
		}
		if(ij instanceof J) {
			J j = (J) ij;
			System.out.println("ij를 J로 캐스팅했습니다.");
		}else {
			System.out.println("ij는 J 타입으로 캐스팅이 불가합니다.");
		}
		if("안녕" instanceof String) {
			System.out.println("'안녕'은 Stirng 클래스입니다.");
		}
	}
}
