import javax.swing.JOptionPane;

public class CustoCarro {
    public static void main(String[] args) {
        // O custo de um carro novo ao consumidor é a soma do custo de fábrica com a
        // porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o
        // percentual do distribuidor seja de 28% e os impostos de 45%, ler o custo de fábrica de um
        // carro, calcular e escrever o custo final ao consumidor.

        double valorCarro, resultado, pDistribuidora = 28, pImpostos=45;
        
        valorCarro = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do carro:"));


        pDistribuidora = valorCarro + (valorCarro * pDistribuidora/100);
        pImpostos = valorCarro + (valorCarro * pImpostos/100);
        resultado = valorCarro + pDistribuidora + pImpostos;

        JOptionPane.showMessageDialog(null,
        String.format("O custará ao consumidor: R$%.2f", resultado));
    }
}
