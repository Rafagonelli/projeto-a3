import java.time.LocalDate;

public class Emprestimo {
    private Pessoa usuario;
    private Livro livro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Pessoa usuario, Livro livro) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucao = dataEmprestimo.plusDays(7); // prazo padrão de 7 dias
        livro.setDisponivel(false);
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
