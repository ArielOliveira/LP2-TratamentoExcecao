package br.ufrn.imd.domain;

import br.ufrn.imd.exception.AcimaVelocidadeException;

public class Automovel {
	private final int velocidadeMaxima = 120;
	private int velocidadeAtual;
	
	public Automovel() {
		velocidadeAtual = 0;
	}
	
	public void acelerar(int velocidade) throws AcimaVelocidadeException {
		int soma = velocidadeAtual + velocidade;
		
		if (soma > velocidadeMaxima) 
			throw new AcimaVelocidadeException();
		else 
			velocidadeAtual = soma;
	}
}
