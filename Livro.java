public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = true;
    }

    public boolean isDisponivel() { return disponivel; }
    public void setDisponivel(boolean disponivel) { this.disponivel = disponivel; }

    public String getTitulo() { return titulo; }

    @Override
    public String toString() {
        return titulo + " - " + autor + " | ISBN: " + isbn + " | Disponível: " + disponivel;
    }
}
