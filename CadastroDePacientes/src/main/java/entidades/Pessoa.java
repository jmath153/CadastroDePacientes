package entidades;

import java.io.Serializable;
import java.util.Objects;

public class Pessoa implements Serializable {
    private String nome;
    private String cpf;
    private String RG;
    private String dataDeNascimento;
    private String email;
    private String telefone;
    private Endereco end;

    public Pessoa(String nome, String cpf, String RG, String dataDeNascimento, String email, String telefone, Endereco end) {
        this.nome = nome;
        this.cpf = cpf;
        this.RG = RG;
        this.dataDeNascimento = dataDeNascimento;
        this.email = email;
        this.telefone = telefone;
        this.end = end;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) && Objects.equals(cpf, pessoa.cpf) && Objects.equals(RG, pessoa.RG) && Objects.equals(dataDeNascimento, pessoa.dataDeNascimento) && Objects.equals(email, pessoa.email) && Objects.equals(telefone, pessoa.telefone) && Objects.equals(end, pessoa.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, RG, dataDeNascimento, email, telefone, end);
    }
}
