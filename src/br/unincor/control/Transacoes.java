package br.unincor.control;

import java.util.List;

import br.unincor.exception.LimiteException;
import br.unincor.model.ContaBancaria;

public class Transacoes {
	
	public void saque(ContaBancaria c, Double valor) throws LimiteException {
		Double saldoDepois = c.getSaldo() - valor;
		
		if(saldoDepois >= c.getLimite()) {
			c.setSaldo(saldoDepois);
		} else {
			throw new LimiteException(c);
		}
	}
	
	public void deposito(ContaBancaria c, Double valor) {
		c.setSaldo(c.getSaldo() + valor);
	}

	public void transferencia(ContaBancaria c1, ContaBancaria c2, Double valor) throws LimiteException {
		saque(c1, valor);
		deposito(c2, valor);
	}
	
	public ContaBancaria maiorSaldo(List<ContaBancaria> listaContas) {
		ContaBancaria maior = listaContas.get(0);

		for (int i = 0; i < listaContas.size(); i++) {
			if(listaContas.get(i).getSaldo() > maior.getSaldo())
				maior = listaContas.get(i);
		}

		return maior;
	}

	public ContaBancaria menorSaldo(List<ContaBancaria> listaContas) {
		ContaBancaria menor = listaContas.get(0);

		for (int i = 0; i < listaContas.size(); i++) {
			if(listaContas.get(i).getSaldo() < menor.getSaldo())
				menor = listaContas.get(i);
		}

		return menor;
	}
}
