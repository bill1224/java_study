package protected_access_restriction;

public class B {
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}
}