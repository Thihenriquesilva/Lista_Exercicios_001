import javax.swing.JOptionPane;//pacote gráfico

public class Soma {
    //atalho main
    public static void main(String[] args) {
        //declaração de variáveis
            //Float(4bytes) e Double(8bytes)
        double n1, n2, resultado;
        //entrda de dados
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primero valor: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        //processamento
        resultado = n1 + n2;
        // saida
        // JOptionPane.showMessageDialog(null,resultado);
        //OU
        // String s = n1 + " + " + n2 + " = " + resultado;
        // JOptionPane.showMessageDialog(null,s);
        // //OU
        // JOptionPane.showMessageDialog(null,n1 + " + " + n2 + " = " + resultado);
        // String s = String.format("%.2f + %.2f = %.2f\n", n1,n2,resultado);
        // JOptionPane.showMessageDialog(null,s);
        JOptionPane.showMessageDialog(
            null,
            String.format(
                "%.2f + %.2f = %.2f\n",n1,n2,resultado));
    }
}
