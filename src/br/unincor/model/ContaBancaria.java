package br.unincor.model;

public class ContaBancaria {

	private Pessoa titular;
	private Long noConta;
	private Long noAgencia;
	private Double saldo;
	private Double limite;

	public ContaBancaria(Pessoa titular, Long noConta, Long noAgencia) {
		super();
		this.titular = titular;
		this.noConta = noConta;
		this.noAgencia = noAgencia;
		this.saldo = 0.0;
		this.limite = 0.0;
	}

	public Pessoa getTitular() {
		return titular;
	}

	public void setTitular(Pessoa titular) {
		this.titular = titular;
	}

	public Long getNoConta() {
		return noConta;
	}

	public void setNoConta(Long noConta) {
		this.noConta = noConta;
	}

	public Long getNoAgencia() {
		return noAgencia;
	}

	public void setNoAgencia(Long noAgencia) {
		this.noAgencia = noAgencia;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		if (saldo >= this.limite)
			this.saldo = saldo;
		else
			this.saldo = this.limite;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		if (limite <= this.saldo)
			this.limite = limite;
		else
			this.limite = this.saldo;
	}

	@Override
	public String toString() {
		return this.titular +
				"\n\n*** DADOS DA CONTA ***\nNº da Conta: " + this.noConta +
				"\nNº da Agência: " + this.noAgencia + 
				"\nSaldo: R$" + this.saldo +
				"\nLimite: R$: " + this.limite;
	}
}
