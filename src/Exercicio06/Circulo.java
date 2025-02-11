package Exercicio06;

public class Circulo implements Forma {
    
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public void exibirArea(){
        System.out.println("Área do círculo: " + calcularArea());
    }
}
