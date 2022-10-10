package syntax_variables_and_flow;

public class TestingConditional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		
		int age = 16;
		int amountOfPeople = 3;
		
		if (age >= 18) {
			System.out.println("Voce tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		} else {
			if (amountOfPeople >= 2) {
				System.out.println("Voce nao tem 18, mas pode entrar, pois esta acompanhado");
			} else {
				System.out.println("Infelizmente voce nao pode entrar");				
			}
		}
	}
}
