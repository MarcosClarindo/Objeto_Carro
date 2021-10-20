package controller;

import model.Carro;

public class GerenciamentoCarros {

	public static void main(String[] args) {
		
		// instanciando a classe carro
		
		Carro c1 = new Carro(); // ctrl + space para importar um package.
		
		// Criando um carro com o construtor simples "set")
		c1.setFabricante("VW");
		c1.setModelo("Fusca");
		c1.setAno(1977);
		c1.setMototLigado(false);
		c1.setVelocidade(0);
		
		c1.detalhes();
		
		// Criando um segundo carro com o construtor completo.
		Carro c2 = new Carro("Vw", "Kombi", 1980, false, 100 );
		
		c2.detalhes();
		
		// Criando um terceiro carro com o terceiro construtor
		Carro c3 = new Carro("Chevrolet", "Opala", 1988);
		
		c3.detalhes();
		
		System.out.println(c1.situacaoMotor()); // Fazendo a chamada do método direto, quando ele tem um retorno.
		System.out.println(c2.situacaoMotor());
		System.out.println(c3.situacaoMotor());
		
		System.out.println();
		
		System.out.println(c1.ligarMotor());
		System.out.println(c2.ligarMotor());
		System.out.println(c3.ligarMotor());
		
		System.out.println();
		
		System.out.println(c2.desLigarMotor());
		
		System.out.println();
		
		System.out.println(c1.situacaoMotor()); 
		System.out.println(c2.situacaoMotor());
		System.out.println(c3.situacaoMotor());
		
		System.out.println();
		
		System.out.println(c3.acelerar(30));
		System.out.println(c3.acelerar(30));
		
		System.out.println();
		
		System.out.println(c3.frear(20));
		
	}

}
