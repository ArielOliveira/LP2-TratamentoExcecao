package br.ufrn.imd.domain;

import br.ufrn.imd.exception.AcimaVelocidadeException;
import br.ufrn.imd.exception.PistaException;

public class Pista {
	Automovel a;
	
	public Pista() {
		a = new Automovel();
	}
	
	public void iniciar() throws PistaException {
		try {
			a.acelerar(121);
		} catch (AcimaVelocidadeException ave) {
			throw new PistaException();
		}
	}

}
