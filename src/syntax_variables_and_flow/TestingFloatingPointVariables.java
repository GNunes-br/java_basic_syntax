package syntax_variables_and_flow;

public class TestingFloatingPointVariables {
	public static void main(String[] args) {
		double remuneration;
		remuneration = 1250.70;
		
		double age;
		age = 37;
		
		System.out.println("A idade eh " + age);

		System.out.println("O salario eh " + remuneration);
		
		double division = 3.14 / 2;
		
		System.out.println(division);
		
		//double outherDivision = 5 / 2; -> Irá retornar um inteiro
		double outherDivision = 5.0 / 2;
		
		System.out.println(outherDivision);
	}
}
