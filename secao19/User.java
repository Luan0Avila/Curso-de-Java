package secao19;

public class User {
    @NotEmpty(message = "O campo nome não pode ser vazio")
    private String nome;
    @NotEmpty
    private String email;

    public User(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
}
