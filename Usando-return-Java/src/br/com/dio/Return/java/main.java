package br.com.dio.Return.java;



public class main {

	public static void main(String[] args) {
		System.out.println("\t\t\t\t<----Exercicio de retornos---->");

		double areaQuadrado = Quadrilatero.area(3);
				System.out.println("área do quadrado: "+areaQuadrado);
				
				double areaRetangulo = Quadrilatero.area(5, 5);
				System.out.println("área do retangulo: "+areaRetangulo );
	}

}
