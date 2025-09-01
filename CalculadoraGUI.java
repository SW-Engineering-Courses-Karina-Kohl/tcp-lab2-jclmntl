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
        JLabel labelResultado = new JLabel("Resultado: ");
        
        botaoSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(campoNum1.getText());
                    int num2 = Integer.parseInt(campoNum2.getText());
                    Calculadora calc = new Calculadora();
                    int resultado = calc.dividir(num1, num2);
                    labelResultado.setText("Resultado: " + resultado);
                } catch (NumberFormatException ex) {
                    labelResultado.setText("Entrada inválida!");
                }
            }
        });
        
        panel.add(campoNum1);
        panel.add(new JLabel("+"));
        panel.add(campoNum2);
        panel.add(botaoSomar);
        panel.add(labelResultado);
        
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}