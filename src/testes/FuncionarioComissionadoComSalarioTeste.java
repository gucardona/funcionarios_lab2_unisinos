package testes;

import funcionarios.FuncionarioComissionadoComSalario;

public class FuncionarioComissionadoComSalarioTeste {
	
	public static void main(String[] args) {
		
		FuncionarioComissionadoComSalario fcs = new FuncionarioComissionadoComSalario("Edward", "509.018.478-23", 0.05, 8670, 2500);
		
		
		System.out.println("Salário comissionado(com salário base) do " + fcs.getNome() + " é de R$ " + fcs.getRendimentos());
	}
}
