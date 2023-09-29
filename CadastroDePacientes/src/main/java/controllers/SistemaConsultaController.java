package controllers;

import entidades.Paciente;
import excecoes.PacienteInexistenteException;
import sistema.SistemaGerenciadorDoSus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SistemaConsultaController  implements ActionListener {
    private SistemaGerenciadorDoSus sistema;
    private JFrame janela;

    public SistemaConsultaController (SistemaGerenciadorDoSus sistema,JFrame janela) {
        this.sistema = sistema;
        this.janela = janela;
    }
    @Override
    public void actionPerformed(ActionEvent e){
            String nome = JOptionPane.showInputDialog(janela,"Informe o nome do paciente");
            try{
              Paciente p = sistema.consultarPaciente(nome);
              JOptionPane.showMessageDialog(janela,p.toString());
              sistema.salvarDados();
            } catch (PacienteInexistenteException ex){
                JOptionPane.showMessageDialog(janela,ex.getMessage());
            }
    }
}
