package questao1;

import java.util.HashSet;
import java.util.Set;

public class Vendas implements Observador {
    
    private Set<String> zerados = new HashSet<>();

    public void atualizar(String nomeProduto, int novaQuantidade) {
        if (novaQuantidade == 0) {
            zerados.add(nomeProduto);
        } else if (zerados.remove(nomeProduto)) {
            System.out.println("[Vendas] ALERTA: " + nomeProduto + " voltou ao estoque (" + novaQuantidade + " un.)");
        }
    }
}
