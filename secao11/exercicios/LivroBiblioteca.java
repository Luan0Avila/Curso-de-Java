package secao11.exercicios;

public class LivroBiblioteca {
    
    private String titulo;
    private String autor;
    private boolean disponivel = true;

    public String getTitulo(){
        return titulo;
    }

        public void setTitulo(String titulo){
                if (titulo != null && !titulo.isEmpty()) {
            this.titulo = titulo;
        } else {
            System.out.println("Titulo inválido.");
        }
    }

    public boolean estaDisponivel() {
        return disponivel;
    }

    public void pegarEmprestado() {
        if (disponivel) {
            System.out.println("O livro está disponivel, pode pegar emprestado o livro " + titulo + "!");
            disponivel = false;
        } else {
            System.out.println("O livro " + titulo + " não está disponivel no momento");
        }
    }

    public void devolver() {
                if (!disponivel) {
            System.out.println("Você devolveu o livro " + titulo);
            disponivel = true;
        } else {
            System.out.println("O livro " + titulo + " não foi emprestado!");
        }
    }

        public  void setAutor(String autor) {
        if (autor != null && !autor.isEmpty()) {
            this.autor= autor;
        } else {
            System.out.println("Autor inválido!");
        }
        }

        public String getAutor() {
            return autor;
        }


}
