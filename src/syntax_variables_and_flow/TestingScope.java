package syntax_variables_and_flow;

public class TestingScope {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		
		int age = 20;
		int amountOfPeople = 3;
		boolean accompanied;
		
		if(amountOfPeople >= 2) {
			accompanied = true;
		} else {
			accompanied = false;
		}
		
		System.out.println("Valor de acompanhado = " + accompanied);
		
		if (age >= 18 && accompanied) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente voce nao pode entrar");				
		} 
	}
}
