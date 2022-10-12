import java.io.IOException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitor = new Scanner(System.in);
        int n;

        System.out.println("********************************");
        System.out.println("**  1 - Abertura de Conta     **");
        System.out.println("**  2 - Deposito              **");
        System.out.println("**  3 - Saque                 **");
        System.out.println("**  4 - Transferência         **");
        System.out.println("**  5 - Impressão de Extrato  **");
        System.out.println("********************************");

        System.out.printf("DIGITE A TRANSAÇÃO ==> ");
        n = leitor.nextInt();


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

