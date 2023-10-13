package sistema;

import entidades.Paciente;
import entidades.Tratamentos;
import excecoes.PacienteInexistenteException;
import excecoes.PacienteJaCadastradoException;
import persistencia.GravadorDeDados;

import java.util.*;

public class SistemaGerenciadorDoSus implements SistemaGerenciadorHospitalar{

    private Map<String,Paciente> pacientes;
    private GravadorDeDados gravadorDeDados = new GravadorDeDados();

    public SistemaGerenciadorDoSus() {
        this.pacientes = new HashMap<>();
        recuperarDados();
    }

    public void salvarDados(){
        try{
            gravadorDeDados.salvar(this.pacientes);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void recuperarDados(){
        try{
            this.pacientes = gravadorDeDados.recuperar();
        } catch (Exception e){
            System.out.println(e.getMessage() );
        }
    }
    @Override
    public String gerarMatricula(){
        Random ran = new Random();
        String matricula = "";
        for(int i = 0;i<8;i++){
            matricula += ran.nextInt(10);
        }
        return matricula;
    }
    @Override
    public void cadastrar(Paciente p) throws PacienteJaCadastradoException {
        for(Paciente paciente : this.pacientes.values()){
            if(paciente.getCpf().equals(p.getCpf())){
                throw new PacienteJaCadastradoException("Este paciente já esta cadastrado");
            }
        }
        p.setMatricula(gerarMatricula());
        this.pacientes.put(p.getMatricula(),p);
    }

    @Override
    public void remover(String matricula) throws PacienteInexistenteException {
        if(this.pacientes.get(matricula) == null) throw new PacienteInexistenteException("Este paciente não existe no sistema");
            this.pacientes.remove(matricula);
    }

    @Override
    public Paciente consultarPaciente(String nome) throws PacienteInexistenteException {
        for(Paciente paciente: this.pacientes.values()){
            if(paciente.getNome().equals(nome)){
               return paciente;
            }
        }
        throw new PacienteInexistenteException("Este paciente não está cadastrado");


    }

    @Override
    public List<Paciente> consultarPacientesTratandoDe(Tratamentos t) {
        List<Paciente> pacientesEmTratamento = new ArrayList<>();
        for(Paciente p: this.pacientes.values()){
           if(p.getTratamento().equals(t)) pacientesEmTratamento.add(p);
       }
        return pacientesEmTratamento;
    }

    public Map<String, Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(Map<String, Paciente> pacientes) {
        this.pacientes = pacientes;
    }
}
