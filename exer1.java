
import javax.swing.JOptionPane;

public class exer1 {
    public static void main(String[] args) {
        String idade =  JOptionPane.showInputDialog("DIGITE SUA IDADE:");
        int v1 = Integer.parseInt(idade);
        String relatorio = "";
        if (v1 >= 18) {
            relatorio = "voce está abto a tirar CNH";
        } else {
            relatorio = "voce não está obto para retirar a CNH";
        }
        JOptionPane.showMessageDialog(null, relatorio);
        System.exit(0);
    }
}
