import javax.swing.JOptionPane;

public class PagamentoComissao {
    public static void main(String[] args) {
        //Calcular o pagamento de comissão de vendedores de peças, levando-se em
        // consideração que sua comissão será de 5% do total da venda e que você tem os seguintes
        // dados: preço unitário da peça e quantidade vendida.

        double precoProduto, comissao, resultado;
        int qntItem;

        precoProduto = Double.parseDouble(JOptionPane.showInputDialog("Qual o preço do produto?"));
        qntItem = Integer.parseInt(JOptionPane.showInputDialog("Quantos itens desse produto foi vendido?"));
        resultado = precoProduto * qntItem;
        comissao = resultado - (resultado * 5/100);
        JOptionPane.showMessageDialog(
            null,
            String.format("Comissão vendedor\n 5%% do valor total da venda: R$%.2f",comissao));
        
    }
}
