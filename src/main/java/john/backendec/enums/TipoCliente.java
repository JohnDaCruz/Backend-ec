package john.backendec.enums;

public enum TipoCliente{
    PESSOAFISICA(0),
    PESSOAJURIDICA(1);

    private int valor;

    TipoCliente(int valor) {
        this.valor = valor;
    }
}