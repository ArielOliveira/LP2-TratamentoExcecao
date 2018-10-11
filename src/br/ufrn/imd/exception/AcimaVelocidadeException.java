package br.ufrn.imd.exception;

public class AcimaVelocidadeException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public String getMessage() {
		return "Excedeu a velocidade máxima!";
	}
	
}
