package secao11;

public class Livro {
    
    private String titulo;
    private String autor;
    private double preco;

    //fallback
    public Livro() {
        this.titulo = "titulo";
        this.autor = "autor";
        this.preco = 10.00;
    }

    //override
    public Livro(String tittulo, String autor, double preco) {
        this.titulo = tittulo;
        this.autor = autor;
        this.preco = preco;
    }

    public void exibirInfo() {
        System.out.println("Titulo: " + titulo + " Autor: " + autor + " Preço: " + preco);
    }
}
