package questao2;

public class Conveniado implements PerfilCobranca {
    private static final int MINUTOS_GRATIS = 30;
    private static final double VALOR_HORA = 8.0;
    private static final double DESCONTO = 0.25; 

    public double calcular(int minutos) {
        int minutosCobrados = minutos - MINUTOS_GRATIS;
        if (minutosCobrados <= 0) {
            return 0;
        }
        int horasIniciadas = (minutosCobrados + 59) / 60;
        return horasIniciadas * VALOR_HORA * (1 - DESCONTO);
    }
}
