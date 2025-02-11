package Exercicio07;

public class MainTesteFuncionario {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("José", 2000);

        funcionario1.calcularBonus();
        System.out.println(funcionario1);
        System.out.println("----------------------------------");

        Desenvolvedor funcionario2 =  new Desenvolvedor("Godofredo",3000);

        funcionario2.calcularBonus();
        System.out.println(funcionario2);
        System.out.println("----------------------------------");

        Gerente funcionario3 = new Gerente("Godofilho", 4000);
        funcionario3.calcularBonus();
        System.out.println(funcionario3);

    }
}
