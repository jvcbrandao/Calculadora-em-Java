import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float resultado=0;

        System.out.print("Digite o primeiro número: ");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o segundo número: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite a operação que deseja realizar:");
        System.out.println("Para multiplicação digite: *");
        System.out.println("Para divisão digite: /");
        System.out.println("Para soma digite: +");
        System.out.println("Para subtração digite: -");

        String operacao;
        do {
            limparTela();
            System.out.println("Digite a operação que deseja realizar:");
            System.out.println("Para multiplicação digite: *");
            System.out.println("Para divisão digite: /");
            System.out.println("Para soma digite: +");
            System.out.println("Para subtração digite: -");
            operacao = scanner.nextLine();
        } while (!operacao.equals("*") && !operacao.equals("/") && !operacao.equals("+") && !operacao.equals("-"));

        if (operacao.equals("+")) {
            resultado = num1 + num2;
        } else if (operacao.equals("-")) {
            resultado = num1 - num2;
        } else if (operacao.equals("*")) {
            resultado = num1 * num2;
        } else {
            if (num2 == 0) {
                do {
                    limparTela();
                    System.out.println("O segundo número deve ser não nulo");
                    System.out.print("Digite o segundo número: ");
                    num2 = Integer.parseInt(scanner.nextLine());
                } while (num2 == 0);
            } else {
                resultado = (float) num1 / num2;
            }
        }

        System.out.println("O resultado é " + resultado);

        scanner.close();
    }

    public static void limparTela() {
        for (int i = 0; i < 6; ++i) {
            System.out.println();
        }
    }
}
