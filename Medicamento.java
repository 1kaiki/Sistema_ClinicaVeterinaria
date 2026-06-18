public class Medicamento extends Produto {

    private String fabricante;
    private String validade;

    public Medicamento() {

    }

    public Medicamento(int codigo, String nome, double preco, String fabricante, String validade) {

        super(codigo, nome, preco);

        this.fabricante = fabricante;
        this.validade = validade;

    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    @Override
    public void mostrarDados() {

        super.mostrarDados();

        System.out.println("Tipo: Medicamento");
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Validade: " + validade);

    }

}