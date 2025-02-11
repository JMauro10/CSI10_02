package Exercicio06;

import java.util.Scanner;

public class MainTesteFormas {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

       System.out.println("Digite o valor da base do retangulo:");
       double base = sc.nextDouble();
       System.out.println("Digite o valor da altura do retangulo:");
       double altura = sc.nextDouble();

        Retangulo retangulo = new Retangulo(base, altura);

        retangulo.exibirArea();
        System.out.println("------------------------------------");

        System.out.println("Digite o valor da base do triangulo: ");
        double base1 = sc.nextDouble();
        System.out.println("Digite o valor da altura do triangulo: ");
        double altura1 = sc.nextDouble();

        Triangulo triangulo = new Triangulo(base1, altura1);

        triangulo.exibirArea();
        System.out.println("------------------------------------");

        System.out.println("Digite o valor do raio do circulo: ");
        double raio = sc.nextDouble();

        Circulo circulo = new Circulo(raio);

        circulo.exibirArea();
    }
}
