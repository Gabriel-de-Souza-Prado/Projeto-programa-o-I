import java.time.LocalDate;

public class Venda {
    private Produto produto;
    private LocalDate dataVenda;
    private int NumeroVenda;
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public LocalDate getDataVenda() {
        return dataVenda;
    }
    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }
    public int getNumerovenda() {
        return  NumeroVenda;
    }
    public void setNumerovenda(int numeroVenda) {
        NumeroVenda = numeroVenda;
    }

    public void imprimirvendas(){
        System.out.println("Detalhes da Venda:");
            System.out.println("Produto: " + getProduto().getNome());
            System.out.println("Marca: " + getProduto().getMarca());
            System.out.println("Quantidade: " + getProduto().getQuantidade());
            System.out.println("Preço: R$ " + getProduto().getPreco());
            System.out.println("Número da Venda: " + getNumerovenda());
            System.out.println("Data da Venda: " + getDataVenda());
    }
    
}
