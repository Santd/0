
public class Circulo extends Figura{

	static final double PI = 3.1415;
	private double raio;
		
	public Circulo(double raio) {
		this.raio = raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public double calcularArea(double raio) {
		return PI * raio * raio;
	}
}
