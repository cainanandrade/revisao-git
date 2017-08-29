package br.unincor.control;

import br.unincor.exception.MortoException;
import br.unincor.model.Paciente;

public class Triagem {
	
	public void aferirTemp(Paciente p) throws MortoException {
		//Simulando cadastro da temperatura
		Double temp = Math.random()*8+34; //Gerando uma temperatura aleatória entre 34 e 42
		
		if(temp < 35 || temp > 41)
			throw new MortoException(p);
		else
			p.setTemperatura(temp);
	}
	
	public void aferirBpm(Paciente p) throws MortoException {
		//Simulando cadastro da BPM
		Double bpm = Math.random()*200; //Gerando uma BPM aleatória entre 0 e 200
		
		if(bpm < 30 || bpm > 160)
			throw new MortoException(p);
		else
			p.setBpm(bpm);
	}
	
}
