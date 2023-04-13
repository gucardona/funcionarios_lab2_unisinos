package testes;

import funcionarios.FuncionarioComissionado;

public class FuncionarioComissionadoTeste {
	
	public static void main(String[] args) {
		
		FuncionarioComissionado fc = new FuncionarioComissionado("Robert", "099.887.487-32", 0.15, 12890);
		
		System.out.println("Salário comissionado do " + fc.getNome() + " é de R$ " + fc.getRendimentos());
	}
}
