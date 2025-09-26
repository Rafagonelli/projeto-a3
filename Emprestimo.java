import java.time.LocalDate;

public class Emprestimo {
    private Pessoa usuario;
    private Livro livro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    // Construtor que tenta emprestar o livro
    public Emprestimo(Pessoa usuario, Livro livro) throws Exception {
        if (!livro.isDisponivel()) {
            // Se o livro já estiver emprestado, lança uma exceção
            throw new Exception("O livro '" + livro.getTitulo() + "' já está emprestado!");
        }

        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucao = dataEmprestimo.plusDays(7);
        livro.setDisponivel(false); // marca o livro como emprestado
    }

    public void devolverLivro() {
        livro.setDisponivel(true);
        System.out.println("Livro devolvido: " + livro.getTitulo());
    }

    @Override
    public String toString() {
        return "Usuário: " + usuario.getNome() + " | Livro: " + livro.getTitulo() +
               " | Devolução até: " + dataDevolucao;
    }
}
