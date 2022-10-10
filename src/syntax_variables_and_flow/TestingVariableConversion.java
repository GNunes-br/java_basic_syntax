package syntax_variables_and_flow;

public class TestingVariableConversion {
	public static void main(String[] args) {
		double remuneration = 1270.50;
		int value = (int) remuneration;
		
		System.out.println(value);
		
		float outherValue = 3.14f;
		
		System.out.println(outherValue);
		
		long bigNumber = 8189198168168786458l;
		
		System.out.println(bigNumber);
		
		short smallNumber = 2131;
		
		System.out.println(smallNumber);
		
		byte verySmallNumber =  127;
		
		System.out.println(verySmallNumber);
		
		double value1 = 0.2;
		double value2 = 0.1;
		double total = value1 + value2;
		
		System.out.println(total);
	}
}
