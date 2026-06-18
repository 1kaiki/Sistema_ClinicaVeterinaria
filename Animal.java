public class Animal {

    protected int codigo;
    protected String nome;
    protected int idade;

    public Animal() {

    }

    public Animal(int codigo, String nome, int idade) {
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void mostrarDados() {

        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

    }

}