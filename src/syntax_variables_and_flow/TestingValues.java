package syntax_variables_and_flow;

public class TestingValues {
	public static void main(String[] args) {
		int primary = 5;
		int second = 7;
		
		second = primary;
		
		primary = 10;
		
		System.out.println(second);
	}
}
