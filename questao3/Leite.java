package questao3;

public class Leite extends Complemento {
    private static final double PRECO = 2.0;

    public Leite(Bebida bebida) {
        super(bebida);
    }

    public String getDescricao() {
        return bebida.getDescricao() + " + Leite";
    } 
    
    public double getPreco() {
        return bebida.getPreco() + PRECO;
    }
}
