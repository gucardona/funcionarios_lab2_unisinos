package funcionarios;

public class FuncionarioHorista extends Funcionario {
	private double salarioPorHora;
	private int horasSemanaisTrabalhadas;
	
	public FuncionarioHorista(String nome, String cpf, double salarioPorHora, int horasSemanaisTrabalhadas) {
		super(nome, cpf);
		this.salarioPorHora = salarioPorHora;
		this.horasSemanaisTrabalhadas = horasSemanaisTrabalhadas;
	}

	public double getSalarioPorHora() {
		return salarioPorHora;
	}

	public void setSalarioPorHora(double salarioPorHora) {
		this.salarioPorHora = salarioPorHora;
	}

	public int getHorasSemanaisTrabalhadas() {
		return horasSemanaisTrabalhadas;
	}

	public void setHorasSemanaisTrabalhadas(int horasSemanaisTrabalhadas) {
		this.horasSemanaisTrabalhadas = horasSemanaisTrabalhadas;
	}
	
	public double getRendimentos() {
		if(horasSemanaisTrabalhadas > 0 && horasSemanaisTrabalhadas <= 40)
			return salarioPorHora * horasSemanaisTrabalhadas;
		
		else if(horasSemanaisTrabalhadas > 40)
			return (40 * salarioPorHora) + (horasSemanaisTrabalhadas - 40) * salarioPorHora * 1.5;
		
		return -1;
	}

}
