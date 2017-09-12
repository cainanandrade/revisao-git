package br.unincor.control;

import br.unincor.exception.NSusInvalidoException;
import br.unincor.model.Paciente;
import br.unincor.model.Pessoa;
import br.unincor.view.ViewGUI;

public class Cadastro {
	
	private ViewGUI gui;

	public Cadastro() {
		super();
		this.gui = new ViewGUI();
	}
	
	public Paciente cadastrar() throws NSusInvalidoException {
		Pessoa pessoa = new Pessoa(gui.recebeString("Nome"),
				gui.recebeLong("Idade"),
				gui.recebeString("Endereço"),
				gui.recebeLong("Telefone"));
		
		Paciente paciente = new Paciente(pessoa,
				gui.recebeLong("Número do SUS"),
				gui.recebeBoolean("Alergia?"),
				gui.recebeBoolean("Necessidades especiais?"),
				null, null);
		
//		String strNSus = paciente.getNoSUS().toString();
//		
//		if(strNSus.length() == 14 && strNSus.startsWith("9") && !paciente.getPne()
//			|| strNSus.length() == 14 && strNSus.startsWith("1") && paciente.getPne()) {
//			return paciente;
//		} else {
//			throw new NSusInvalidoException(paciente);
//		}
		
		validaNSus(paciente);
		
		return paciente;
	}
	
	private void validaNSus(Paciente paciente) throws NSusInvalidoException {
		String strNSus = paciente.getNoSUS().toString();
		
		if(strNSus.length() == 14 && strNSus.startsWith("9") && !paciente.getPne()
			|| strNSus.length() == 14 && strNSus.startsWith("1") && paciente.getPne()) {

		} else {
			throw new NSusInvalidoException(paciente);
		}
	}
}






















