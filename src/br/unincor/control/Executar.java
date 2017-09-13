package br.unincor.control;

import br.unincor.exception.MortoException;
import br.unincor.exception.NSusInvalidoException;
import br.unincor.model.Paciente;
import br.unincor.view.ViewGUI;

public class Executar {

	public static void main(String[] args) {
		
		ViewGUI gui = new ViewGUI();
		Cadastro c = new Cadastro();
		Triagem t = new Triagem();
		
		try {
			Paciente p = c.cadastrar();
			
			t.aferirBpm(p);
			
			t.aferirTemp(p);
		} catch (NSusInvalidoException | MortoException e) {
			gui.exibeMsg(e.getMessage());
		}		
		
		System.out.println("midificação");
	}
		
}
