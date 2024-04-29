import javax.swing.JOptionPane;

public class Desafio11_Encerra_Porgrama {
    public static void main(String[] args) {
        int n, s = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um numero <br><em>(valor 10 interrompe)</em></html>"));
            s += n;
        } while (n!=10);
    }
}