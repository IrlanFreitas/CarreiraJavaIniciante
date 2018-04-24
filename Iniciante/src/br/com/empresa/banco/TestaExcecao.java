package br.com.empresa.banco;

public class TestaExcecao {
	
	public static void main(String[] args) {
		System.out.println("Inicio Main");
		m1();
		System.out.println("Fim Main");
	}

	private static void m1() {
		System.out.println("Inicio M1");
		try {
			m2();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("-----------");
			System.out.println("Erro: " + e);
			// System.out.println("Indice inexistente");
			System.out.println("-----------");
		}

		System.out.println("Fim M1");
	}

	private static void m2() {
		System.out.println("Inicio M2");

		int[] num = new int[5];

			for (int i = 0; i < num.length + 3; i++) {

				num[i] = i * 2;
				System.out.println(num[i]);

			}

		System.out.println("Fim M2");
	}
	
}
