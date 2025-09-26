import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Maria", "123.456.789-00", "maria@email.com", "2023001");
        Professor prof1 = new Professor("João", "987.654.321-00", "joao@email.com", "Computação");
        Bibliotecario bib = new Bibliotecario("Ana", "111.222.333-44", "ana@biblioteca.com");

        Livro livro1 = new Livro("Java Avançado", "Autor A", "ISBN001");
        Livro livro2 = new Livro("Banco de Dados", "Autor B", "ISBN002");

        List<Emprestimo> emprestimos = new ArrayList<>();

        try {
            // ✅ Empréstimo válido
            Emprestimo e1 = new Emprestimo(aluno1, livro1);
            emprestimos.add(e1);

            // ✅ Outro empréstimo válido
            Emprestimo e2 = new Emprestimo(prof1, livro2);
            emprestimos.add(e2);

            // ❌ Tentando emprestar o mesmo livro1 novamente (vai cair no catch)
            Emprestimo e3 = new Emprestimo(prof1, livro1);
            emprestimos.add(e3);

        } catch (Exception e) {
            // Tratamento do erro
            System.out.println("Erro ao realizar empréstimo: " + e.getMessage());
        }

        aluno1.exibirPerfil();
        prof1.exibirPerfil();
        bib.exibirPerfil();

        System.out.println("\n--- Empréstimos Atuais ---");
        for (Emprestimo e : emprestimos) {
            System.out.println(e);
        }

        // Devolvendo um livro
        emprestimos.get(0).devolverLivro();
    }
}
