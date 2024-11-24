import java.util.ArrayList;

public class Cliente {

    // ArrayList para armazenar os clientes cadastrados
    private static ArrayList<Cliente> cadastrosCliente = new ArrayList<>();

    // Atributos da classe Cliente
    private String nome;
    private String email;
    private String telefone;

    // Construtor para inicializar um Cliente
    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    // Getters e Setters para os atributos da classe
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Método para adicionar um cliente ao ArrayList
    public void adicionarCadastro(Cliente cliente) {
        cadastrosCliente.add(cliente);
    }

    // Método para obter a lista de cadastros de clientes
    public ArrayList<Cliente> getCadastrosCliente() {
        return cadastrosCliente;
    }
}
