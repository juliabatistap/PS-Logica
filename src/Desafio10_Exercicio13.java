import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Desafio10_Exercicio13 {
    private JButton btnCont;
    private JSlider sliInicio, sliPasso, sliFim;
    private JList<String> lstCont;
    private JLabel lblInicio, lblPasso, lblFim;
    private JPanel panel;
    private JFrame frame;

    public Desafio10_Exercicio13() {
        createUIComponents();
        panel = new JPanel(new GridLayout(4, 3));
        addComponentsToPanel(panel);

        // Configuração do JFrame
        frame = new JFrame("Desafio 10 - Exercício 13");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Adiciona um ChangeListener aos Slides
        ChangeListener sliderChangeListener = new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                updateLabels();
            }
        };

        sliInicio.addChangeListener(sliderChangeListener);
        sliPasso.addChangeListener(sliderChangeListener);
        sliFim.addChangeListener(sliderChangeListener);

        btnCont.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = sliInicio.getValue();
                int f = sliFim.getValue();
                int p = sliPasso.getValue();

                DefaultListModel<String> lista = new DefaultListModel<>();

                for (int c = i; c <= f; c += p){
                    lista.addElement(Integer.toString(c));
                }
                lstCont.setModel(lista);
            }
        });
    }

    private void addComponentsToPanel(JPanel panel) {
        panel.add(new JLabel("Início"));
        panel.add(sliInicio);
        panel.add(lblInicio);
        panel.add(new JLabel("Fim"));
        panel.add(sliFim);
        panel.add(lblFim);
        panel.add(new JLabel("Passo"));
        panel.add(sliPasso);
        panel.add(lblPasso);
        panel.add(btnCont);
        panel.add(lstCont);
    }

    private void updateLabels() {
        int i = sliInicio.getValue();
        lblInicio.setText(Integer.toString(i));
        int f = sliFim.getValue();
        lblFim.setText(Integer.toString(f));
        int p = sliPasso.getValue();
        lblPasso.setText(Integer.toString(p));
        // Atualize outros labels conforme necessário
    }

    private void createUIComponents() {
        sliInicio = new JSlider(JSlider.HORIZONTAL, 0, 5, 0);
        sliPasso = new JSlider(JSlider.HORIZONTAL, 1, 4, 1);
        lstCont = new JList<>();
        lblInicio = new JLabel("0");
        lblPasso = new JLabel("1");
        sliFim = new JSlider(JSlider.HORIZONTAL, 6, 20, 6);
        lblFim = new JLabel("6");
        btnCont = new JButton("Contar");
    }
    public static void main(String[] args) {
        new Desafio10_Exercicio13();
    }
}
