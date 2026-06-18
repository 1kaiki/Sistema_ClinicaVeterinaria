public class Gato extends Animal {

    private String raca;
    private String pelagem;

    public Gato() {

    }

    public Gato(int codigo, String nome, int idade, String raca, String pelagem) {

        super(codigo, nome, idade);

        this.raca = raca;
        this.pelagem = pelagem;

    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }

    @Override
    public void mostrarDados() {

        super.mostrarDados();

        System.out.println("Tipo: Gato");
        System.out.println("Raça: " + raca);
        System.out.println("Pelagem: " + pelagem);

    }

}