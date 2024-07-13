import java.util.ArrayList;

public class PessoaService {
    PessoaRepository pr = new PessoaRepository();

    public PessoaService(){
        pr = new PessoaRepository();
    }

    public void cadastraPessoa(String nome, String cpf, String profissao ,String telefone, ArrayList<String> endereços) {
        Pessoa p = new Pessoa(nome, cpf, profissao, telefone, endereços);
        pr.guardarPessoa(p);
    }

    public void removePessoa(String cpf) {
        pr.excluirPessoa(cpf);
    }

    public void trocaProfissao(String cpf, String novaProfissao) {
        Pessoa p = pr.getPessoa(cpf);
        p.setProfissao(novaProfissao);
    }
    
    public void trocaTelefone (String cpf, String novoTelefone) {
        Pessoa p = pr.getPessoa(cpf);
        p.setTelefone(novoTelefone);
    }

    public void adicionaEndereco(String cpf, String novoEndereco) {
        Pessoa p = pr.getPessoa(cpf);
        p.adicionaEndereco(novoEndereco);
    }
}
