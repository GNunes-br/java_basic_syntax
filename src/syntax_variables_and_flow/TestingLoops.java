package syntax_variables_and_flow;

public class TestingLoops {
	public static void main(String[] args) {
		for(int multiplier = 1; multiplier <= 10; multiplier++) {
			for (int count = 0; count <= 10; count++) {
				System.out.print(multiplier * count);
				System.out.print(" | ");
			}
			System.out.println();
		}
	}
}
