package questao3;

public class Cha implements Bebida {
    private static final double PRECO = 4.5;
    
    public String getDescricao() {
        return "Chá";
    } 

    public double getPreco() {
        return PRECO;
    }
}
