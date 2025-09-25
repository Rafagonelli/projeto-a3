public class Bibliotecario extends Pessoa {
    public Bibliotecario(String nome, String cpf, String email) {
        super(nome, cpf, email);
    }

    @Override
    public void exibirPerfil() {
        System.out.println("Bibliotecário: " + getNome());
    }
}


