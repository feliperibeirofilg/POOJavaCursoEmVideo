import java.util.Scanner;

// CONTA BANCO
// Abrir conta (Poupanca e corrente)
//2 usuarios
// um tem 300
//o outro tem 500
// sacar dinheiro
public class BancoBB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Metodos metodos = new Metodos();
    int op = 0;

do {
    System.out.println("Selecione uma opcao:" +
            "1 - Adicionar conta." +
            "2 - Adicionar saldo." +
            "3 - Sacar dinheiro" +
            "0 - sair");

    op = scanner.nextInt();

    switch (op) {
        case 1:
            metodos.adicionarConta();
            break;
        case 2:
            metodos.adicionarSaldo();
            break;
        case 3:
            metodos.sacarValor();
            break;

        case 0:
            System.out.println("saindo");
            break;
    }
}
    while (op != 0);
        scanner.close();
}
}