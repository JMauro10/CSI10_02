package Exercicio05;

public abstract class Pagamento {
    
    public abstract double calcularValor(double valor);

    public void exibirDetalhes(){
        System.out.println("Detalhes do pagamento");
    }
}
