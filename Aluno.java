public class Aluno extends Pessoa {
    private final String matricula;

    public Aluno(String nome, String cpf, String email, String matricula) {
        super(nome, cpf, email);
        this.matricula = matricula;
    }

    public String getMatricula() { return matricula; }

    @Override
    public void exibirPerfil() {
        System.out.println("Aluno: " + getNome() + " | Matrícula: " + matricula);
    }
}

