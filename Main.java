import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando usuários
        Aluno aluno1 = new Aluno("Maria", "123.456.789-00", "maria@email.com", "2023001");
        Professor prof1 = new Professor("João", "987.654.321-00", "joao@email.com", "Computação");
        Bibliotecario bib = new Bibliotecario("Ana", "111.222.333-44", "ana@biblioteca.com");

        // Criando livros
        Livro livro1 = new Livro("Java Avançado", "Autor A", "ISBN001");
        Livro livro2 = new Livro("Banco de Dados", "Autor B", "ISBN002");

        // Lista de empréstimos
        List<Emprestimo> emprestimos = new ArrayList<>();

        // Emprestando livro para aluno
        Emprestimo e1 = new Emprestimo(aluno1, livro1);
        emprestimos.add(e1);

        // Emprestando livro para professor
        Emprestimo e2 = new Emprestimo(prof1, livro2);
        emprestimos.add(e2);

        // Exibindo perfis e empréstimos
        aluno1.exibirPerfil();
        prof1.exibirPerfil();
        bib.exibirPerfil();

        System.out.println("\n--- Empréstimos Atuais ---");
        for (Emprestimo e : emprestimos) {
            System.out.println(e);
        }

        // Devolução de livro
        e1.devolverLivro();
    }
}
