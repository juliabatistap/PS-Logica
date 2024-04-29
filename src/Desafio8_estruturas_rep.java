import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Desafio8_estruturas_rep {
    private JLabel lblFatorial;
    private JSpinner txtN;

    public Desafio8_estruturas_rep() {
        lblFatorial = new JLabel(" ");
        // Configura o JSpinner para aceitar valores inteiros
        txtN = new JSpinner(new SpinnerNumberModel(1, 1, 12, 1));

        // Adiciona um ChangeListener ao JSpinner para detectar mudanças no valor
        txtN.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                int n = (int) txtN.getValue();
                int f = 1;
                int c = n;

                while (c >= 1) {
                    f *= c;
                    c--;
                }

                lblFatorial.setText(Integer.toString(f));
            }
        });
        JFrame frame = new JFrame("Desafio 8 - Estruturas Repetição");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.add(txtN);
        frame.add(new JLabel("!="));
        frame.add(lblFatorial);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Desafio8_estruturas_rep();
    }
}
