import javax.swing.JOptionPane;

public class Ex2 {
    public static void main(String[] args) {
        //Ler 4 números, calcular o quadrado para cada um, somar todos os quadrados e mostrar o
        //resultado

        int n1,n2,n3,n4, resultado;

        n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o 1º número:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o 2º número:"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o 3º número:"));
        n4 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o 4º número:"));

        n1*=n1;
        n2*=n2;
        n3*=n3;
        n4*=n4;
        resultado = n1 + n2+ n3 + n4;
        JOptionPane.showMessageDialog(
            null, 
            String.format("O resultado da soma dos quadrados dos números informados é %d",resultado));
        // resultado = (n1*n1) + (n2*n2) + (n3*n3) + (n4*n4);
    }
}
