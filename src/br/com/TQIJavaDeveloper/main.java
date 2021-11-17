package br.com.TQIJavaDeveloper;

import br.com.TQIJavaDeveloper.model.Gato;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gato gato = new Gato();
		Livros livros = new Livros();
		/*int n1 = 20;
		int n2 = 10;
		
		System.out.print("Hello World!" + (n1+n2));*/
		System.out.println(gato);
		System.out.println(livros);
	}

}

class Livros{
	private String nome;
	private String npag;
}
