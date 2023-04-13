package testes;

import funcionarios.FuncionarioHorista;

public class FuncionarioHoristaTeste {

	public static void main(String[] args) {
		
		FuncionarioHorista fh_MenorHoras = new FuncionarioHorista("Rodnei", "432.498.177-56", 20, 35);
		FuncionarioHorista fh_MaiorHoras = new FuncionarioHorista("Claudio", "092.445.123-09", 18, 50);
		
		System.out.println("Rendimento semanal do horista " + fh_MenorHoras.getNome() + " que trabalhou " + fh_MenorHoras.getHorasSemanaisTrabalhadas() +
							"\nR$ " + fh_MenorHoras.getRendimentos());
		
		System.out.println("Rendimento semanal do horista " + fh_MaiorHoras.getNome() + " que trabalhou " + fh_MaiorHoras.getHorasSemanaisTrabalhadas() +
							"\nR$ " + fh_MaiorHoras.getRendimentos());
		
	}
}
