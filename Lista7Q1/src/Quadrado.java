
public class Quadrado extends Figura{
	
	private double lado;
	
	public Quadrado(double lado){
		this.lado = lado;
	}
	
	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public double calcularArea(double lado) {
		return lado * lado;
	}
}
