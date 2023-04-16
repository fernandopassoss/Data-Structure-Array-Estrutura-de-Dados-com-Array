package atvVeV;

import java.util.Scanner;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String nome, cpf, rg;
		
		Pessoa pessoa1 = new Pessoa("Fernando", "4002", "2000");
		Pessoa pessoa2 = new Pessoa("Apolo", "9999", "1911");
		Pessoa pessoa3 = new Pessoa("Veveta", "2222", "9922");
		
		ListaPessoas lista = new ListaPessoas();
		
		lista.adicionar(pessoa1);
		lista.adicionar(pessoa2);
		lista.adicionar(pessoa3);
		lista.remover(0);
		
		System.out.println(lista.get(0));
		System.out.println(lista.get(1));
	
		
		
	}

}
