
public class Teste {

	public static void main(String[] args) {
		
		AreaCalculavel a = new Retangulo(3, 2);
		AreaCalculavel b = new Circulo(2.5);
		
		System.out.println(a.calculaArea());
		System.out.println(b.calculaArea());
		
	}
	
}
