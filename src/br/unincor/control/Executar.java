package br.unincor.control;

import java.util.ArrayList;
import java.util.List;

import br.unincor.exception.LimiteException;
import br.unincor.model.ContaBancaria;
import br.unincor.model.Pessoa;
import br.unincor.view.ViewGUI;

public class Executar {

	public static void main(String[] args) {
		Transacoes t = new Transacoes();
		ViewGUI gui = new ViewGUI();
		List<ContaBancaria> listaContas = new ArrayList<ContaBancaria>();

		for (int i = 0; i < 10; i++) {
			Pessoa titular = new Pessoa("Pessoa " + i, null, "Endereço da Pessoa " + i, 35911112222L + i);

			while (titular.getIdade() == null) {
				Long idade = gui.recebeLong("Entre com a idade da Pessoa " + i);
				titular.setIdade(idade);

				if (titular.getIdade() == null)
					gui.exibeMsg("Entre com uma idade entre 16 e 65.");
			}

			ContaBancaria c = new ContaBancaria(titular, (long) i, 1L);

			Double valorDoDeposito = null;
			while (valorDoDeposito == null) {
				valorDoDeposito = gui.recebeDouble("Entre com o valor do depósito da conta " + i);
			}
			t.deposito(c, valorDoDeposito);

			listaContas.add(c);
		}

		try {
			t.transferencia(listaContas.get(6), listaContas.get(9), 100.0);
		} catch (LimiteException e) {
			gui.exibeMsg(e.getMessage());
		}

		try {
			t.saque(listaContas.get(5), 100.0);
		} catch (LimiteException e) {
			gui.exibeMsg(e.getMessage());
		}

		try {
			t.transferencia(listaContas.get(0), listaContas.get(8), 300.0);
		} catch (LimiteException e) {
			gui.exibeMsg(e.getMessage());
		}

		t.deposito(listaContas.get(5), 50.0);

		try {
			t.transferencia(listaContas.get(2), listaContas.get(1), 500.0);
		} catch (LimiteException e) {
			gui.exibeMsg(e.getMessage());
		}

		try {
			t.transferencia(listaContas.get(3), listaContas.get(1), 500.0);
		} catch (LimiteException e) {
			gui.exibeMsg(e.getMessage());
		}

		try {
			t.saque(listaContas.get(6), 75.0);
		} catch (LimiteException e) {
			gui.exibeMsg(e.getMessage());
		}

		try {
			t.transferencia(listaContas.get(8), listaContas.get(3), 100.0);
		} catch (LimiteException e) {
			gui.exibeMsg(e.getMessage());
		}

		try {
			t.transferencia(listaContas.get(8), listaContas.get(6), 100.0);
		} catch (LimiteException e) {
			gui.exibeMsg(e.getMessage());
		}

		gui.exibeMsg("--- MAIOR SALDO ---\n" + t.maiorSaldo(listaContas).toString());
		gui.exibeMsg("--- MENOR SALDO ---\n" + t.menorSaldo(listaContas).toString());
	}

}
