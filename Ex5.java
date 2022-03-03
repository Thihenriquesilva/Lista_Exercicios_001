import javax.swing.JOptionPane;

public class AreaRetangulo {
    public static void main(String[] args) {
        // Ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.//

        int base = 0, altura = 0, area;

        base = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a base do Retângulo: "));
        altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a altura do Retângulo: "));
        area = base * altura;

        JOptionPane.showMessageDialog(null, String.format(
            "A área do retângulo de base %d e altura %d é: %d", base,altura,area));


    }
}
