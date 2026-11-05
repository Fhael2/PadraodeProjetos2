package questao1;

public class Main {
    public static void main(String[] args) {
        Produto mouse = new Produto("Mouse", 10);

        Compras compras = new Compras();
        Vendas vendas = new Vendas();
        Auditoria auditoria = new Auditoria();

        mouse.adicionarObservador(compras);
        mouse.adicionarObservador(vendas);
        mouse.adicionarObservador(auditoria);

        System.out.println("=== baixa para 4 ===");
        mouse.setQuantidade(4);

        System.out.println("=== mesma quantidade (nada deve acontecer) ===");
        mouse.setQuantidade(4);

        System.out.println("=== zera o estoque ===");
        mouse.setQuantidade(0);

        System.out.println("=== repõe o estoque ===");
        mouse.setQuantidade(20);

        System.out.println("=== remove Compras ===");
        mouse.removerObservador(compras);

        System.out.println(" === baixa para 2 (Compras não recebe mais) ===");
        mouse.setQuantidade(2);
    }
}
