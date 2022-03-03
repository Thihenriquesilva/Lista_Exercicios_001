import javax.swing.JOptionPane;

public class TotalEleitores {
    public static void main(String[] args) {
        
        // Ler o número total de eleitores de um município, o número de votos brancos, nulos e
        // válidos. Calcular e escrever o percentual que cada um representa em relação ao total de
        // eleitores.

        double totEleitores, nBrancos, nNulos, nValidos,porcNulos,porcValidos, porcBrancos;
        totEleitores = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantos eleitores existe no município:"));
        nBrancos = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantidade de votos em branco:"));
        nNulos = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantidade de votos nulos:"));
        nValidos = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantidade de votos válidos:"));
        
        porcNulos = 100 * (nNulos/totEleitores);
        porcValidos = 100 * (nValidos/totEleitores);
        porcBrancos = 100 * (nBrancos/totEleitores);
        JOptionPane.showMessageDialog(null,
        String.format("Quantidade de votos nulos: %.2f\nPorcentagem de Votos nulos: %.2f%%", nNulos,porcNulos));
        JOptionPane.showMessageDialog(null,
        String.format("Quantidade de votos válidos: %.2f\nPorcentagem de Votos válidos: %.2f%%", nValidos,porcValidos));
        JOptionPane.showMessageDialog(null,
        String.format("Quantidade de votos em branco: %.2f\nPorcentagem de Votos em branco: %.2f%%", nBrancos,porcBrancos));
    
    }
}
