package funcionarios;

public class FuncionarioComissionadoComSalario extends FuncionarioComissionado {
	private double salarioBase;

	public FuncionarioComissionadoComSalario(String nome, String cpf, double taxaComissao, double vendasBrutas, double salarioBase) {
		super(nome, cpf, taxaComissao, vendasBrutas);
		this.salarioBase = salarioBase;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double getRendimentos() {
		return salarioBase + (getVendasBrutas() * getTaxaComissao());
	}
}
