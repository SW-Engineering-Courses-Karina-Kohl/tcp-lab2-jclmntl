import java.util.Scanner;

public class Calculadora {


    public int somar(int num1, int num2){
        return num1+num2;
    }

    public int dividir(int num1, int num2) {
            try{
                return num1/num2; 
            } catch (ArithmeticException e){
                throw new ArithmeticException("Divisão por zero não é permitida.");
            }

    }
    
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();

        int resultado = calc.somar(num1, num2);
        System.out.println("Resultado soma: " + resultado);
        
        int resultado2 = calc.dividir(num1, num2);
        System.out.println("Resultado divisão: " + resultado2);
    }
}