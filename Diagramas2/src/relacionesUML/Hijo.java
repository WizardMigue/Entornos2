package relacionesUML;

public class Hijo {

	private String nombre;
	private Madre madre;
	
	public Hijo(String nombre, Madre madre) {
		super();
		this.nombre = nombre;
		this.madre = madre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Madre getMadre() {
		return madre;
	}
	public void setMadre(Madre madre) {
		this.madre = madre;
	}

	
	

}
