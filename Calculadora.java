import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        double num1;
        double num2;
        String op;

        boolean continuarSoma;

        do {
            System.out.println("Digite um numero: ");
            num1 = tec.nextInt();

            System.out.println("Escolha a operação: [+] [-] [*] [/]");
            op = tec.next();

            System.out.println("Digite um numero: ");
            num2 = tec.nextInt();

            System.out.println("Resultado: " + operacao(num1,op,num2));
            continuarSoma = continuarSoma();
        } while (continuarSoma);

    }

    public static boolean continuarSoma() {
        Scanner tec = new Scanner(System.in);
        System.out.println("Deseja continuar somando? (S/N)");
        return !tec.nextLine().toUpperCase(Locale.ROOT).equals("N");
    }

    public static Double operacao(double num1,String op,double num2) {
        double soma = 0.0;

        switch (op) {
            case "+":
                soma = num1 + num2;
                break;
            case "-":
                soma = num1 - num2;
                break;
            case "*":
                soma = num1 * num2;
                break;
            case "/":
                soma = num1 / num2;
                break;
            default:
                System.out.println("Operação invalida.");
        }
        return soma;
    }
}