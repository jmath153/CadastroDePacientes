package entidades;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Paciente extends Pessoa implements Serializable {

    private String matricula;
    private List<Tratamentos> tratamento;

    public Paciente(String nome, String cpf, String RG, String dataDeNascimento, String email, String telefone, Endereco end, String matricula, List<Tratamentos> tratamento) {
        super(nome, cpf, RG, dataDeNascimento, email, telefone, end);
        this.tratamento = tratamento;
        this.matricula = null;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<Tratamentos> getTratamento() {
        return tratamento;
    }

    public void setTratamento(List<Tratamentos> tratamento) {
        this.tratamento = tratamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Paciente paciente = (Paciente) o;
        return Objects.equals(matricula, paciente.matricula) && tratamento == paciente.tratamento;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), matricula, tratamento);
    }

    @Override
    public String toString() {
        return "Paciente: "+this.getNome()+" Matricula: "+this.getMatricula()+"\n Dados pessoais\n"+
            "cpf "+this.getCpf()+"\nRg "+this.getRG()+"\nData de nascimento "+this.getDataDeNascimento()+"\nEmail "+
                this.getEmail()+"\nTelefone "+this.getTelefone()+"\n Dados Médicos\n"+this.getTratamento().toString();
    }
}







