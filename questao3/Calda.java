package questao3;

public class Calda extends Complemento {
    private static final double PRECO = 2.5;

    public Calda(Bebida bebida) {
    super(bebida);
    }

    public String getDescricao() {
    return bebida.getDescricao() + " + Calda";
    }

    public double getPreco() {
    return bebida.getPreco() + PRECO;
    }
}
