import javax.swing.JOptionPane;

public class Ex11 {
    public static void main(String[] args) {
        // Uma revendedora de carros usados paga a seus funcionários vendedores um salário
        // fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor
        // das vendas por ele efetuadas. Ler o número de carros por ele vendidos, o valor total de
        // suas vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcular e exibir o
        // salário final do vendedor.

        int  carrosVendidos = 0;
        double salario, comissaoFixa, vendasEfetuadas = 5, totalVendas = 0, totalComissao;

        carrosVendidos = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Quantidade de carros vendidos:"));
        totalVendas = Double.parseDouble(JOptionPane.showInputDialog(null,
        "Total das vendas:"));
        salario = Double.parseDouble(JOptionPane.showInputDialog(null,
        "Salário base:"));
        comissaoFixa = Double.parseDouble(JOptionPane.showInputDialog(null,
        "Valor comissão por carro vendido:"));

        totalComissao = carrosVendidos * comissaoFixa;
        totalComissao = totalComissao + (totalVendas * vendasEfetuadas/100);
        salario += totalComissao;
        
        JOptionPane.showMessageDialog(null, 
        String.format("O salário final do vendedor: R$%.2f", 
        salario));

    }
}
