//@Repository

import java.util.HashMap;

public class PessoaRepository {
    private HashMap<String, Pessoa> pessoas;

    public PessoaRepository(){
        pessoas = new HashMap<>();
    }

    public String guardarPessoa(Pessoa p) {
        if(pessoas.containsKey(p.getCpf())) {
            return "Pessoa já cadastrada"; 
        }
            pessoas.put(p.getCpf(),p);
            return "Cadastro realizado";
    }

    public String excluirPessoa(String cpf) {
        if(pessoas.containsKey(cpf)) {
            pessoas.remove(cpf);
            return "Pessoa removida do sistema.";
        }
            return "Pessoa não existe";
    }


    public Pessoa getPessoa(String cpf) {
        if (pessoas.containsKey(cpf)) {
            return pessoas.get(cpf);
        }
            return null;
    }


} 
