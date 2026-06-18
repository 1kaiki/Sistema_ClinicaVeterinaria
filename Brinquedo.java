public class Brinquedo extends Produto {

    private String material;
    private String porteIndicado;

    public Brinquedo() {

    }

    public Brinquedo(int codigo, String nome, double preco, String material, String porteIndicado) {

        super(codigo, nome, preco);

        this.material = material;
        this.porteIndicado = porteIndicado;

    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPorteIndicado() {
        return porteIndicado;
    }

    public void setPorteIndicado(String porteIndicado) {
        this.porteIndicado = porteIndicado;
    }

    @Override
    public void mostrarDados() {

        super.mostrarDados();

        System.out.println("Tipo: Brinquedo");
        System.out.println("Material: " + material);
        System.out.println("Porte indicado: " + porteIndicado);

    }

}