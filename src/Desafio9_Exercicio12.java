import javax.swing.JOptionPane;

public class Desafio9_Exercicio12 {

    public static void main(String[] args) {
        int n, s = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um numero <br><em>(valor 0 interrompe)</em></html>"));
            s += n;
        } while (n!=0);
        JOptionPane.showMessageDialog(null, "<html>Resultado Final: <hr>" +
                "<br> Somatório vale:" + s + "</html");
    }
}
