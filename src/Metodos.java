import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Metodos {
    Banco banco = new Banco();

    Scanner scanner = new Scanner(System.in);

    List<Banco> bancoList = new ArrayList<>();

    public Banco adicionarConta() {
        Banco novaConta = new Banco();
        if (!banco.getStatus()) {
            System.out.println("Adicione o nome do cliente: ");
            banco.setNome(scanner.nextLine());
            System.out.println("Adicione o tipo de conta: ");
            banco.setTipoConta(scanner.nextLine());
            bancoList.add(novaConta);

        }else{
            System.out.println("Banco existente");
        }
        return novaConta;
    }

    public Float adicionarSaldo(){
        String nome;
        System.out.println("Qual o nome do cliente? ");
        nome = scanner.nextLine();

        for(Banco cliente : bancoList) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Qual o valor adicionar? ");
                float valorAdicionar =scanner.nextFloat();
                cliente.setSaldo(cliente.getSaldo() + valorAdicionar);
                System.out.println("Saldo atualizado: " +cliente.getSaldo());
            }
        }
        System.out.println("Cliente n encontrado");
        return banco.getSaldo();
    }

    public Float sacarValor(){

        System.out.println("Quanto vc gostaria de sacar??? ");
        float valorSaque = scanner.nextFloat();
        if(banco.getSaldo() >= valorSaque){
            banco.setSaldo(banco.getSaldo() - valorSaque);
            System.out.println("Saque realizado. Novo saldo: " +banco.getSaldo());
        }else{
            System.out.println("Saldo insuficiente. Saldo atual: " +banco.getSaldo());
        }
        return banco.getSaldo();
    }
    private int gerarNumeroConta(){
        return (int)(Math.random() * 1000000); // Gera um número de conta aleatório
    }
}
