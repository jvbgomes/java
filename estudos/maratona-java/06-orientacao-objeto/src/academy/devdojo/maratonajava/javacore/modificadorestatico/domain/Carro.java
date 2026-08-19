package academy.devdojo.maratonajava.javacore.modificadorestatico.domain;

public class Carro {
    private String name;
    private double maxVelocity;
    public static double limitVelocity = 250; //Ao utilizar o modificador de acesso static ser utilizado
// temos que agora limitVelocity nao pertence mais a um objeto em si e sim a classe Carro

    public Carro(String name, double maxVelocity) {
        this.name = name;
        this.maxVelocity = maxVelocity;
    }

    public void imprime() {
        System.out.println("----------------");
        System.out.println("Nome " + this.name);
        System.out.println("Velocidade maxima " + this.maxVelocity);
        System.out.println("Velocidade limite " + Carro.limitVelocity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxVelocity() {
        return maxVelocity;
    }

    public void setMaxVelocity(double maxVelocity) {
        this.maxVelocity = maxVelocity;
    }
}
