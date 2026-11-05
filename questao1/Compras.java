package questao1;

public class Compras implements Observador {
    private static final int ESTOQUE_MINIMO = 5;

    public void atualizar(String nomeProduto, int novaQuantidade) {
        if (novaQuantidade < ESTOQUE_MINIMO) {
            System.out.println("[Compras] ALERTA: " + nomeProduto + " com estoque baixo (" + novaQuantidade + " un.)");
        }
    }
}
