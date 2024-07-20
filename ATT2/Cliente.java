package ATT2;

public class Cliente {
    private String nome;
    private String telefone;
    private String cpf; 


    public Cliente(String nome,String telefone, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

}
