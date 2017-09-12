package br.unincor.model;

public class Paciente {

	private Pessoa dadosPessoais;
	private Long noSUS; //Número de cadastro no SUS
	private Boolean alergia; //Portador de alguma alergia
	private Boolean pne; //Portador de necessidades especiais 
	private Double temperatura; //Temperatura medida na triagem
	private Double bpm; //Batimentos medidos na triagem
	
	public Paciente(Pessoa dadosPessoais, Long noSUS, Boolean alergia, Boolean pne, Double temperatura,
			Double bpm) {
		super();
		this.dadosPessoais = dadosPessoais;
		this.noSUS = noSUS;
		this.alergia = alergia;
		this.pne = pne;
		this.temperatura = temperatura;
		this.bpm = bpm;
	}
	
	public Pessoa getDadosPessoais() {
		return dadosPessoais;
	}
	public void setDadosPessoais(Pessoa dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}
	public Long getNoSUS() {
		return noSUS;
	}
	public void setNoSUS(Long noSUS) {
		this.noSUS = noSUS;
	}
	public Boolean getAlergia() {
		return alergia;
	}
	public void setAlergia(Boolean alergia) {
		this.alergia = alergia;
	}
	public Boolean getPne() {
		return pne;
	}
	public void setPne(Boolean pne) {
		this.pne = pne;
	}
	public Double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(Double temperatura) {
		this.temperatura = temperatura;
	}
	public Double getBpm() {
		return bpm;
	}
	public void setBpm(Double bpm) {
		this.bpm = bpm;
	}

	@Override
	public String toString() {
		return "Paciente [dadosPessoais=" + dadosPessoais + ", noSUS=" + noSUS + ", alergia=" + alergia + ", pne=" + pne
				+ ", temperatura=" + temperatura + ", bpm=" + bpm + "]";
	}
}
