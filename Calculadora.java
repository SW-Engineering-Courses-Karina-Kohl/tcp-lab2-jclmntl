public class Calculadora {

    public int somar(int num1, int num2) {
        return num1 + num2;
    }

    public int dividir(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Calculadora calc = new Calculadora();

        try {
            System.out.println("Digite o primeiro número:");
            int num1 = scanner.nextInt();

            System.out.println("Digite o segundo número:");
            int num2 = scanner.nextInt();

            int resultadoSoma = calc.somar(num1, num2);
            System.out.println("Soma: " + resultadoSoma);

            int resultadoDivisao = calc.dividir(num1, num2);
            System.out.println("Divisão: " + resultadoDivisao);

        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Entrada inválida. Digite apenas números inteiros.");
        } finally {
            scanner.close();
        }
    }
}