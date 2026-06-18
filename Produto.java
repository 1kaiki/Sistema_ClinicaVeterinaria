public class Produto {

    protected int codigo;
    protected String nome;
    protected double preco;

    public Produto() {

    }

    public Produto(int codigo, String nome, double preco) {

        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void mostrarDados() {

        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);

    }

}