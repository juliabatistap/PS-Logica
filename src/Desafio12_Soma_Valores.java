import javax.swing.*;

public class Desafio12_Soma_Valores {
    public static void main(String[] args) {
        int resultado = 0;
        for (int i = 0 ; i >=0 ; i++){
            resultado += i;
        }
        JOptionPane.showMessageDialog(null, "<html>Resultado Final: <hr>" +
                "<br> Somatório vale:" + resultado + "</html");
    }
}
