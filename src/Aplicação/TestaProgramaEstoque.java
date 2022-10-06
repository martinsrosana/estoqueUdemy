package Aplicação;

import java.util.Scanner;

import Entidades.Produto;

public class TestaProgramaEstoque {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println(" Entre com o produto");
		System.out.println("nome");
		String nome = scanner.nextLine();
		System.out.println("Preço");
		double preco = scanner.nextDouble();
		System.out.println("Quantidade: ");
		int quantidade= scanner.nextInt();
		
		Produto produto = new Produto(nome, preco, quantidade);
		
		System.out.println();
	    System.out.println("Dados do Estoque: " +produto);
	    
	    System.out.println();
	    System.out.println("Entre com o numero de produtos para adicionar ao estoque: ");
	    quantidade = scanner.nextInt();
	    produto.addProdutos(quantidade);
	    
	    System.out.println();
	    System.out.println("Dados atualizados do Estoque: " +produto);
	    
	    System.out.println();
	    System.out.println("Entre com o numero de produtos para remover do estoque: ");
	    quantidade = scanner.nextInt();
	    produto.removerProdutos(quantidade);
	    
	    System.out.println();
	    System.out.println("Dados atualizados do Estoque: " +produto);
		
		//System.out.println(produto.nome+ " , " +produto.preco+ " , " + produto.quantidade);
		
		
		
		
		scanner.close();
	}

}
