package sec3;

class X {
	protected void abc() {}
}
class Y1 extends X {
	public void abc() {}
}
class Y2 extends X {
	protected void abc() {}
}
class Y3 extends X {
	// void abc() {}			/default 접근 지정자(좁아져서 불가능)
}
class Y4 extends X {
	// private void abc() {}	/private 접근 지정자(좁아져서 불가능)
}

public class MethodOverriding_4 {
	public static void main(String[] args) {
		
	}
}
