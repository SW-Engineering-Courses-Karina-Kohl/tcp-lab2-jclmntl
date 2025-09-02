import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        JPanel panel = new JPanel();

        JTextField campoNum1 = new JTextField(10);
        JTextField campoNum2 = new JTextField(10);
        JButton botaoSomar = new JButton("Somar");
        JButton botaoDividir = new JButton("Dividir");
        JLabel labelResultado = new JLabel("Resultado: ");

        Calculadora calc = new Calculadora();

        // Listener do botão SOMAR
        botaoSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(campoNum1.getText());
                    int num2 = Integer.parseInt(campoNum2.getText());
                    int resultado = calc.somar(num1, num2);
                    labelResultado.setText("Resultado: " + resultado);
                } catch (NumberFormatException ex) {
                    labelResultado.setText("Erro: insira apenas números inteiros.");
                }
            }
        });

        // Listener do botão DIVIDIR
        botaoDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(campoNum1.getText());
                    int num2 = Integer.parseInt(campoNum2.getText());
                    int resultado = calc.dividir(num1, num2);
                    labelResultado.setText("Resultado: " + resultado);
                } catch (NumberFormatException ex) {
                    labelResultado.setText("Erro: insira apenas números inteiros.");
                } catch (ArithmeticException ex) {
                    labelResultado.setText("Erro: " + ex.getMessage());
                }
            }
        });

        panel.add(new JLabel("Número 1:"));
        panel.add(campoNum1);
        panel.add(new JLabel("Número 2:"));
        panel.add(campoNum2);
        panel.add(botaoSomar);
        panel.add(botaoDividir);
        panel.add(labelResultado);
        
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}