package relacionesUML;

public class Dinero {

	private double cantidad;
	private String monedas;
	
	public Dinero(double cantidad, String monedas) {
		super();
		this.cantidad = cantidad;
		this.monedas = monedas;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public String getMonedas() {
		return monedas;
	}

	public void setMonedas(String monedas) {
		this.monedas = monedas;
	}

}
