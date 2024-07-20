import java.util.ArrayList;

public class PessoaController {
    PessoaService ps = new PessoaService();

    public PessoaController() {
        ps = new PessoaService();
    }

    public void cadastraPessoa(String nome, String cpf, String profissao ,String telefone, ArrayList<String> endereços) {
        ps.cadastraPessoa(nome, cpf, profissao, telefone, endereços);
    }

    public void removePessoa(String cpf) {
        ps.removePessoa(cpf);
    }

    public void trocaProfissao(String cpf, String novaProfissao) {
        ps.trocaProfissao(cpf, novaProfissao);
    }
    
    public void trocaTelefone (String cpf, String novoTelefone) {
        ps.trocaTelefone(cpf, novoTelefone);
    }

    public void adicionaEndereco(String cpf, String novoEndereco) {
        ps.adicionaEndereco(cpf, novoEndereco);
    }

}
