package Exercicio03;

import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String toString(){
        return "Nome do produto: " + nome + "\n" +
                "Preço: " + preco + "\n" +
                "Quantidade em estoque: " + quantidadeEstoque;
    }

    public void adicionarAoEstoque(int quantidade){
        quantidadeEstoque = quantidadeEstoque + quantidade;
    }
    Scanner sc = new Scanner(System.in);
    public void removerProdutosDoEstoque(int quantidade1){
        while(quantidade1 > quantidadeEstoque){
            System.out.println("Informe uma quantidade menor do que a do estoque, estoque atual: " + quantidadeEstoque);
            quantidade1 = sc.nextInt();
        }
        quantidadeEstoque = quantidadeEstoque - quantidade1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
