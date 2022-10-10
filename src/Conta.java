public class Conta implements iConta {

    private static final int AGENDA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    public Conta() {
        this.agencia = AGENDA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
    }

    protected int agencia;
    protected int numeroConta;
    protected double saldo ;

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

    }
}

