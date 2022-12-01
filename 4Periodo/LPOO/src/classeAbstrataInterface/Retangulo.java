package classeAbstrataInterface;

public class Retangulo extends ElementoGeometrico {

	private double lado1, lado2;

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public Retangulo(double x, double y) {
		super(x, y);
	}

	@Override
	public String desenhar() {
		return "O ret�ngulo est� sendo desenhado.";
	}

	@Override
	public void redimensionar(double elem) {
		lado1 = (lado1 * elem);
		lado2 = (lado2 * elem);
	}

	@Override
	public double area() {
		return (lado1 * lado2);
	}

	@Override
	public double perimetro() {
		return ((2 * lado1) + (2 * lado2));
	}

}
