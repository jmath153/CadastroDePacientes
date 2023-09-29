package sistema;

import entidades.Paciente;
import entidades.Tratamentos;
import excecoes.PacienteInexistenteException;
import excecoes.PacienteJaCadastradoException;

import java.util.List;

public interface SistemaGerenciadorHospitalar {
   void cadastrar(Paciente p) throws PacienteJaCadastradoException;
   void remover(String matricula) throws PacienteInexistenteException;
   Paciente consultarPaciente(String nome) throws PacienteInexistenteException;
   List<Paciente> consultarPacientesTratandoDe(Tratamentos t);
   String gerarMatricula();


}
