import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Integer numero = 1021;
        String agencia = "067-8";
        String nomeCliente = "Mario Andrade";
        Double saldo = 237.48;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor digite o numero da conta: ");
        numero = sc.nextInt();
        System.out.println("Por favor digite o numero da agencia: ");
        agencia = sc.next();
        System.out.println();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco -  "
        + numero+ " sua agencia é: "+ agencia + " e seu saldo é: "+ saldo + ", Já estão disponivel para saque!");
      
        
        
        
    }
}
