
public class Quadrado implements AreaCalculavel{

	private int lado;
	
	@Override
	public double calculaArea() {
		return lado * lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

}
