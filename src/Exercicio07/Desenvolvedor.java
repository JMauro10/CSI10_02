package Exercicio07;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus(){
        setSalario(getSalario() * 1.15);
        return getSalario();
    }
}
