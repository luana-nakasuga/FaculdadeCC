package classeAbstrataInterface;

public class Circulo extends ElementoGeometrico {

	public Circulo(double x, double y) {
		super(x, y);
	}

	private double raio;

	@Override
	public String desenhar() {
		return "O c�rculo est� sendo desenhado.";
	}

	@Override
	public void redimensionar(double elem) {
		this.raio = this.raio * elem;
	}

	@Override
	public double area() {
		return (Math.PI * Math.pow(raio, 2));
	}

	@Override
	public double perimetro() {
		return (2 * Math.PI * this.raio);
	}

}
