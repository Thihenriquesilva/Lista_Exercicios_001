import javax.swing.JOptionPane;

public class IdadeEmDias2 {
    public static void main(String[] args) {
        int anos =0, mes=0, dias =0;
        JOptionPane.showMessageDialog(
        null, 
        "Informe a sua idade.");
        anos = Integer.parseInt(JOptionPane.showInputDialog(null, "Anos"));
        mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Meses."));
        dias = Integer.parseInt(JOptionPane.showInputDialog(null, "Dias"));
        dias +=(anos * 365) +  (mes*30);

        JOptionPane.showMessageDialog(null, 
        String.format("Sua idade em dias é %d", dias));

    }
}
