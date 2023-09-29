package persistencia;

import entidades.Paciente;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class GravadorDeDados {
    public static final String ARQUIVO = "pacientes.dat";

    public HashMap<String,Paciente> recuperar() throws IOException{
        ObjectInputStream in = null;
        try{
            in = new ObjectInputStream(new FileInputStream(ARQUIVO));
            return (HashMap<String,Paciente>) in.readObject();
        } catch (Exception e){
            throw new IOException("não foi possivel recuperar os dados do arquivo "+ARQUIVO);
        }
        finally {
            if(in != null){
                in.close();
            }
        }
    }
    public void salvar(Map<String,Paciente> pacientes) throws IOException{
        ObjectOutputStream out = null;
        try{
            out = new ObjectOutputStream(new FileOutputStream(ARQUIVO));
            out.writeObject(pacientes);
        } catch (Exception e){
            e.printStackTrace();
            throw new IOException("Erro ao salvar os dados no arquivo "+ARQUIVO);
        }
    }
}
