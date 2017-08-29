package br.unincor.exception;

import br.unincor.model.ContaBancaria;

public class LimiteException extends Exception {

	private ContaBancaria c;

	public LimiteException(ContaBancaria c) {
		super();
		this.c = c;
	}

	@Override
	public String getMessage() {
		return "A conta do titular " + c.getTitular().getNome() + " estourou o limite para esta operação.";
	}
	
}
