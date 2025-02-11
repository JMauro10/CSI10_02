package Exercicio05;

public class PagamentoCartao extends Pagamento {
    
    @Override
    public double calcularValor(double valor){
        return  valor * 1.02;
    }

    
}
