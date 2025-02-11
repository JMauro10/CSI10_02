package Exercicio05;

public class MainTestePagamento {
    public static void main(String[] args) {
        
        Pagamento PagamentoCartao = new PagamentoCartao();
        Pagamento PagamentoBoleto = new PagamentoBoleto();

        double valorCartao = 100.0;
        double valorBoleto = 100.0;

        System.out.println("Pagamento com cartão: ");
        System.out.println("Valor original: " + valorCartao);
        System.out.println("Valor com juros: " + PagamentoCartao.calcularValor(valorCartao));
        PagamentoCartao.exibirDetalhes();

        System.out.println("Pagamento com boleto: ");
        System.out.println("Valor original: " + valorBoleto);
        System.out.println("Valor com juros: " + PagamentoBoleto.calcularValor(valorBoleto));
        PagamentoBoleto.exibirDetalhes();
    }
}
