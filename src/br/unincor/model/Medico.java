package br.unincor.model;

public class Medico {

	private Pessoa dadosPessoais;
	private Long noCRM; //Número de registro no Conselho Regional de Medicina
	private String especialidade;
	private Double salario;
	
	public Medico(Pessoa dadosPessoais, Long noCRM, String especialidade, Double salario) {
		super();
		this.dadosPessoais = dadosPessoais;
		this.noCRM = noCRM;
		this.especialidade = especialidade;
		this.salario = salario;
	}
	
	public Pessoa getDadosPessoais() {
		return dadosPessoais;
	}
	public void setDadosPessoais(Pessoa dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}
	public Long getNoCRM() {
		return noCRM;
	}
	public void setNoCRM(Long noCRM) {
		this.noCRM = noCRM;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Medico [dadosPessoais=" + dadosPessoais + ", noCRM=" + noCRM + ", especialidade=" + especialidade
				+ ", salario=" + salario + "]";
	}
	
}
