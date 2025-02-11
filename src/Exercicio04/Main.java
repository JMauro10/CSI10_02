package Exercicio04;

public class Main {
    public static void main(String[] args) {

        Veiculo moto1 = new Moto("ducatti","z1",2021,2000);
        moto1.exibirDetalhes();

        Veiculo carro1 = new Carro("Ferrari", "La ferrari", 2023, 5000);
        carro1.exibirDetalhes();
    }
}
