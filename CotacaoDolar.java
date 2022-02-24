import javax.swing.JOptionPane;

public class CotacaoDolar {
    public static void main(String[] args) {
    // Ler a cotação do dólar e a quantidade de dólares. Converter para real e mostrar o
    // resultado.

        double cotDolar, qntDolar, real;

        cotDolar = Double.parseDouble(JOptionPane.showInputDialog(
            null,
            String.format("Digite a cotação do dolar U$")));
        qntDolar = Double.parseDouble(JOptionPane.showInputDialog(
            null,
            String.format("Digite quantos doláres você possui:")));
            //1 dolar = 5 reais
            //5 reais = 1 dolar
            real = qntDolar*cotDolar;
        JOptionPane.showMessageDialog(
            null,
            String.format("Com U$%.2f você pode ter R$%.2f",qntDolar,real));
    }
}
