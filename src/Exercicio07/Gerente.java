package Exercicio07;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus(){
        setSalario(getSalario() * 1.20);
        return getSalario();
    }
}
