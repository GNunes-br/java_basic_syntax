package syntax_variables_and_flow;

public class TestingConditionalTwo {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		
		int age = 20;
		int amountOfPeople = 3;
		boolean accompanied = amountOfPeople >= 2;
		
		System.out.println("Valor de acompanhado = " + accompanied);
		
		if (age >= 18 && accompanied) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente voce nao pode entrar");				
		} 
	}
}
