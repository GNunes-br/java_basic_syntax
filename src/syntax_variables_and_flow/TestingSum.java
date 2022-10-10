package syntax_variables_and_flow;

public class TestingSum {
	public static void main(String[] args) {
		int count = 0;
		int total = 0;
		
		while (count <= 10) {
			
			total += count;
			
			System.out.println(total);
			
			count++;
		}
	}
}
