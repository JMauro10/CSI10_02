package Exercicio07;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString(){
        return "Nome funcionário: " + nome +  "\n" +
                "Salário: " + salario;
    }

    public double calcularBonus(){

        return salario = salario * 1.10;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
