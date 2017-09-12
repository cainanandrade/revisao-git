package br.unincor.exception;

import br.unincor.model.Paciente;

public class NSusInvalidoException extends Exception {
	
	private Paciente p;

	public NSusInvalidoException(Paciente p) {
		super();
		this.p = p;
	}

	@Override
	public String getMessage() {
		return "O número do SUS do paciente " + p.getDadosPessoais().getNome() + " é inválido.";
	}	
}
