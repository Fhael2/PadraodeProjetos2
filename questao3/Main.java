package questao3;

public class Main {
    public static void main(String[] args) {
        Bebida pedido1 = new Espresso();

        Bebida pedido2 = new Chantilly(new Leite(new Cha()));

        Bebida pedido3 = new Calda(new Calda(new Leite(new Espresso())));

        imprimir(1, pedido1);
        imprimir(2, pedido2);
        imprimir(3, pedido3);
    }

    private static void imprimir(int numero, Bebida pedido) {
        System.out.println("Pedido " + numero + ": " + pedido.getDescricao() + " - R$ " + pedido.getPreco());
    }
}