public class Main {
    public static void main(String[] args) {

        Cliente vantuir = new Cliente();
        vantuir.setNome("Luiz Vantuir");

        Conta cc = new CCorrente(vantuir);
        Conta poupanca = new CPoupanca(vantuir);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc.depositar(200.00);
        poupanca.depositar(150.00);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc.transferir(5.00,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();


    }
}
