package br.unincor.view;

import javax.swing.JOptionPane;

import br.unincor.model.ContaBancaria;

public class ViewGUI {

	public void exibeMsg(String texto) {
		JOptionPane.showMessageDialog(null, texto);
	}

	public void exibeErroTransacao(ContaBancaria c) {
		JOptionPane.showMessageDialog(null, "Erro na transação da conta\n\n" + c.getTitular());
	}

	public String recebeString(String texto) {
		String resposta = JOptionPane.showInputDialog(texto);
		return resposta;
	}

	public Double recebeDouble(String texto) {
		try {
			String resposta = JOptionPane.showInputDialog(texto);
			Double respostaConvertida = Double.parseDouble(resposta);
			return respostaConvertida;
		} catch (Exception e) {
			exibeMsg("Entrada inválida!");
		}
		return null;
	}

	public Long recebeLong(String texto) {
		try {
			String resposta = JOptionPane.showInputDialog(texto);
			Long respostaConvertida = Long.parseLong(resposta);
			return respostaConvertida;
		} catch (Exception e) {
			exibeMsg("Entrada inválida!");
		}
		return null;
	}
}



















