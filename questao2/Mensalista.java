package questao2;

public class Mensalista implements PerfilCobranca {
    private static final double VALOR_FIXO = 150.0;

    public double calcular(int minutos) {
        return VALOR_FIXO;
    }
}
