package controllers;

import sistema.SistemaGerenciadorDoSus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SistemaConsultaTratController implements ActionListener {
    private SistemaGerenciadorDoSus sistema;
    private JFrame janela;

    public SistemaConsultaTratController (SistemaGerenciadorDoSus sistema,JFrame janela) {
        this.sistema = sistema;
        this.janela = janela;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        sistema.salvarDados();
    }
}
