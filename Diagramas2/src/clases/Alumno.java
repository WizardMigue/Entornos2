package clases;

public class Alumno extends Persona {

	String expediente;
	private String atribPrivado;
	public String atribPublico;
	protected String atribProtected;

	protected void metodoProtected() {
		
	}

	protected void metodoDefault() {
		
	}

	public String getAtribPrivado() {
		return atribPrivado;

	}

	public String getExpediente() {
		return expediente;
	}

	public void setExpediente(String expediente) {
		this.expediente = expediente;
	}

	public Alumno(String expediente) {
		super();
		this.expediente = expediente;
	}

}
