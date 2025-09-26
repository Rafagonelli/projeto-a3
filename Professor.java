public class Professor extends Pessoa {
    private final String departamento;

    public Professor(String nome, String cpf, String email, String departamento) {
        super(nome, cpf, email);
        this.departamento = departamento;
    }

    @Override
    public void exibirPerfil() {
        System.out.println("Professor: " + getNome() + " | Departamento: " + departamento);
    }
}
