package treino.pratica.orientacaoobjetos.aulaslp2;

public class Recompensa {
    private String type;
    private int quantity;

    public Recompensa(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public String getType() { return type; }

    public int getQuantity() { return quantity; }

    @Override
    public String toString() {
        return quantity + " de " + type;
    }
}
