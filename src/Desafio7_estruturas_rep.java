import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Desafio7_estruturas_rep {
    private JButton btnContagem;
    private JLabel lblContagem;
    private JLabel texto;

    public Desafio7_estruturas_rep() {
        // Inicialização dos componentes
        btnContagem = new JButton("Contagem");
        lblContagem = new JLabel("Contagem: ");
        texto = new JLabel(" ");

        // Configuração do ActionListener para o botão
        btnContagem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int contador = 0;
                String contagem = "";
                while (contador < 5) {
                    contagem += contador + " ";
                    contador++;
                }
                lblContagem.setText("Contagem: " + contagem);
            }
        });

        // Criação do JFrame e adição dos componentes
        JFrame frame = new JFrame("Desafio 7 - Estruturas Repetição");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.add(texto);
        frame.add(btnContagem);
        frame.add(lblContagem);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Desafio7_estruturas_rep();
    }
}
