package test;

import org.junit.jupiter.api.Test;

import funcionarios.*;
import junit.framework.TestCase;

public class FuncionariosTest extends TestCase {
	
	@Test
	public void testaFuncionariosHoristas() {
		FuncionarioHorista fh_MaiorHoras = new FuncionarioHorista("Claudio", "092.445.123-09", 18, 50);
		assertEquals((40 * fh_MaiorHoras.getSalarioPorHora()) + (fh_MaiorHoras.getHorasSemanaisTrabalhadas() - 40)
					  * (fh_MaiorHoras.getSalarioPorHora() * 1.5), fh_MaiorHoras.getRendimentos());
		
		FuncionarioHorista fh_MenorHoras = new FuncionarioHorista("Rodnei", "432.498.177-56", 20, 35);
		assertEquals(fh_MenorHoras.getSalarioPorHora() * fh_MenorHoras.getHorasSemanaisTrabalhadas(),
					 fh_MenorHoras.getRendimentos());
	}
	
	@Test
	public void testaFuncionarioAssalariado() {
		FuncionarioAssalariado fa = new FuncionarioAssalariado("Natanael", "044.221.698-55", 320);
		assertEquals(fa.getSalarioSemanal(), fa.getSalarioSemanal());
	}
	
	@Test
	public void testaFuncionarioComissionado() {
		FuncionarioComissionado fc = new FuncionarioComissionado("Robert", "099.887.487-32", 0.15, 12890);
		assertEquals(0.15 * 12890, fc.getRendimentos());
	}
	
	@Test
	public void testaFuncionarioComissionadoComSalario() {
		FuncionarioComissionadoComSalario fcs = new FuncionarioComissionadoComSalario("Edward", "509.018.478-23", 0.05, 8670, 2500);
		assertEquals(fcs.getSalarioBase() + (fcs.getVendasBrutas() * fcs.getTaxaComissao()), fcs.getRendimentos());
	}
	
	
}
