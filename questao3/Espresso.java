package questao3;

public class Espresso implements Bebida {
    private static final double PRECO = 6.0;

    public String getDescricao() {
        return "Espresso";
    }
    
    public double getPreco() {
        return PRECO;
    }
}
