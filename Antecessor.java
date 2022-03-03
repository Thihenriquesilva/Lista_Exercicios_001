import javax.swing.JOptionPane;

public class Antecessor {
    public static void main(String[] args) {
        //Ler um valor inteiro e exibir seu antecessor
        int n =0,antecessor;

        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro: "));
        antecessor = n-1;
        JOptionPane.showMessageDialog(
            null, 
            String.format(
                "O antecessor de %d é %d.", n,antecessor));
    }
}
