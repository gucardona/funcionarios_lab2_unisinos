package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import funcionarios.FuncionarioAssalariado;
import funcionarios.FuncionarioComissionado;
import funcionarios.FuncionarioComissionadoComSalario;
import funcionarios.FuncionarioHorista;

public class FuncionariosTest {
	
	private FuncionarioHorista fh_MaiorHoras;
	private FuncionarioHorista fh_MenorHoras;
	private FuncionarioAssalariado fa;
	private FuncionarioComissionado fc;
	private FuncionarioComissionadoComSalario fcs;
	
	@Before
	public void criaFuncionarios() {
		fh_MaiorHoras = new FuncionarioHorista("Claudio", "092.445.123-09", 18, 50);
		fh_MenorHoras = new FuncionarioHorista("Rodnei", "432.498.177-56", 20, 35);
		fa = new FuncionarioAssalariado("Natanael", "044.221.698-55", 320);
		fc = new FuncionarioComissionado("Robert", "099.887.487-32", 0.15, 12890);
		fcs = new FuncionarioComissionadoComSalario("Edward", "509.018.478-23", 0.05, 8670, 2500);
	}

	@Test
	public void testaFuncionariosHoristas() {
		assertEquals((40 * fh_MaiorHoras.getSalarioPorHora()) + (fh_MaiorHoras.getHorasSemanaisTrabalhadas() - 40)
					  * (fh_MaiorHoras.getSalarioPorHora() * 1.5), fh_MaiorHoras.getRendimentos());
		
		assertEquals(fh_MenorHoras.getSalarioPorHora() * fh_MenorHoras.getHorasSemanaisTrabalhadas(),
					 fh_MenorHoras.getRendimentos());
	}
	
	@Test
	public void testaFuncionarioAssalariado() {
		assertEquals(320, fa.getSalarioSemanal());
	}
	
	@Test
	public void testaFuncionarioComissionado() {
		assertEquals(0.15 * 12890, fc.getRendimentos());
	}
	
	@Test
	public void testaFuncionarioComissionadoComSalario() {
		assertEquals(fcs.getSalarioBase() + (fcs.getVendasBrutas() * fcs.getTaxaComissao()), fcs.getRendimentos());
	}
	
	
}
