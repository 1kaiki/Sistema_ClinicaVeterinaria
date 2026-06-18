public class Cao extends Animal {

    private String raca;
    private String porte;

    public Cao() {

    }

    public Cao(int codigo, String nome, int idade, String raca, String porte) {

        super(codigo, nome, idade);

        this.raca = raca;
        this.porte = porte;

    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    @Override
    public void mostrarDados() {

        super.mostrarDados();

        System.out.println("Tipo: Cão");
        System.out.println("Raça: " + raca);
        System.out.println("Porte: " + porte);

    }

}