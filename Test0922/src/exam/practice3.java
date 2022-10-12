package exam;

class B {
	int data;
	B (int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof B) {
			return this.data == ((B)obj).data;
		}
		return false;
	}
}

public class practice3 {
	public static void main(String[] args) {
		B b1 = new B(3);
		B b2 = new B(3);
		System.out.println(b1.equals(b2));
	}
}
