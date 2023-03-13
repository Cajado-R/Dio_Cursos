package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
	
	public static void main(String[] args) {
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
		/*int a = 78;
		int b = 125;
		System.out.println("Olá Mundo! " + "Sua multiplicação de " + a + "X" + b + " retornou o resultado: " + (a * b) );*/
	}

}

class Livros {
	private String nome;
	private String npag;
}