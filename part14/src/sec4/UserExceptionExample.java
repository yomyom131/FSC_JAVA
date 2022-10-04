package sec4;

// 점수가 음수일 때 예외 발생
class MinusException extends Exception {
	public MinusException() {
		super();
	}
	public MinusException(String message) {
		super(message);
	}
}

class OverException extends Exception {
	public OverException() {
		super();
	}
	public OverException(String message) {
		super(message);
	}
}

class X {
	void checkScore(int score) throws MinusException, OverException {
		if(score < 0) {
			throw new MinusException("예외 발생 : 음숫값 입력");
		}
		else if (score > 100)
			throw new OverException("예외 발생 : 100점 초과");
		else
			System.out.println("정상 범위의 값입니다.");
	}
}

public class UserExceptionExample {
	public static void main(String[] args) {
		
		X x = new X();
		try {
			x.checkScore(85);
			x.checkScore(150);
		} catch (MinusException | OverException e) {
			System.out.println(e.getMessage());
		}
	}

}
