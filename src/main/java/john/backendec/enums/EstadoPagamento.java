package john.backendec.enums;

public enum EstadoPagamento{
    PENDENTE(0),
    QUITADO(1),
    CANCELADO(2);

    private int valor;

    EstadoPagamento(int valor) {
        this.valor = valor;
    }
}
