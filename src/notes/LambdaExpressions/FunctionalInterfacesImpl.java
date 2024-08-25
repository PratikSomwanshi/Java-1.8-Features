package notes.LambdaExpressions;

@FunctionalInterface
interface Test {
	public void get();
}

public class FunctionalInterfacesImpl {
	public static void main(String[] args) {
		Test t = () -> System.out.println("Printing from Lambda");
		t.get();
	}
}
