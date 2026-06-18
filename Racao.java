public class Racao extends Produto {

    private String marca;
    private String peso;

    public Racao() {

    }

    public Racao(int codigo, String nome, double preco, String marca, String peso) {

        super(codigo, nome, preco);

        this.marca = marca;
        this.peso = peso;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    @Override
    public void mostrarDados() {

        super.mostrarDados();

        System.out.println("Tipo: Ração");
        System.out.println("Marca: " + marca);
        System.out.println("Peso: " + peso);

    }

}