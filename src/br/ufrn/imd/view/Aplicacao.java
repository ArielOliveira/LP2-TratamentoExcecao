package br.ufrn.imd.view;

import br.ufrn.imd.domain.Pista;
import br.ufrn.imd.exception.PistaException;

public class Aplicacao {
	public static void main(String[] args) {
		Pista p = new Pista();
		
		try {
			p.iniciar();
		} catch (PistaException pe) {
			System.out.println(pe);
		}
	}
}
