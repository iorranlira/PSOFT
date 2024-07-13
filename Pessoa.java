import java.util.*;

public class Pessoa {
    private String nome;
    private String telefone;
    private String cpf; 
    private String profissao;
    private ArrayList<String> endereços;


    public Pessoa(String nome, String cpf, String profissao ,String telefone, ArrayList<String> enderecos) {
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
        this.telefone = telefone;
        this.endereços = enderecos;
    }


    public void setTelefone(String Novotelefone) {
        this.telefone = Novotelefone;
    }

    public void setProfissao(String novaProfissao) {
        this.profissao = novaProfissao;
    }
    
    public void adicionaEndereco(String novoEndereco) {
        this.endereços.add(novoEndereco); 
    }

    public String getNome(){
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public String getTelefone() {
        return telefone;
    }
}