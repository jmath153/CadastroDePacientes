package controllers;

import excecoes.PacienteInexistenteException;
import sistema.SistemaGerenciadorDoSus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SistemaRemoverController implements ActionListener {
    private SistemaGerenciadorDoSus sistema;
    private JFrame janela;

    public SistemaRemoverController (SistemaGerenciadorDoSus sistema,JFrame janela) {
        this.sistema = sistema;
        this.janela = janela;
    }
    @Override
    public void actionPerformed(ActionEvent e){
            String matricula = JOptionPane.showInputDialog(janela,"Informe a matrícula do paciente a ser removido");
            try {
                sistema.remover(matricula);
                JOptionPane.showMessageDialog(janela,"Paciente removido com sucesso");
                sistema.salvarDados();
            } catch (PacienteInexistenteException ex){
                JOptionPane.showMessageDialog(janela,ex.getMessage());
            }
    }
}
