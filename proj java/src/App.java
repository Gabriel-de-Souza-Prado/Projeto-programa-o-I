public class App {
    public static void main(String[] args) throws Exception {
        
        Produto produto1 = new Produto();
        produto1.setNome("Notebook");
        produto1.setMarca("Dell");
        produto1.setQuantidade(10);
        produto1.setPreco(3500.00);
        

        Produto produto2 = new Produto();
        produto2.setNome("Smartphone");
        produto2.setMarca("Samsung");
        produto2.setQuantidade(20);
        produto2.setPreco(2500.00);

        Venda venda = new Venda();
        venda.setNumerovenda(1);
        venda.setProduto(produto1);
        venda.setDataVenda(java.time.LocalDate.now());

        venda.imprimirvendas();
            


    }
}
