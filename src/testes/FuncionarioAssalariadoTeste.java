package testes;

import funcionarios.FuncionarioAssalariado;

public class FuncionarioAssalariadoTeste {
	
	public static void main(String[] args) {
		
		FuncionarioAssalariado fa = new FuncionarioAssalariado("Natanael", "044.221.698-55", 320);
		
		System.out.println("Salario semanal do assalariado " + fa.getNome() + " é de R$ " + fa.getSalarioSemanal());
	}
}
