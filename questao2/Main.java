package questao2;

public class Main {
    public static void main(String[] args) {
        int minutos = 150;

        Tiquete t1 = new Tiquete("ABC-1234", minutos, new Rotativo());
        Tiquete t2 = new Tiquete("DEF-5678", minutos, new Mensalista());
        Tiquete t3 = new Tiquete("GHI-9012", minutos, new Conveniado());

        System.out.println("Permanência: " + minutos + " minutos");
        System.out.println("Rotativo: R$ " + t1.calcularValor());
        System.out.println("Mensalista: R$ " + t2.calcularValor());
        System.out.println("Conveniado: R$ " + t3.calcularValor());

        System.out.println();
        System.out.println("Trocando o perfil do tíquete " + t1.getPlaca());
        System.out.println("Antes (Rotativo): R$ " + t1.calcularValor());
        t1.setPerfil(new Conveniado());
        System.out.println("Depois (Conveniado): R$ " + t1.calcularValor());
        t1.setPerfil(new Mensalista());
        System.out.println("Depois (Mensalista): R$ " + t1.calcularValor());
    }
}