package syntax_variables_and_flow;

public class TestingWhile {
	public static void main(String[] args) {
		int count = 0;
		int total = 0;
		
		while(count <= 10) {
			total += count;
			
			
			count++;
		}
		System.out.println(total);
	}
}
