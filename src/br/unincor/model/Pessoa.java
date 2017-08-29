package br.unincor.model;

public class Pessoa {

	private String nome;
	private Long idade;
	private String endereco;
	private Long telefone;

	public Pessoa(String nome, Long idade, String endereco, Long telefone) {
		super();
		if (nome.length() >= 3)
			this.nome = nome;
		
		if (idade != null && idade >= 16 && idade <= 65)
			this.idade = idade;
		
		if (endereco.length() >= 10)
			this.endereco = endereco;
		
		if (telefone.toString().length() == 10 || telefone.toString().length() == 11)
			this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() >= 3)
			this.nome = nome;
	}

	public Long getIdade() {
		return idade;
	}

	public void setIdade(Long idade) {
		if (idade != null && idade >= 16 && idade <= 65)
			this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		if (endereco.length() >= 10)
			this.endereco = endereco;
	}

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		if (telefone.toString().length() == 10 || telefone.toString().length() == 11)
			this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return "*** DADOS DA PESSOA ***\nNome: " + this.nome +
				"\nIdade: " + this.idade + 
				"\nEndereço" + this.endereco +
				"\nTelefone: " + this.telefone;
	}
}
