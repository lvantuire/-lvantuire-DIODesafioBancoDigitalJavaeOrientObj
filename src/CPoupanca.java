public class CPoupanca extends Conta {

    public CPoupanca (Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("====Extrato Conta Poupança====");
        imprimirInfosComuns();
    }



}
