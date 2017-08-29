package br.unincor.exception;

import br.unincor.model.Paciente;

public class MortoException extends Exception {

	private Paciente p;

	public MortoException(Paciente p) {
		super();
		this.p = p;
	}

	@Override
	public String getMessage() {
		return "O paciente " + p.getDadosPessoais().getNome() + " morreu.";
	}
	
}
