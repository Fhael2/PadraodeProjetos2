package questao3;

public class Chantilly extends Complemento {
    private static final double PRECO = 2.0;

    public Chantilly(Bebida bebida) {
        super(bebida);
    }
    public String getDescricao() {
        return bebida.getDescricao() + " + Chantilly";
    }

    public double getPreco() {
        return bebida.getPreco() + PRECO;
    }
}
