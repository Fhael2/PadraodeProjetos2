package questao1;

public class Auditoria implements Observador {
    
    public void atualizar(String nomeProduto, int novaQuantidade) {
        System.out.println("[Auditoria] " + nomeProduto + " -> nova quantidade: " + novaQuantidade);
    }
}
