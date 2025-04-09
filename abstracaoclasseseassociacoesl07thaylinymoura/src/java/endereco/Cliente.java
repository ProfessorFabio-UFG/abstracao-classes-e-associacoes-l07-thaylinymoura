package java.endereco;
import java.util.List;
import java.util.ArrayList;

public class Cliente {


    private  String nome;
    private int cpf;
    List<Endereco> endereco;


    public Cliente(String nome, int cpf, List<Endereco> endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public List<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }


    public void addEndereco(Endereco endereco) {
        this.endereco.add(endereco);
    }
}
