package edu.unq;

public class Correo {

	private String asunto;
	private String destinatario;
	private String cuerpo;

	public Correo(String destinatario, String cuerpo, String asunto) {
		this.destinatario = destinatario;
		this.cuerpo = cuerpo;
		this.asunto = asunto;
	}
}
