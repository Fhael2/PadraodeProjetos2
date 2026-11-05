package questao2;

public class Rotativo implements PerfilCobranca {
    private static final double VALOR_HORA = 8.0;

    public double calcular(int minutos) {
        int horasIniciadas = (minutos + 59) / 60;
        return horasIniciadas * VALOR_HORA;
    }
}
