package sec2;

public class Logical {
	public static void main(String[] args) {
		//�� ������
		// @AND(&&)
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && (5 < 3));
		System.out.println((5 <= 5) && (7 > 2));
		System.out.println();
		
		// @OR(||)
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || (5 < 3));
		System.out.println((5 <= 5) || (7 > 2));
		System.out.println();
		
		// @WOR(^)
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ (5 < 3));
		System.out.println((5 <= 5) ^ (7 > 2));
		System.out.println();
		
		// @NOT(!)
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(false || !(5 < 3));
		System.out.println((5 <= 5) || !(7 > 2));
		System.out.println();
		
		//��Ʈ �����ڷ� �� ���� ����
		
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(true | (5 < 3));
		System.out.println((5 <= 5) | (7 > 2));
		System.out.println();
		
		// @��Ʈ ��Ŷ ��� ����(�� �����ڴ� O, ��Ʈ ������ X)
		int value1 = 3;
		System.out.println(false && ++value1 > 6);
		System.out.println(value1);
		
		int value2 = 3;
		System.out.println(false & ++value2 > 6);
		System.out.println(value2);
		
		int value3 = 3;
		System.out.println(true || ++value3 > 6);
		System.out.println(value1);
		
		int value4 = 3;
		System.out.println(true | ++value4 > 6);
		System.out.println(value4);
	}

}
