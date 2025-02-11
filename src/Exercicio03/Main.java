package Exercicio03;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nome = sc.next();
        System.out.println("Digite o preço do produto: ");
        double preco = sc.nextDouble();
        System.out.println("Digite a quantidade do produto: ");
        int quantidade = sc.nextInt();

        Produto produto1 = new Produto(nome, preco, quantidade);
        System.out.println(produto1);

        System.out.println("Quantas unidades deseja adicionar ao estoque? ");
        quantidade = sc.nextInt();
        produto1.adicionarAoEstoque(quantidade);

        System.out.println(produto1);

        System.out.println("Quantas unidades deseja remover do estoque? ");
        quantidade = sc.nextInt();
        produto1.removerProdutosDoEstoque(quantidade);

        System.out.println(produto1);


        }
    }
