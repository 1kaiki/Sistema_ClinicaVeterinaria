public class Venda {

    private int codigo;
    private String data;
    private int codigoAnimal;
    private int codigoProduto;
    private int quantidade;
    private double total;

    public Venda() {

    }

    public Venda(int codigo, String data, int codigoAnimal, int codigoProduto, int quantidade, double total) {

        this.codigo = codigo;
        this.data = data;
        this.codigoAnimal = codigoAnimal;
        this.codigoProduto = codigoProduto;
        this.quantidade = quantidade;
        this.total = total;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getCodigoAnimal() {
        return codigoAnimal;
    }

    public void setCodigoAnimal(int codigoAnimal) {
        this.codigoAnimal = codigoAnimal;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void mostrarDados() {

        System.out.println("Código da Venda: " + codigo);
        System.out.println("Data: " + data);
        System.out.println("Código do Animal: " + codigoAnimal);
        System.out.println("Código do Produto: " + codigoProduto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Total: R$ " + total);

    }

}